package del.gym.ui.activity.home_menu_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import del.gym.R;
import del.gym.utils.BaseActivity;

public class ExerciseListActivity extends BaseActivity implements View.OnClickListener {

    private String strName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        getIntentData();
    }

    private void getIntentData() {
        strName = getIntent().getStringExtra("name");
        ((TextView) findViewById(R.id.tvTitle)).setText(strName);

        clickEvent();
    }

    private void clickEvent() {
        ((LinearLayout) findViewById(R.id.llFlatChestFly)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFlatChestPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llInclineChestFly)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llInclineChestPress)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llFlatChestFly:
                sendDetail("FlatChestFly");
                break;
            case R.id.llFlatChestPress:
                sendDetail("FlatChestPress");
                break;
            case R.id.llInclineChestFly:
                sendDetail("InclineChestFly");
                break;
            case R.id.llInclineChestPress:
                sendDetail("InclineChestPress");
                break;
        }
    }

    private void sendDetail(String strName) {
        Intent intent = new Intent(mContext, ExerciseDetailActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
