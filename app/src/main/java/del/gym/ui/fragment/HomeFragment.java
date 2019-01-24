package del.gym.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

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
        ((RelativeLayout) rootView.findViewById(R.id.llExcerciseGuide)).setOnClickListener(this);
        ((RelativeLayout) rootView.findViewById(R.id.llWorkout)).setOnClickListener(this);
        ((RelativeLayout) rootView.findViewById(R.id.llMyWorkOut)).setOnClickListener(this);
        ((RelativeLayout) rootView.findViewById(R.id.llNutrition)).setOnClickListener(this);
        ((RelativeLayout) rootView.findViewById(R.id.llStretching)).setOnClickListener(this);
        ((RelativeLayout) rootView.findViewById(R.id.llTips)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llExcerciseGuide:
                changeFragment("Exercise", ConstantData.HomeMenuDetailFragment);
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
