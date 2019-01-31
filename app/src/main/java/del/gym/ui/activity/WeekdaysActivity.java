package del.gym.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import del.gym.R;
import del.gym.utils.BaseActivity;

public class WeekdaysActivity extends BaseActivity implements View.OnClickListener {

    private String strFrom = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekdays);

        init();
    }

    private void init() {
        strFrom = getIntent().getStringExtra("from");

        findViewById(R.id.imgBack).setOnClickListener(this);
        findViewById(R.id.rlMonday).setOnClickListener(this);
        findViewById(R.id.rlTuesday).setOnClickListener(this);
        findViewById(R.id.rlWednesday).setOnClickListener(this);
        findViewById(R.id.rlThursday).setOnClickListener(this);
        findViewById(R.id.rlFriday).setOnClickListener(this);
        findViewById(R.id.rlSaturday).setOnClickListener(this);
        findViewById(R.id.rlSunday).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBack:
                finish();
                break;
            case R.id.rlMonday:
                if (strFrom.equals("home")) {
                    setIntentData("Monday");
                } else {
                    sendIntentData("Monday");
                }
                break;
            case R.id.rlTuesday:
                if (strFrom.equals("home")) {
                    setIntentData("Tuesday");
                } else {
                    sendIntentData("Tuesday");
                }
                break;
            case R.id.rlWednesday:
                if (strFrom.equals("home")) {
                    setIntentData("Wednesday");
                } else {
                    sendIntentData("Wednesday");
                }
                break;
            case R.id.rlThursday:
                if (strFrom.equals("home")) {
                    setIntentData("Thursday");
                } else {
                    sendIntentData("Thursday");
                }
                break;
            case R.id.rlFriday:
                if (strFrom.equals("home")) {
                    setIntentData("Friday");
                } else {
                    sendIntentData("Friday");
                }
                break;
            case R.id.rlSaturday:
                if (strFrom.equals("home")) {
                    setIntentData("Saturday");
                } else {
                    sendIntentData("Saturday");
                }
                break;
            case R.id.rlSunday:
                if (strFrom.equals("home")) {
                    setIntentData("Sunday");
                } else {
                    sendIntentData("Sunday");
                }
                break;
        }
    }

    private void setIntentData(String data) {
        Intent intent = new Intent(mContext, MyWorkOutActivity.class);
        intent.putExtra("day", data);
        startActivity(intent);
    }

    private void sendIntentData(String data) {
        Intent intent = new Intent(mContext, ToolsActivity.class);
        intent.putExtra("name", "my_routine");
        intent.putExtra("day", data);
        startActivity(intent);
    }
}
