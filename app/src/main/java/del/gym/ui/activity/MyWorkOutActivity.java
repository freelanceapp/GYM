package del.gym.ui.activity;

import android.app.Dialog;
import android.os.Bundle;
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
import del.gym.adapter.MyRoutineListAdapter;
import del.gym.database.DatabaseHandler;
import del.gym.modal.MyRoutineModal;
import del.gym.utils.BaseActivity;

public class MyWorkOutActivity extends BaseActivity implements View.OnClickListener {

    /* My routine */
    private String DATABASE_NAME = "routine.db";
    private MyRoutineListAdapter routineListAdapter;
    private DatabaseHandler databaseHandler;
    private List<MyRoutineModal> myRoutineList = new ArrayList<>();
    private Dialog dialogRoutine;
    private String strDays = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_workout);
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

        if (strName.equals("MyWorkout")) {
            ((TextView) findViewById(R.id.tvTitle)).setText("My Workout");
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

    private void setMyRoutineList() {
        RecyclerView recyclerViewMyRoutine = (RecyclerView) findViewById(R.id.recyclerViewMyRoutine);
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
            case R.id.fabAddMyRoutine:
                reviewDialog();
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
}
