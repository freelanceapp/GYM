package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkSusPushPullActivity extends AppCompatActivity {
    private List<StretcingModel> workoutAdapterActivity5D2 = new ArrayList<>();
    private RecyclerView activity5rclv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workpushpull2);
        
        activity5rclv2 = findViewById(R.id.work_act5_rclv2);
        activity5rclv2.setHasFixedSize(true);
        activity5rclv2.setLayoutManager(new LinearLayoutManager(this));


        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam Jump"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Snakes"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Claps"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Outside Circles"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Ultimate Warrior"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Grappler HIp-to-Hip Toss"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves + Squats"
                )); workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves + Burpee"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Uppercuts"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Figure Eight Circles"
                ));
        workoutAdapterActivity5D2.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Jumping Jacks"
                ));
//        WorkActiivty5Adapter2 workActiivty5Adapter2 = new WorkActiivty5Adapter2(workoutAdapterActivity5D2,this);

        LinearLayoutManager lm = new LinearLayoutManager(WorkSusPushPullActivity.this,LinearLayoutManager.VERTICAL,false);
        activity5rclv2.setLayoutManager(lm);
        activity5rclv2.setItemAnimator(new DefaultItemAnimator());
  //      activity5rclv2.setAdapter(workActiivty5Adapter2);
        
    }
}
