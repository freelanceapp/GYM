package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExgymChestActivity extends AppCompatActivity {
    RecyclerView exgymchestrclv;
    private List<StretcingModel> exgymchestData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exgym_chest2);
        exgymchestrclv = findViewById(R.id.exgymchestrclv);
        exgymchestrclv.setLayoutManager(new LinearLayoutManager(this));


        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images1
                        ,"Step Ups Jump"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image2
                        ,"Jumps(Double Leg)"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Single Leg Jumps"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Lateral Jumps"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Side to Side Jump"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image6
                        ,"Incline Push-Ups"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Decline Push-Up"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Dips"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image8
                        ,"Rebound Jumps"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image9
                        ,"Reverse Lunges"
                )); exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images10
                        ,"Romanian Lunges"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images11
                        ,"Depth Jumps"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images12
                        ,"Burpee Box Jumps"
                ));
        exgymchestData.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Step Ups"
                ));
        ExgymChestAdapter exgymChestAdapter = new ExgymChestAdapter(exgymchestData,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExgymChestActivity.this,LinearLayoutManager.VERTICAL,false);
        exgymchestrclv.setLayoutManager(lm);
        exgymchestrclv.setItemAnimator(new DefaultItemAnimator());
        exgymchestrclv.setAdapter(exgymChestAdapter);
    }
}
