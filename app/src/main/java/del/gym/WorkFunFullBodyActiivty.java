package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkFunFullBodyActiivty extends AppCompatActivity {

    private WorkOutActiivtyAdapters1 workOutActiivtyAdapters1;
    private List<StretcingModel> workoutact4model = new ArrayList<>();
    private RecyclerView work_fullbody1_rclv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workfatburner2);
        work_fullbody1_rclv = findViewById(R.id.work_act5_rclv1);

        work_fullbody1_rclv.setHasFixedSize(true);
        work_fullbody1_rclv.setLayoutManager(new LinearLayoutManager(this));

        workoutact4model.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves"
                ));
        workoutact4model.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves"
                ));
        workoutact4model.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam"
                ));

        workOutActiivtyAdapters1 = new WorkOutActiivtyAdapters1(workoutact4model,this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(WorkFunFullBodyActiivty.this,LinearLayoutManager.VERTICAL,false);
        work_fullbody1_rclv.setLayoutManager(layoutManager);
        work_fullbody1_rclv.setItemAnimator(new DefaultItemAnimator());
        work_fullbody1_rclv.setAdapter(workOutActiivtyAdapters1);


    }
}
