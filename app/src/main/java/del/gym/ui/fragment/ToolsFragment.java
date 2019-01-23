package del.gym.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import del.gym.R;
import del.gym.ui.activity.ToolsActivity;
import del.gym.utils.BaseFragment;

public class ToolsFragment extends BaseFragment implements View.OnClickListener {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tools, container, false);
        init();
        return rootView;
    }

    private void init() {
        mContext = getActivity();

        ((LinearLayout) rootView.findViewById(R.id.llReminder)).setOnClickListener(this);
        ((LinearLayout) rootView.findViewById(R.id.llChronometer)).setOnClickListener(this);
        ((LinearLayout) rootView.findViewById(R.id.llMyRoutine)).setOnClickListener(this);
        ((LinearLayout) rootView.findViewById(R.id.llIntervalTime)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llReminder:
                //setIntentData("reminder");
                Toast.makeText(mContext, "in Process...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.llChronometer:
                Toast.makeText(mContext, "in Process...", Toast.LENGTH_SHORT).show();
                //setIntentData("chronometer");
                break;
            case R.id.llMyRoutine:
                setIntentData("my_routine");
                break;
            case R.id.llIntervalTime:
                setIntentData("interval_timer");
                break;
        }
    }

    private void setIntentData(String data) {
        Intent intent = new Intent(mContext, ToolsActivity.class);
        intent.putExtra("name", data);
        startActivity(intent);
    }
}
