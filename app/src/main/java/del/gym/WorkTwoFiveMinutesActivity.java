package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkTwoFiveMinutesActivity extends AppCompatActivity {
    private List<StretcingModel> workoutAdapterActivityD3 = new ArrayList<>();
    private RecyclerView workoutadapteractrclv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workadapter3);
        workoutadapteractrclv3 = findViewById(R.id.work_adapter1_rclv3);
        workoutadapteractrclv3.setHasFixedSize(true);
        workoutadapteractrclv3.setLayoutManager(new LinearLayoutManager(this));


        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam Jump"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Snakes"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Claps"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Outside Circles"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Ultimate Warrior"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Grappler HIp-to-Hip Toss"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves + Squats"
                )); workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves + Burpee"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Uppercuts"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Figure Eight Circles"
                ));
        workoutAdapterActivityD3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Jumping Jacks"
                ));
        WorkActiivty1Adapter3 workActiivty1Adapter3 = new WorkActiivty1Adapter3(workoutAdapterActivityD3,this);

        LinearLayoutManager lm = new LinearLayoutManager(WorkTwoFiveMinutesActivity.this,LinearLayoutManager.VERTICAL,false);
        workoutadapteractrclv3.setLayoutManager(lm);
        workoutadapteractrclv3.setItemAnimator(new DefaultItemAnimator());
        workoutadapteractrclv3.setAdapter(workActiivty1Adapter3);
    }
}
