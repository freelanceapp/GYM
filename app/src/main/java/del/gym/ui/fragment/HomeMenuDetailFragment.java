package del.gym.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import del.gym.NutritionActivit1;
import del.gym.NutritionActivity3;
import del.gym.NutritionActivity6;
import del.gym.R;
import del.gym.ui.activity.home_menu_activities.ExerciseGuideActivity;
import del.gym.ui.activity.tipsitems.TipsDetailActivity;
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


        /*Nutrition*/
        rootView.findViewById(R.id.llNutritionDietPlans).setOnClickListener(this);
        rootView.findViewById(R.id.llNutritionFoods).setOnClickListener(this);
        rootView.findViewById(R.id.llNutritionsupplements).setOnClickListener(this);
        rootView.findViewById(R.id.llNutritionSuspensionTraining).setOnClickListener(this);
        rootView.findViewById(R.id.llNutritionTips).setOnClickListener(this);
        /*Tips*/
        rootView.findViewById(R.id.rlitem1).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem2).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem3).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem4).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem5).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem6).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem6).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem7).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem8).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem9).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem10).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem11).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem12).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem13).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem14).setOnClickListener(this);
        rootView.findViewById(R.id.rlitem15).setOnClickListener(this);
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


            /*Nutrition*/
            case R.id.llNutritionDietPlans:
                //openDetailActivity("Home");
                Intent intent = new Intent(mContext, NutritionActivit1.class);
                startActivity(intent);
                break;
            case R.id.llNutritionFoods:
                Intent intent2 = new Intent(mContext, NutritionActivity6.class);
                startActivity(intent2);
                break;
            case R.id.llNutritionsupplements:
                //openDetailActivity("FunctionalTraining");
                Intent intent1 = new Intent(mContext, NutritionActivity3.class);
                startActivity(intent1);

                break;
            case R.id.llNutritionSuspensionTraining:
                openDetailActivity("SuspensionTraining");
                break;
            case R.id.llNutritionTips:
                openTipsDetailActivity("SuspensionTraining");
                break;


                /*Tips*/
            case R.id.rlitem1:
                openTipsDetailActivity(getString(R.string.how_to_acclerate));
                break;
            case R.id.rlitem2:
                openTipsDetailActivity(getString(R.string.whey_protein));
                break;
            case R.id.rlitem3:
                openTipsDetailActivity(getString(R.string.the_4_supplements));
                break;
            case R.id.rlitem4:
                openTipsDetailActivity(getString(R.string.how_to_recognize));
                break;
            case R.id.rlitem5:
                openTipsDetailActivity(getString(R.string.guide_to_choose_your_sepplement));
                break;
            case R.id.rlitem6:
                openTipsDetailActivity(getString(R.string.do_not));
                break;
            case R.id.rlitem7:
                openTipsDetailActivity(getString(R.string.go_to_market));
                break;
            case R.id.rlitem8:
                openTipsDetailActivity(getString(R.string.sign_up));
                break;
            case R.id.rlitem9:
                openTipsDetailActivity(getString(R.string.balanced_diet));
                break;
            case R.id.rlitem10:
                openTipsDetailActivity(getString(R.string.do_you_like));
                break;
            case R.id.rlitem11:
                openTipsDetailActivity(getString(R.string.enjoy_your_food));
                break;
            case R.id.rlitem12:
                openTipsDetailActivity(getString(R.string.in_your));
                break;
            case R.id.rlitem13:
                openTipsDetailActivity(getString(R.string.improve_your_enviroment));
                break;
            case R.id.rlitem14:
                openTipsDetailActivity(getString(R.string.eat_consciously));
                break;
            case R.id.rlitem15:
                openTipsDetailActivity(getString(R.string.he_chef));
                break;
        }
    }

    private void openDetailActivity(String strName) {
        Intent intent = new Intent(mContext, ExerciseGuideActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }

    private void openTipsDetailActivity(String strName) {
        Intent intent = new Intent(mContext, TipsDetailActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
