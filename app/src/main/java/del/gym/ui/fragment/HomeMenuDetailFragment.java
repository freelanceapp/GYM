package del.gym.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import del.gym.R;
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
    }

    @Override
    public void onClick(View v) {
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

    private void openDetailActivity(String strName) {
        Intent intent = new Intent(mContext, ExerciseGuideActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
