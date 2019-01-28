package del.gym.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import del.gym.R;
import del.gym.ui.activity.home_menu_activities.ExerciseDetailActivity;
import del.gym.ui.activity.home_menu_activities.ExerciseGuideActivity;
import del.gym.utils.BaseFragment;

public class HomeMenuDetailFragment extends BaseFragment implements View.OnClickListener {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_home_menu_detail, container, false);
        init();
        return rootView;
    }

    private void init() {
        mContext = getActivity();

        if (getArguments() == null)
            return;
        Bundle bundle = getArguments();
        String strName = bundle.getString("name");

        if (strName.equals("ExerciseGuide")) {
            rootView.findViewById(R.id.llExcerciseGuideData).setVisibility(View.VISIBLE);
            rootView.findViewById(R.id.llWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llMyWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llNutrition).setVisibility(View.GONE);
            rootView.findViewById(R.id.llStretching).setVisibility(View.GONE);
            rootView.findViewById(R.id.llTips).setVisibility(View.GONE);
        } else if (strName.equals("Workout")) {
            rootView.findViewById(R.id.llWorkout).setVisibility(View.VISIBLE);
            rootView.findViewById(R.id.llExcerciseGuideData).setVisibility(View.GONE);
            rootView.findViewById(R.id.llMyWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llNutrition).setVisibility(View.GONE);
            rootView.findViewById(R.id.llStretching).setVisibility(View.GONE);
            rootView.findViewById(R.id.llTips).setVisibility(View.GONE);
        } else if (strName.equals("MyWorkOut")) {
            rootView.findViewById(R.id.llMyWorkout).setVisibility(View.VISIBLE);
            rootView.findViewById(R.id.llWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llExcerciseGuideData).setVisibility(View.GONE);
            rootView.findViewById(R.id.llNutrition).setVisibility(View.GONE);
            rootView.findViewById(R.id.llStretching).setVisibility(View.GONE);
            rootView.findViewById(R.id.llTips).setVisibility(View.GONE);
        } else if (strName.equals("Nutrition")) {
            rootView.findViewById(R.id.llNutrition).setVisibility(View.VISIBLE);
            rootView.findViewById(R.id.llWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llExcerciseGuideData).setVisibility(View.GONE);
            rootView.findViewById(R.id.llMyWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llStretching).setVisibility(View.GONE);
            rootView.findViewById(R.id.llTips).setVisibility(View.GONE);
        } else if (strName.equals("Stretching")) {
            rootView.findViewById(R.id.llStretching).setVisibility(View.VISIBLE);
            rootView.findViewById(R.id.llWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llExcerciseGuideData).setVisibility(View.GONE);
            rootView.findViewById(R.id.llMyWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llNutrition).setVisibility(View.GONE);
            rootView.findViewById(R.id.llTips).setVisibility(View.GONE);
        } else if (strName.equals("Tips")) {
            rootView.findViewById(R.id.llTips).setVisibility(View.VISIBLE);
            rootView.findViewById(R.id.llWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llExcerciseGuideData).setVisibility(View.GONE);
            rootView.findViewById(R.id.llMyWorkout).setVisibility(View.GONE);
            rootView.findViewById(R.id.llNutrition).setVisibility(View.GONE);
            rootView.findViewById(R.id.llStretching).setVisibility(View.GONE);
        }

        clickListener();
    }

    private void clickListener() {
        /*Exercise Guide*/
        rootView.findViewById(R.id.llGym).setOnClickListener(this);
        rootView.findViewById(R.id.llBodyweight).setOnClickListener(this);
        rootView.findViewById(R.id.llBattlerope).setOnClickListener(this);
        rootView.findViewById(R.id.llBox).setOnClickListener(this);
        rootView.findViewById(R.id.llSuspension).setOnClickListener(this);
        rootView.findViewById(R.id.llKettlebell).setOnClickListener(this);
        rootView.findViewById(R.id.llCardio).setOnClickListener(this);

        /*Workout*/
        rootView.findViewById(R.id.llHome).setOnClickListener(this);
        rootView.findViewById(R.id.llCalisthenics).setOnClickListener(this);
        rootView.findViewById(R.id.llFunctionalTraining).setOnClickListener(this);
        rootView.findViewById(R.id.llSuspensionTraining).setOnClickListener(this);

        stretchingClickListner();
    }

    private void stretchingClickListner() {
        rootView.findViewById(R.id.llBackLegA).setOnClickListener(this);
        rootView.findViewById(R.id.llBackLegB).setOnClickListener(this);
        rootView.findViewById(R.id.llBackLegC).setOnClickListener(this);
        rootView.findViewById(R.id.llBackLegD).setOnClickListener(this);
        rootView.findViewById(R.id.llFrontLegA).setOnClickListener(this);
        rootView.findViewById(R.id.llBackLegE).setOnClickListener(this);
        rootView.findViewById(R.id.llFrontLegB).setOnClickListener(this);
        rootView.findViewById(R.id.llFrontLegC).setOnClickListener(this);
        rootView.findViewById(R.id.llBackA).setOnClickListener(this);
        rootView.findViewById(R.id.llBackB).setOnClickListener(this);
        rootView.findViewById(R.id.llBackC).setOnClickListener(this);
        rootView.findViewById(R.id.llFrontLegD).setOnClickListener(this);
        rootView.findViewById(R.id.llFrontLegE).setOnClickListener(this);
        rootView.findViewById(R.id.llFrontLegF).setOnClickListener(this);
        rootView.findViewById(R.id.llBicepA).setOnClickListener(this);
        rootView.findViewById(R.id.llChestA).setOnClickListener(this);
        rootView.findViewById(R.id.llBackD).setOnClickListener(this);
        rootView.findViewById(R.id.llTricepsA).setOnClickListener(this);
        rootView.findViewById(R.id.llShoulderA).setOnClickListener(this);
        rootView.findViewById(R.id.llShoulderB).setOnClickListener(this);
        rootView.findViewById(R.id.llShoulderC).setOnClickListener(this);
        rootView.findViewById(R.id.llBackE).setOnClickListener(this);
        rootView.findViewById(R.id.llBackF).setOnClickListener(this);
        rootView.findViewById(R.id.llBackG).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onClickStretch(v);
        switch (v.getId()) {
            /*Exercise Guide*/
            case R.id.llGym:
                openDetailActivity("Gym");
                break;
            case R.id.llBodyweight:
                openDetailActivity("Bodyweight");
                break;
            case R.id.llBattlerope:
                openDetailActivity("Battlerope");
                break;
            case R.id.llBox:
                openDetailActivity("Box");
                break;
            case R.id.llSuspension:
                openDetailActivity("Suspension");
                break;
            case R.id.llKettlebell:
                openDetailActivity("Kettlebell");
                break;
            case R.id.llCardio:
                openDetailActivity("Cardio");
                break;

            /*Workout*/
            case R.id.llHome:
                openDetailActivity("Home");
                break;
            case R.id.llCalisthenics:
                openDetailActivity("Calisthenics");
                break;
            case R.id.llFunctionalTraining:
                openDetailActivity("FunctionalTraining");
                break;
            case R.id.llSuspensionTraining:
                openDetailActivity("SuspensionTraining");
                break;
        }
    }

    private void onClickStretch(View v) {
        switch (v.getId()) {
            case R.id.llBackLegA:
                openExerciseDetail("llBackLegA");
                break;
            case R.id.llBackLegB:
                openExerciseDetail("llBackLegB");
                break;
            case R.id.llBackLegC:
                openExerciseDetail("llBackLegC");
                break;
            case R.id.llBackLegD:
                openExerciseDetail("llBackLegD");
                break;
            case R.id.llFrontLegA:
                openExerciseDetail("llFrontLegA");
                break;
            case R.id.llBackLegE:
                openExerciseDetail("llBackLegE");
                break;
            case R.id.llFrontLegB:
                openExerciseDetail("llFrontLegB");
                break;
            case R.id.llFrontLegC:
                openExerciseDetail("llFrontLegC");
                break;
            case R.id.llBackA:
                openExerciseDetail("llBackA");
                break;
            case R.id.llBackB:
                openExerciseDetail("llBackB");
                break;
            case R.id.llBackC:
                openExerciseDetail("llBackC");
                break;
            case R.id.llFrontLegD:
                openExerciseDetail("llFrontLegD");
                break;
            case R.id.llFrontLegE:
                openExerciseDetail("llFrontLegE");
                break;
            case R.id.llFrontLegF:
                openExerciseDetail("llFrontLegF");
                break;
            case R.id.llBicepA:
                openExerciseDetail("llBicepA");
                break;
            case R.id.llChestA:
                openExerciseDetail("llChestA");
                break;
            case R.id.llBackD:
                openExerciseDetail("llBackD");
                break;
            case R.id.llTricepsA:
                openExerciseDetail("llTricepsA");
                break;
            case R.id.llShoulderA:
                openExerciseDetail("llShoulderA");
                break;
            case R.id.llShoulderB:
                openExerciseDetail("llShoulderB");
                break;
            case R.id.llShoulderC:
                openExerciseDetail("llShoulderC");
                break;
            case R.id.llBackE:
                openExerciseDetail("llBackE");
                break;
            case R.id.llBackF:
                openExerciseDetail("llBackF");
                break;
            case R.id.llBackG:
                openExerciseDetail("llBackG");
                break;
        }
    }

    private void openDetailActivity(String strName) {
        Intent intent = new Intent(mContext, ExerciseGuideActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }

    private void openExerciseDetail(String strName) {
        Intent intent = new Intent(mContext, ExerciseDetailActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }

}
