package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExgymButtoocksActivity extends AppCompatActivity {
    private List<StretcingModel> exgymbuttocksData = new ArrayList<>();

    RecyclerView exgymbuttonlocksrclv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exgym_buttoocks);

        exgymbuttonlocksrclv = findViewById(R.id.exgymbuttonlocksrclv);

        exgymbuttonlocksrclv.setLayoutManager(new LinearLayoutManager(this));


        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images1
                        ,"Step Ups Jump"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image2
                        ,"Jumps(Double Leg)"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Single Leg Jumps"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Lateral Jumps"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Side to Side Jump"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image6
                        ,"Incline Push-Ups"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Decline Push-Up"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Dips"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image8
                        ,"Rebound Jumps"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image9
                        ,"Reverse Lunges"
                )); exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images10
                        ,"Romanian Lunges"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images11
                        ,"Depth Jumps"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images12
                        ,"Burpee Box Jumps"
                ));
        exgymbuttocksData.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Step Ups"
                ));
        ExgymButtocksAdapter exgymButtocksAdapter = new ExgymButtocksAdapter(exgymbuttocksData,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExgymButtoocksActivity.this,LinearLayoutManager.VERTICAL,false);
        exgymbuttonlocksrclv.setLayoutManager(lm);
        exgymbuttonlocksrclv.setItemAnimator(new DefaultItemAnimator());
        exgymbuttonlocksrclv.setAdapter(exgymButtocksAdapter);
    }
}
