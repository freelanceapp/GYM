package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExgymBicepsActivitity extends AppCompatActivity {
    private List<StretcingModel> exgymbicepsData = new ArrayList<>();

    RecyclerView exgymbicepsrclv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exgym_biceps_activitity);
        exgymbicepsrclv = findViewById(R.id.exgymbicepsrclv);

        exgymbicepsrclv.setLayoutManager(new LinearLayoutManager(this));


        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images1
                        ,"Step Ups Jump"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image2
                        ,"Jumps(Double Leg)"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Single Leg Jumps"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Lateral Jumps"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Side to Side Jump"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image6
                        ,"Incline Push-Ups"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Decline Push-Up"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Dips"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image8
                        ,"Rebound Jumps"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image9
                        ,"Reverse Lunges"
                )); exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images10
                        ,"Romanian Lunges"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images11
                        ,"Depth Jumps"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images12
                        ,"Burpee Box Jumps"
                ));
        exgymbicepsData.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Step Ups"
                ));
        ExgymBicepsAdapter exgymBicepsAdapter = new ExgymBicepsAdapter(exgymbicepsData,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExgymBicepsActivitity.this,LinearLayoutManager.VERTICAL,false);
        exgymbicepsrclv.setLayoutManager(lm);
        exgymbicepsrclv.setItemAnimator(new DefaultItemAnimator());
        exgymbicepsrclv.setAdapter(exgymBicepsAdapter);
    }
}
