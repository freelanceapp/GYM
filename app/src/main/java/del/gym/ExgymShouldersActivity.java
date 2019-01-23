package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExgymShouldersActivity extends AppCompatActivity {
    RecyclerView exgymshouldersrclv;
    private List<StretcingModel> exgymshouldersData = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exgym_shoulders);

        exgymshouldersrclv = findViewById(R.id.exgymshouldersrclv);
        exgymshouldersrclv.setLayoutManager(new LinearLayoutManager(this));


        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images1
                        ,"Step Ups Jump"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image2
                        ,"Jumps(Double Leg)"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Single Leg Jumps"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Lateral Jumps"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Side to Side Jump"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image6
                        ,"Incline Push-Ups"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Decline Push-Up"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Dips"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image8
                        ,"Rebound Jumps"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image9
                        ,"Reverse Lunges"
                )); exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images10
                        ,"Romanian Lunges"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images11
                        ,"Depth Jumps"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images12
                        ,"Burpee Box Jumps"
                ));
        exgymshouldersData.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Step Ups"
                ));
        ExgymShouldersAdapter exgymShouldersAdapter = new ExgymShouldersAdapter(exgymshouldersData,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExgymShouldersActivity.this,LinearLayoutManager.VERTICAL,false);
        exgymshouldersrclv.setLayoutManager(lm);
        exgymshouldersrclv.setItemAnimator(new DefaultItemAnimator());
        exgymshouldersrclv.setAdapter(exgymShouldersAdapter);
    }
}
