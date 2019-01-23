package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity4 extends AppCompatActivity {
    private List<StretcingModel> exerciseDataA4 = new ArrayList<>();
    RecyclerView excerciserclv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);
        excerciserclv4 = findViewById(R.id.exercise_activity_rclv4);
        excerciserclv4.setHasFixedSize(true);
        excerciserclv4.setLayoutManager(new LinearLayoutManager(this));


        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images1
                        ,"Step Ups Jump"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image2
                        ,"Jumps(Double Leg)"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Single Leg Jumps"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image3
                        ,"Lateral Jumps"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Side to Side Jump"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image6
                        ,"Incline Push-Ups"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Decline Push-Up"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image7
                        ,"Dips"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image8
                        ,"Rebound Jumps"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_image9
                        ,"Reverse Lunges"
                )); exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images10
                        ,"Romanian Lunges"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images11
                        ,"Depth Jumps"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_activity4_images12
                        ,"Burpee Box Jumps"
                ));
        exerciseDataA4.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Step Ups"
                ));
        ExerciseAdapter4 exerciseAdapter4 = new ExerciseAdapter4(exerciseDataA4,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExerciseActivity4.this,LinearLayoutManager.VERTICAL,false);
        excerciserclv4.setLayoutManager(lm);
        excerciserclv4.setItemAnimator(new DefaultItemAnimator());
        excerciserclv4.setAdapter(exerciseAdapter4);
    }
}
