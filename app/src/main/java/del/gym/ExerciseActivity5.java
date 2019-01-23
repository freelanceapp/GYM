package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity5 extends AppCompatActivity {
    private List<StretcingModel> exerciseDataA5 = new ArrayList<>();
    RecyclerView excerciserclv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise5);
        excerciserclv5 = findViewById(R.id.exercise_activity_rclv5);
        excerciserclv5.setHasFixedSize(true);
        excerciserclv5.setLayoutManager(new LinearLayoutManager(this));


        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image1
                        ,"Squat"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image2
                        ,"Low Row"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image3
                        ,"Chest Press"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.td
                        ,"Biceps Curl"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Triceps Press"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.te
                        ,"Power Pull"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tf
                        ,"Sprinter"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tg
                        ,"Hamstring Curl"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.th
                        ,"Lunge"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.ti
                        ,"Hip Press"
                )); exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tj
                        ,"Crossing Balance Lunge"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tl
                        ,"Standing Rollout"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tm
                        ,"Hip Drop"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tn
                        ,"Mountain Climber"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.to
                        ,"Hamstring Runner"
                ));
        exerciseDataA5.add(
                new StretcingModel(
                        R.drawable.tp
                        ,"Atomic Push-Up"
                ));
               ExerciseAdapter5 exerciseAdapter5 = new ExerciseAdapter5(exerciseDataA5,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExerciseActivity5.this,LinearLayoutManager.VERTICAL,false);
        excerciserclv5.setLayoutManager(lm);
        excerciserclv5.setItemAnimator(new DefaultItemAnimator());
        excerciserclv5.setAdapter(exerciseAdapter5);
    }
}
