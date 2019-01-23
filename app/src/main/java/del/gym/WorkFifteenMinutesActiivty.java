package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkFifteenMinutesActiivty extends AppCompatActivity {
    private List<StretcingModel> workoutAdapterActivityD2 = new ArrayList<>();
    private RecyclerView workoutadapteractrclv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workadapter2);
        workoutadapteractrclv2 = findViewById(R.id.work_adapter1_rclv2);
        workoutadapteractrclv2.setHasFixedSize(true);
        workoutadapteractrclv2.setLayoutManager(new LinearLayoutManager(this));


        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam Jump"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Snakes"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Claps"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Outside Circles"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Ultimate Warrior"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Grappler HIp-to-Hip Toss"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves + Squats"
                )); workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves + Burpee"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Uppercuts"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Figure Eight Circles"
                ));
        workoutAdapterActivityD2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Jumping Jacks"
                ));
        WorkActiivty1Adapter2 workActiivty1Adapter2 = new WorkActiivty1Adapter2(workoutAdapterActivityD2,this);

        LinearLayoutManager lm = new LinearLayoutManager(WorkFifteenMinutesActiivty.this,LinearLayoutManager.VERTICAL,false);
        workoutadapteractrclv2.setLayoutManager(lm);
        workoutadapteractrclv2.setItemAnimator(new DefaultItemAnimator());
        workoutadapteractrclv2.setAdapter(workActiivty1Adapter2);
    }
}
