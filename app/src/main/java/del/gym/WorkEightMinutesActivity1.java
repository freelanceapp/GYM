package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkEightMinutesActivity1 extends AppCompatActivity {
    private List<StretcingModel> workoutAdapterActivityD1 = new ArrayList<>();
    RecyclerView workoutadapteractrclv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workadapter1);
        workoutadapteractrclv1 = findViewById(R.id.work_adapter1_rclv1);
        workoutadapteractrclv1.setHasFixedSize(true);
        workoutadapteractrclv1.setLayoutManager(new LinearLayoutManager(this));


        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam Jump"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Snakes"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Claps"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Outside Circles"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Ultimate Warrior"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Grappler HIp-to-Hip Toss"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves + Squats"
                )); workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves + Burpee"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Uppercuts"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Figure Eight Circles"
                ));
        workoutAdapterActivityD1.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Jumping Jacks"
                ));
        WorkActiivty1Adapter1 workActiivty1Adapter1 = new WorkActiivty1Adapter1(workoutAdapterActivityD1,this);

        LinearLayoutManager lm = new LinearLayoutManager(WorkEightMinutesActivity1.this,LinearLayoutManager.VERTICAL,false);
        workoutadapteractrclv1.setLayoutManager(lm);
        workoutadapteractrclv1.setItemAnimator(new DefaultItemAnimator());
        workoutadapteractrclv1.setAdapter(workActiivty1Adapter1);
    }
}
