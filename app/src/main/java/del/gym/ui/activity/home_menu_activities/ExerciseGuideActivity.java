package del.gym.ui.activity.home_menu_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
            ((LinearLayout) findViewById(R.id.llBodyweight)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBattlerope)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBox)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llCardio)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llSuspension)).setVisibility(View.GONE);
        } else if (strName.equals("Bodyweight")) {
            ((LinearLayout) findViewById(R.id.llBodyweight)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBattlerope)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llCardio)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBox)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llSuspension)).setVisibility(View.GONE);
        } else if (strName.equals("Battlerope")) {
            ((LinearLayout) findViewById(R.id.llBattlerope)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llBodyweight)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llCardio)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBox)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llSuspension)).setVisibility(View.GONE);
        } else if (strName.equals("Box")) {
            ((LinearLayout) findViewById(R.id.llBox)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llBattlerope)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBodyweight)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llCardio)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llSuspension)).setVisibility(View.GONE);
        } else if (strName.equals("Suspension")) {
            ((LinearLayout) findViewById(R.id.llSuspension)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llBox)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llCardio)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBattlerope)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBodyweight)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.GONE);
        } else if (strName.equals("Cardio")) {
            ((LinearLayout) findViewById(R.id.llCardio)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llSuspension)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBox)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBattlerope)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBodyweight)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llGym)).setVisibility(View.GONE);
        }

        clickEvent();
    }

    private void clickEvent() {
        ((ImageView) findViewById(R.id.imgBack)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llChest)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llBack)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llShoulders)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFrontLeg)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llTriceps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llBiceps)).setOnClickListener(this);

        /*Bodyweight*/
        ((LinearLayout) findViewById(R.id.llSquats)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llCrunch)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llPullUps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llClapPushups)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llHandstand)).setOnClickListener(this);

        /*Battlerope*/
        ((LinearLayout) findViewById(R.id.llAlternatingWaves)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llDoubleArmWaves)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llDoubleArmSlam)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llDoubleArmSlamJump)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llSnakes)).setOnClickListener(this);

        /*Box*/
        ((LinearLayout) findViewById(R.id.llStepUpJumps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llSingleLegJumps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llLateralJumps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llDepthJumps)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llStepUps)).setOnClickListener(this);

        /*Suspension*/
        ((LinearLayout) findViewById(R.id.llSuspensionSquat)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llSuspensionChestPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llSuspensionTricepsPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llSuspensionPowerPull)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llSuspensionLunge)).setOnClickListener(this);

        /*Cardio*/
        ((LinearLayout) findViewById(R.id.llCardioClamshell)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llCardioFireHydrant)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llCardioSideKick)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llCardioSidePlankHip)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llCardioStandingOpenGate)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBack:
                finish();
                break;
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

            /*Bodyweight*/
            case R.id.llSquats:
                openExerciseDetail("Squats");
                break;
            case R.id.llCrunch:
                openExerciseDetail("Crunch");
                break;
            case R.id.llPullUps:
                openExerciseDetail("PullUps");
                break;
            case R.id.llClapPushups:
                openExerciseDetail("ClapPushups");
                break;
            case R.id.llHandstand:
                openExerciseDetail("Handstand");
                break;

            /*Battlerope*/
            case R.id.llAlternatingWaves:
                openExerciseDetail("AlternatingWaves");
                break;
            case R.id.llDoubleArmWaves:
                openExerciseDetail("DoubleArmWaves");
                break;
            case R.id.llDoubleArmSlam:
                openExerciseDetail("DoubleArmSlam");
                break;
            case R.id.llDoubleArmSlamJump:
                openExerciseDetail("DoubleArmSlamJump");
                break;
            case R.id.llSnakes:
                openExerciseDetail("Snakes");
                break;

            /*Box*/
            case R.id.llStepUpJumps:
                openExerciseDetail("StepUpJumps");
                break;
            case R.id.llSingleLegJumps:
                openExerciseDetail("SingleLegJumps");
                break;
            case R.id.llLateralJumps:
                openExerciseDetail("LateralJumps");
                break;
            case R.id.llDepthJumps:
                openExerciseDetail("DepthJumps");
                break;
            case R.id.llStepUps:
                openExerciseDetail("StepUps");
                break;

            /*Suspension*/
            case R.id.llSuspensionSquat:
                openExerciseDetail("SuspensionSquat");
                break;
            case R.id.llSuspensionChestPress:
                openExerciseDetail("SuspensionChestPress");
                break;
            case R.id.llSuspensionTricepsPress:
                openExerciseDetail("SuspensionTricepsPress");
                break;
            case R.id.llSuspensionPowerPull:
                openExerciseDetail("SuspensionPowerPull");
                break;
            case R.id.llSuspensionLunge:
                openExerciseDetail("SuspensionLunge");
                break;

            /*Cardio*/
            case R.id.llCardioClamshell:
                openExerciseDetail("CardioClamshell");
                break;
            case R.id.llCardioFireHydrant:
                openExerciseDetail("CardioFireHydrant");
                break;
            case R.id.llCardioSideKick:
                openExerciseDetail("CardioSideKick");
                break;
            case R.id.llCardioSidePlankHip:
                openExerciseDetail("CardioSidePlankHip");
                break;
            case R.id.llCardioStandingOpenGate:
                openExerciseDetail("CardioStandingOpenGate");
                break;
        }
    }

    private void openExerciseListData(String strName) {
        Intent intent = new Intent(mContext, ExerciseListActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }

    private void openExerciseDetail(String strName) {
        Intent intent = new Intent(mContext, ExerciseDetailActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
