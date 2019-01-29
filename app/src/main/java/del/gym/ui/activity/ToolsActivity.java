package del.gym.ui.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import del.gym.R;
import del.gym.adapter.LapTimeListAdapter;
import del.gym.adapter.MyRoutineListAdapter;
import del.gym.database.DatabaseHandler;
import del.gym.modal.MyRoutineModal;
import del.gym.modal.lap_modal.LapTimeModal;
import del.gym.utils.BaseActivity;

public class ToolsActivity extends BaseActivity implements View.OnClickListener {

    /* Interval timer */
    private List<LapTimeModal> lapTimeList = new ArrayList<>();
    private LapTimeListAdapter lapTimeListAdapter;
    private long time = 0;
    private Handler h;

    /* My routine */
    private MyRoutineListAdapter routineListAdapter;
    private DatabaseHandler databaseHandler;
    private String DATABASE_NAME = "my_routine.db";
    private List<MyRoutineModal> myRoutineList = new ArrayList<>();
    private Dialog dialogRoutine;
    private String strDays = "";
    private RecyclerView recyclerViewMyRoutine;

    /* CountdownTimer */
    private CountDownTimer cTimer;
    private boolean isTimerStart = false;
    private TextView tvChronoMinute;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        mContext = this;

        getIntentData();
    }

    private void getIntentData() {
        if (getIntent() == null)
            return;
        tvChronoMinute = (TextView) findViewById(R.id.tvChronoMinute);
        ((ImageView) findViewById(R.id.imgBack)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnChronoCancel)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnChronoStart)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnStart)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnPause)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnLap)).setOnClickListener(this);

        String strName = getIntent().getStringExtra("name");

        if (strName.equals("interval_timer")) {
            ((FloatingActionButton) findViewById(R.id.fabAddMyRoutine)).hide();
            ((LinearLayout) findViewById(R.id.llIntervalTime)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llReminder)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llChronometer)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llMyRoutine)).setVisibility(View.GONE);
            setLapList();
        } else if (strName.equals("reminder")) {
            ((FloatingActionButton) findViewById(R.id.fabAddMyRoutine)).hide();
            ((LinearLayout) findViewById(R.id.llReminder)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llIntervalTime)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llChronometer)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llMyRoutine)).setVisibility(View.GONE);
        } else if (strName.equals("chronometer")) {
            ((FloatingActionButton) findViewById(R.id.fabAddMyRoutine)).hide();
            ((LinearLayout) findViewById(R.id.llChronometer)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llIntervalTime)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llReminder)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llMyRoutine)).setVisibility(View.GONE);
        } else if (strName.equals("my_routine")) {
            ((FloatingActionButton) findViewById(R.id.fabAddMyRoutine)).setOnClickListener(this);
            ((FloatingActionButton) findViewById(R.id.fabAddMyRoutine)).show();
            ((LinearLayout) findViewById(R.id.llMyRoutine)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llIntervalTime)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llReminder)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llChronometer)).setVisibility(View.GONE);
            getMyRoutineData();
        }
    }

    private void getMyRoutineData() {
        databaseHandler = new DatabaseHandler(mContext, DATABASE_NAME);
        if (databaseHandler.getContactsCount()) {
            myRoutineList = databaseHandler.getAllUrlList();
        }
        setMyRoutineList();
    }

    private void reviewDialog() {
        dialogRoutine = new Dialog(mContext);
        dialogRoutine.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogRoutine.setContentView(R.layout.dialog_my_routine);

        dialogRoutine.setCanceledOnTouchOutside(true);
        dialogRoutine.setCancelable(true);
        if (dialogRoutine.getWindow() != null)
            dialogRoutine.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        String[] daysList = {"Select days", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Spinner spinnerDays = (Spinner) dialogRoutine.findViewById(R.id.spinnerDays);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, daysList);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDays.setAdapter(aa);
        spinnerDays.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                strDays = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ((Button) dialogRoutine.findViewById(R.id.btnSave)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strExercise = ((EditText) dialogRoutine.findViewById(R.id.edtExercise)).getText().toString();
                String strRepetition = ((EditText) dialogRoutine.findViewById(R.id.edtRepetitions)).getText().toString();
                String strSet = ((EditText) dialogRoutine.findViewById(R.id.edtSet)).getText().toString();
                String strWeight = ((EditText) dialogRoutine.findViewById(R.id.edtWeight)).getText().toString();

                if (strDays.equals("Select days")) {
                    Toast.makeText(mContext, "Please select day!!", Toast.LENGTH_SHORT).show();
                } else {
                    databaseHandler.addItemCart(new MyRoutineModal(strExercise, strRepetition, strSet, strWeight, strDays));
                    if (databaseHandler.getContactsCount()) {
                        myRoutineList = databaseHandler.getAllUrlList();
                    }
                    setMyRoutineList();
                    routineListAdapter.notifyDataSetChanged();
                    dialogRoutine.dismiss();
                }
            }
        });

        ((Button) dialogRoutine.findViewById(R.id.btnCancel)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogRoutine.dismiss();
            }
        });

        Window window = dialogRoutine.getWindow();
        window.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        dialogRoutine.show();
    }

    private void setLapList() {
        RecyclerView recyclerViewLap = (RecyclerView) findViewById(R.id.recyclerViewLap);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewLap.setLayoutManager(mLayoutManager);
        recyclerViewLap.setItemAnimator(new DefaultItemAnimator());
        recyclerViewLap.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        lapTimeListAdapter = new LapTimeListAdapter(mContext, lapTimeList);
        recyclerViewLap.setAdapter(lapTimeListAdapter);
    }

    private void setMyRoutineList() {
        recyclerViewMyRoutine = (RecyclerView) findViewById(R.id.recyclerViewMyRoutine);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewMyRoutine.setLayoutManager(mLayoutManager);
        recyclerViewMyRoutine.setItemAnimator(new DefaultItemAnimator());
        recyclerViewMyRoutine.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        routineListAdapter = new MyRoutineListAdapter(mContext, myRoutineList, this);
        recyclerViewMyRoutine.setAdapter(routineListAdapter);
        routineListAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBack:
                finish();
                break;
            case R.id.imgDelete:
                int position = Integer.parseInt(v.getTag().toString());
                MyRoutineModal myRoutine = myRoutineList.get(position);
                databaseHandler.deleteWorkout(myRoutine);
                if (databaseHandler.getContactsCount()) {
                    myRoutineList = databaseHandler.getAllUrlList();
                } else {
                    myRoutineList.clear();
                }
                setMyRoutineList();
                routineListAdapter.notifyDataSetChanged();
                break;
            case R.id.btnChronoStart:
                String strMinutes = ((EditText) findViewById(R.id.edtMinutes)).getText().toString();
                if (strMinutes.isEmpty()) {
                    Toast.makeText(mContext, "Please enter minutes", Toast.LENGTH_SHORT).show();
                } else if (strMinutes.equals("0")) {
                    Toast.makeText(mContext, "Please enter minutes", Toast.LENGTH_SHORT).show();
                } else {
                    isTimerStart = true;
                    startTimer();
                }
                break;
            case R.id.btnChronoCancel:
                if (isTimerStart) {
                    cTimer.cancel();
                    tvChronoMinute.setText("00:00");
                    isTimerStart = false;
                }
                break;
            case R.id.btnStart:
                intervalTimer();
                break;
            case R.id.btnPause:
                h.removeMessages(0);
                break;
            case R.id.btnLap:
                getLapTime();
                break;
            case R.id.fabAddMyRoutine:
                reviewDialog();
                break;
            case R.id.cardviewMyRoutine:
                int pos = Integer.parseInt(v.getTag().toString());
                MyRoutineModal myRoutineModal = myRoutineList.get(pos);
                viewMyWorkOutData(myRoutineModal);
                break;
        }
    }

    private void viewMyWorkOutData(MyRoutineModal myRoutineModal) {
        dialogRoutine = new Dialog(mContext);
        dialogRoutine.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogRoutine.setContentView(R.layout.dialog_view_my_routine);

        dialogRoutine.setCanceledOnTouchOutside(true);
        dialogRoutine.setCancelable(true);
        if (dialogRoutine.getWindow() != null)
            dialogRoutine.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        ((EditText) dialogRoutine.findViewById(R.id.edtExercise)).setText(myRoutineModal.getExercise());
        ((EditText) dialogRoutine.findViewById(R.id.edtRepetitions)).setText(myRoutineModal.getRepetition());
        ((EditText) dialogRoutine.findViewById(R.id.edtSet)).setText(myRoutineModal.getCountSet());
        ((EditText) dialogRoutine.findViewById(R.id.edtWeight)).setText(myRoutineModal.getWeight());
        ((EditText) dialogRoutine.findViewById(R.id.edtDay)).setText(myRoutineModal.getDays());

        ((Button) dialogRoutine.findViewById(R.id.btnOk)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogRoutine.dismiss();
            }
        });

        Window window = dialogRoutine.getWindow();
        window.setLayout(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        dialogRoutine.show();
    }

    private void intervalTimer() {
        h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                time += 1;

                long minute = 0;
                long finalSecond = 0;
                long seconds = 0;
                long milliseconds = 0;

                if (time >= 60) {
                    seconds = time / 60;
                    milliseconds = time % 60;
                } else {
                    seconds = 0;
                    milliseconds = time;
                }

                if (seconds >= 60) {
                    minute = seconds / 60;
                    finalSecond = seconds % 60;
                } else {
                    minute = 0;
                    finalSecond = seconds;
                }

                if (minute < 10) {
                    ((TextView) findViewById(R.id.tvMinute)).setText("0" + minute);
                } else {
                    ((TextView) findViewById(R.id.tvMinute)).setText("" + minute);
                }

                if (finalSecond < 10) {
                    ((TextView) findViewById(R.id.tvSeconds)).setText("0" + finalSecond);
                } else {
                    ((TextView) findViewById(R.id.tvSeconds)).setText("" + finalSecond);
                }

                if (milliseconds < 10) {
                    ((TextView) findViewById(R.id.tvMilliSeconds)).setText("0" + milliseconds);
                } else {
                    ((TextView) findViewById(R.id.tvMilliSeconds)).setText("" + milliseconds);
                }
                h.postDelayed(this, 1);
            }
        }, 1);
    }

    private void getLapTime() {
        String strMin = ((TextView) findViewById(R.id.tvMinute)).getText().toString();
        String strSecond = ((TextView) findViewById(R.id.tvSeconds)).getText().toString();
        String strMilliSecond = ((TextView) findViewById(R.id.tvMilliSeconds)).getText().toString();

        LapTimeModal timeModal = new LapTimeModal(strMin, strSecond, strMilliSecond);
        lapTimeList.add(timeModal);
        lapTimeListAdapter.notifyDataSetChanged();
    }

    /*Timer*/
    private void startTimer() {
        String strMinutes = ((EditText) findViewById(R.id.edtMinutes)).getText().toString();
        long minutes = 0;
        if (strMinutes.isEmpty() || strMinutes.equals("0")) {
            minutes = 0;
        } else {
            minutes = Long.parseLong(strMinutes);
        }

        minutes = minutes * 60000;
        cTimer = new CountDownTimer(minutes, 1000) {
            public void onTick(long millisUntilFinished) {
                tvChronoMinute.setText((millisUntilFinished / 60000) + ":" + (millisUntilFinished % 60000 / 1000));
            }

            public void onFinish() {
                tvChronoMinute.setText((00));
            }
        };
        cTimer.start();
    }

}
