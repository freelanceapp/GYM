package del.gym.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import del.gym.R;
import del.gym.utils.BaseFragment;
import del.gym.utils.ConstantData;

import static del.gym.ui.activity.NavigationLibraryActivity.fragmentManager;
import static del.gym.ui.activity.NavigationLibraryActivity.tooltext;


public class HomeFragment extends BaseFragment implements View.OnClickListener {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        init();
        return rootView;
    }

    private void init() {
        mContext = getActivity();
        rootView.findViewById(R.id.llExcerciseGuide).setOnClickListener(this);
        rootView.findViewById(R.id.llWorkout).setOnClickListener(this);
        rootView.findViewById(R.id.llMyWorkOut).setOnClickListener(this);
        rootView.findViewById(R.id.llNutrition).setOnClickListener(this);
        rootView.findViewById(R.id.llStretching).setOnClickListener(this);
        rootView.findViewById(R.id.llTips).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llExcerciseGuide:
                changeFragment("ExerciseGuide", ConstantData.HomeMenuDetailFragment);
                break;
            case R.id.llWorkout:
                changeFragment("Workout", ConstantData.HomeMenuDetailFragment);
                break;
            case R.id.llMyWorkOut:
                changeFragment("MyWorkOut", ConstantData.HomeMenuDetailFragment);
                break;
            case R.id.llNutrition:
                changeFragment("Nutrition", ConstantData.HomeMenuDetailFragment);
                break;
            case R.id.llStretching:
                changeFragment("Stretching", ConstantData.HomeMenuDetailFragment);
                break;
            case R.id.llTips:
                changeFragment("Tips", ConstantData.HomeMenuDetailFragment);
                break;
        }
    }

    private void changeFragment(String strName, String strTag) {
        HomeMenuDetailFragment homeMenuDetailFragment = new HomeMenuDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", strName);
        homeMenuDetailFragment.setArguments(bundle);
        tooltext.setText(strName);
        fragmentManager
                .beginTransaction()
                .replace(R.id.home_frame, homeMenuDetailFragment,
                        strTag).commit();
    }
}
