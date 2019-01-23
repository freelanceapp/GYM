package del.gym.ui.activity.home_menu_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import del.gym.R;
import del.gym.utils.BaseActivity;

public class ExerciseGuideActivity extends BaseActivity implements View.OnClickListener {

    private String strName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_guide);

        getIntentData();
    }

    private void getIntentData() {
        strName = getIntent().getStringExtra("name");
        ((TextView) findViewById(R.id.tvTitle)).setText(strName);

        if (strName.equals("Gym")) {
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.VISIBLE);
        } else if (strName.equals("Bodyweight")) {
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.GONE);
        }

        clickEvent();
    }

    private void clickEvent() {
        ((LinearLayout) findViewById(R.id.llChest)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llBack)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llShoulders)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFrontLeg)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llTriceps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llBiceps)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llChest:
                openExerciseListData("Chest");
                break;
            case R.id.llBack:
                openExerciseListData("Back");
                break;
            case R.id.llShoulders:
                openExerciseListData("Shoulders");
                break;
            case R.id.llFrontLeg:
                openExerciseListData("Leg");
                break;
            case R.id.llTriceps:
                openExerciseListData("Triceps");
                break;
            case R.id.llBiceps:
                openExerciseListData("Biceps");
                break;
        }
    }

    private void openExerciseListData(String strName) {
        Intent intent = new Intent(mContext, ExerciseListActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
