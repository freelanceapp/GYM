package del.gym.ui.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
    private List<MyRoutineModal> myRoutineList = new ArrayList<>();
    private Dialog dialogRoutine;

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
        ((ImageView) findViewById(R.id.imgBack)).setOnClickListener(this);
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
        databaseHandler = new DatabaseHandler(mContext);
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

        ((Button) dialogRoutine.findViewById(R.id.btnSave)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strExercise = ((EditText) dialogRoutine.findViewById(R.id.edtExercise)).getText().toString();
                String strRepetition = ((EditText) dialogRoutine.findViewById(R.id.edtRepetitions)).getText().toString();
                String strSet = ((EditText) dialogRoutine.findViewById(R.id.edtSet)).getText().toString();
                String strWeight = ((EditText) dialogRoutine.findViewById(R.id.edtWeight)).getText().toString();

                databaseHandler.addItemCart(new MyRoutineModal(strExercise, strRepetition, strSet, strWeight));

                if (databaseHandler.getContactsCount()) {
                    myRoutineList = databaseHandler.getAllUrlList();
                }
                setMyRoutineList();
                routineListAdapter.notifyDataSetChanged();
                dialogRoutine.dismiss();
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
        RecyclerView recyclerViewMyRoutine = (RecyclerView) findViewById(R.id.recyclerViewMyRoutine);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewMyRoutine.setLayoutManager(mLayoutManager);
        recyclerViewMyRoutine.setItemAnimator(new DefaultItemAnimator());
        recyclerViewMyRoutine.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        routineListAdapter = new MyRoutineListAdapter(mContext, myRoutineList);
        recyclerViewMyRoutine.setAdapter(routineListAdapter);
        routineListAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBack:
                finish();
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
        }
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
}
