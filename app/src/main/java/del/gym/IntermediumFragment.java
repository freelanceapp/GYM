package del.gym;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

@SuppressLint("ValidFragment")
public class IntermediumFragment extends Fragment {
    private List<StretcingModel> begginerfragmentList;
    private RecyclerView rclv;
    private Context context;

    public IntermediumFragment(List<StretcingModel> begginerfragmentList) {
        this.begginerfragmentList = begginerfragmentList;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.begginer_fragment,null);
        rclv = view.findViewById(R.id.beginner_rclv);

        BegginerFragmentAdapter begginerFragmentAdapter= new BegginerFragmentAdapter(begginerfragmentList,context);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity().getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rclv.setLayoutManager(lm);
        rclv.setItemAnimator(new DefaultItemAnimator());
        rclv.setAdapter(begginerFragmentAdapter);
        return view;
    }
}
