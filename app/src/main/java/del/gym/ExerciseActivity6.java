package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity6 extends AppCompatActivity {
    private List<StretcingModel> exerciseDataA6 = new ArrayList<>();
    RecyclerView excerciserclv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise6);
        excerciserclv6 = findViewById(R.id.exercise_activity_rclv6);
        excerciserclv6.setHasFixedSize(true);
        excerciserclv6.setLayoutManager(new LinearLayoutManager(this));


        exerciseDataA6.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image1
                        ,"Turkish Get-Up"
                ));
        exerciseDataA6.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image2
                        ,"Swing"
                ));
        exerciseDataA6.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image3
                        ,"Goblet Squat"
                ));
        exerciseDataA6.add(
                new StretcingModel(
                        R.drawable.td
                        ,"Kettlebell Snatch"
                ));
        exerciseDataA6.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"One-arm Kettlebell Swing"
                ));
       ExerciseAdapter6 exerciseAdapter6 = new ExerciseAdapter6(exerciseDataA6,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExerciseActivity6.this,LinearLayoutManager.VERTICAL,false);
        excerciserclv6.setLayoutManager(lm);
        excerciserclv6.setItemAnimator(new DefaultItemAnimator());
        excerciserclv6.setAdapter(exerciseAdapter6);
    }
}
