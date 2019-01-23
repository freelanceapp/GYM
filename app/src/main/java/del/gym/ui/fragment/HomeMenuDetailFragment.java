package del.gym.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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

        if (strName.equals("Exercise")) {
            ((LinearLayout) rootView.findViewById(R.id.llExcerciseGuideData)).setVisibility(View.VISIBLE);
            ((LinearLayout) rootView.findViewById(R.id.llGym)).setOnClickListener(this);
            ((LinearLayout) rootView.findViewById(R.id.llBodyweight)).setOnClickListener(this);
            ((LinearLayout) rootView.findViewById(R.id.llBattlerope)).setOnClickListener(this);
            ((LinearLayout) rootView.findViewById(R.id.llBox)).setOnClickListener(this);
            ((LinearLayout) rootView.findViewById(R.id.llSuspension)).setOnClickListener(this);
            ((LinearLayout) rootView.findViewById(R.id.llKettlebell)).setOnClickListener(this);
            ((LinearLayout) rootView.findViewById(R.id.llCardio)).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
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
        }
    }

    private void openDetailActivity(String strName) {
        Intent intent = new Intent(mContext, ExerciseGuideActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
