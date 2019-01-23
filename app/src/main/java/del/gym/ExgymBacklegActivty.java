package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExgymBacklegActivty extends AppCompatActivity {
    private List<StretcingModel> exgymbacklegData = new ArrayList<>();

    RecyclerView exgymbacklegrclv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exgym_backleg_activty);

        exgymbacklegrclv = findViewById(R.id.exgymbacklegrclv);

        exgymbacklegrclv.setLayoutManager(new LinearLayoutManager(this));


        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images1
                        ,"Step Ups Jump"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image2
                        ,"Jumps(Double Leg)"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Single Leg Jumps"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Lateral Jumps"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Side to Side Jump"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image6
                        ,"Incline Push-Ups"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Decline Push-Up"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Dips"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image8
                        ,"Rebound Jumps"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image9
                        ,"Reverse Lunges"
                )); exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images10
                        ,"Romanian Lunges"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images11
                        ,"Depth Jumps"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images12
                        ,"Burpee Box Jumps"
                ));
        exgymbacklegData.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Step Ups"
                ));
        ExgymBacklegAdaper exgymBacklegAdaper = new ExgymBacklegAdaper(exgymbacklegData,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExgymBacklegActivty.this,LinearLayoutManager.VERTICAL,false);
        exgymbacklegrclv.setLayoutManager(lm);
        exgymbacklegrclv.setItemAnimator(new DefaultItemAnimator());
        exgymbacklegrclv.setAdapter(exgymBacklegAdaper);
    }
}
