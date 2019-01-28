package del.gym.ui.activity.home_menu_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        if (strName.equals("Home")) {
            ((TextView) findViewById(R.id.tvTitle)).setText("Home Exercise");
        } else {
            ((TextView) findViewById(R.id.tvTitle)).setText(strName);
        }

        if (strName.equals("Gym")) {
            findViewById(R.id.llGym).setVisibility(View.VISIBLE);
        } else if (strName.equals("Bodyweight")) {
            findViewById(R.id.llBodyweight).setVisibility(View.VISIBLE);
        } else if (strName.equals("Battlerope")) {
            findViewById(R.id.llBattlerope).setVisibility(View.VISIBLE);
        } else if (strName.equals("Box")) {
            findViewById(R.id.llBox).setVisibility(View.VISIBLE);
        } else if (strName.equals("Suspension")) {
            findViewById(R.id.llSuspension).setVisibility(View.VISIBLE);
        } else if (strName.equals("Cardio")) {
            findViewById(R.id.llCardio).setVisibility(View.VISIBLE);
        }

        workoutItemVisibility();
        clickEvent();
        workoutItemClickEvent();
    }

    private void workoutItemVisibility() {
        if (strName.equals("Home")) {
            findViewById(R.id.llHome).setVisibility(View.VISIBLE);
        } else if (strName.equals("Calisthenics")) {
            findViewById(R.id.llCalisthenics).setVisibility(View.VISIBLE);
        } else if (strName.equals("FunctionalTraining")) {
            findViewById(R.id.llFunctionalTraining).setVisibility(View.VISIBLE);
        } else if (strName.equals("SuspensionTraining")) {
            findViewById(R.id.llSuspensionTraining).setVisibility(View.VISIBLE);
        }
    }

    private void clickEvent() {
        findViewById(R.id.imgBack).setOnClickListener(this);
        findViewById(R.id.llChest).setOnClickListener(this);
        findViewById(R.id.llBack).setOnClickListener(this);
        findViewById(R.id.llShoulders).setOnClickListener(this);
        findViewById(R.id.llFrontLeg).setOnClickListener(this);
        findViewById(R.id.llTriceps).setOnClickListener(this);
        findViewById(R.id.llBiceps).setOnClickListener(this);

        /*Bodyweight*/
        findViewById(R.id.llSquats).setOnClickListener(this);
        findViewById(R.id.llCrunch).setOnClickListener(this);
        findViewById(R.id.llPullUps).setOnClickListener(this);
        findViewById(R.id.llClapPushups).setOnClickListener(this);
        findViewById(R.id.llHandstand).setOnClickListener(this);

        /*Battlerope*/
        findViewById(R.id.llAlternatingWaves).setOnClickListener(this);
        findViewById(R.id.llDoubleArmWaves).setOnClickListener(this);
        findViewById(R.id.llDoubleArmSlam).setOnClickListener(this);
        findViewById(R.id.llDoubleArmSlamJump).setOnClickListener(this);
        findViewById(R.id.llSnakes).setOnClickListener(this);

        /*Box*/
        findViewById(R.id.llStepUpJumps).setOnClickListener(this);
        findViewById(R.id.llSingleLegJumps).setOnClickListener(this);
        findViewById(R.id.llLateralJumps).setOnClickListener(this);
        findViewById(R.id.llDepthJumps).setOnClickListener(this);
        findViewById(R.id.llStepUps).setOnClickListener(this);

        /*Suspension*/
        findViewById(R.id.llSuspensionSquat).setOnClickListener(this);
        findViewById(R.id.llSuspensionChestPress).setOnClickListener(this);
        findViewById(R.id.llSuspensionTricepsPress).setOnClickListener(this);
        findViewById(R.id.llSuspensionPowerPull).setOnClickListener(this);
        findViewById(R.id.llSuspensionLunge).setOnClickListener(this);

        /*Cardio*/
        findViewById(R.id.llCardioClamshell).setOnClickListener(this);
        findViewById(R.id.llCardioFireHydrant).setOnClickListener(this);
        findViewById(R.id.llCardioSideKick).setOnClickListener(this);
        findViewById(R.id.llCardioSidePlankHip).setOnClickListener(this);
        findViewById(R.id.llCardioStandingOpenGate).setOnClickListener(this);
    }

    private void workoutItemClickEvent() {
        findViewById(R.id.llScissorCrunches).setOnClickListener(this);
        findViewById(R.id.llRopeJump).setOnClickListener(this);
        findViewById(R.id.llInclinePushUp).setOnClickListener(this);
        findViewById(R.id.llHandstandAssist).setOnClickListener(this);
        findViewById(R.id.llMountainClimber).setOnClickListener(this);

        /*Calisthenics*/
        findViewById(R.id.llCalisthenicsPushUps).setOnClickListener(this);
        findViewById(R.id.llCalisthenicsBicycleCrunches).setOnClickListener(this);
        findViewById(R.id.llCalisthenicsChinUps).setOnClickListener(this);
        findViewById(R.id.llCalisthenicsSitUps).setOnClickListener(this);
        findViewById(R.id.llCalisthenicsWidePushups).setOnClickListener(this);

        /*FunctionalTraining*/
        findViewById(R.id.llFunctionalStepsUpJump).setOnClickListener(this);
        findViewById(R.id.llFunctionalAlternatingWaves).setOnClickListener(this);
        findViewById(R.id.llFunctionalBurpees).setOnClickListener(this);
        findViewById(R.id.llFunctionalDoubleArmWaves).setOnClickListener(this);
        findViewById(R.id.llFunctionalJumpingJacks).setOnClickListener(this);

        /*Suspension*/
        findViewById(R.id.llSuspensionTrainPushUp).setOnClickListener(this);
        findViewById(R.id.llSuspensionTrainChestPress).setOnClickListener(this);
        findViewById(R.id.llSuspensionTrainLowRow).setOnClickListener(this);
        findViewById(R.id.llSuspensionTrainSingleArmRow).setOnClickListener(this);
        findViewById(R.id.llSuspensionTrainBiceps).setOnClickListener(this);
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

            /*Home Exercise*/
            case R.id.llScissorCrunches:
                openExerciseDetail("ScissorCrunches");
                break;
            case R.id.llRopeJump:
                openExerciseDetail("RopeJump");
                break;
            case R.id.llInclinePushUp:
                openExerciseDetail("InclinePushUp");
                break;
            case R.id.llHandstandAssist:
                openExerciseDetail("HandstandAssist");
                break;
            case R.id.llMountainClimber:
                openExerciseDetail("MountainClimber");
                break;

            /*Calisthenics*/
            case R.id.llCalisthenicsPushUps:
                openExerciseDetail("CalisthenicsPushUps");
                break;
            case R.id.llCalisthenicsBicycleCrunches:
                openExerciseDetail("CalisthenicsBicycleCrunches");
                break;
            case R.id.llCalisthenicsChinUps:
                openExerciseDetail("CalisthenicsChinUps");
                break;
            case R.id.llCalisthenicsSitUps:
                openExerciseDetail("CalisthenicsSitUps");
                break;
            case R.id.llCalisthenicsWidePushups:
                openExerciseDetail("CalisthenicsWidePushups");
                break;

            /*FunctionalTraining*/
            case R.id.llFunctionalStepsUpJump:
                openExerciseDetail("FunctionalStepsUpJump");
                break;
            case R.id.llFunctionalAlternatingWaves:
                openExerciseDetail("FunctionalAlternatingWaves");
                break;
            case R.id.llFunctionalBurpees:
                openExerciseDetail("FunctionalBurpees");
                break;
            case R.id.llFunctionalDoubleArmWaves:
                openExerciseDetail("FunctionalDoubleArmWaves");
                break;
            case R.id.llFunctionalJumpingJacks:
                openExerciseDetail("FunctionalJumpingJacks");
                break;

            /*Suspension*/
            case R.id.llSuspensionTrainPushUp:
                openExerciseDetail("SuspensionTrainPushUp");
                break;
            case R.id.llSuspensionTrainChestPress:
                openExerciseDetail("SuspensionTrainChestPress");
                break;
            case R.id.llSuspensionTrainLowRow:
                openExerciseDetail("SuspensionTrainLowRow");
                break;
            case R.id.llSuspensionTrainSingleArmRow:
                openExerciseDetail("SuspensionTrainSingleArmRow");
                break;
            case R.id.llSuspensionTrainBiceps:
                openExerciseDetail("SuspensionTrainBiceps");
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
