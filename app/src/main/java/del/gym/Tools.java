package del.gym;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import del.gym.modal.home_data.ArrayofContentsModel;


@SuppressLint("ValidFragment")
class Tools extends android.support.v4.app.Fragment {

    private List<ArrayofContentsModel> contentsModel = new ArrayList<>();

    RecyclerView rclv;
    Context ctx;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tools,container,false);

        rclv = view.findViewById(R.id.tool_cls);
        rclv.setHasFixedSize(true);
        rclv.setLayoutManager(new LinearLayoutManager(ctx));

        contentsModel.add(
                new ArrayofContentsModel(
                        R.drawable.reminderalarm
                        ,"Reminder"
                ));



        ToolsAdapter toolsAdapter = new ToolsAdapter(contentsModel, getActivity());
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        rclv.setLayoutManager(lm);
        rclv.setItemAnimator(new DefaultItemAnimator());
        rclv.setAdapter(toolsAdapter);
        return view;
    }
}
