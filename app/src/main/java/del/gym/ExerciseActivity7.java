package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity7 extends AppCompatActivity {
    private List<StretcingModel> exerciseDataA7 = new ArrayList<>();
    RecyclerView excerciserclv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise7);

        excerciserclv7 = findViewById(R.id.exercise_activity_rclv7);
        excerciserclv7.setHasFixedSize(true);
        excerciserclv7.setLayoutManager(new LinearLayoutManager(this));


        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image1
                        ,"Skipping"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image2
                        ,"Running Machine"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.exercise_activity5_image3
                        ,"Jumping Rope"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.td
                        ,"Spinning "
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.exercise_activitiy4_image5
                        ,"Stair Climber Machine"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.te
                        ,"Rowing Machine"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.tf
                        ,"Elliptical Machine"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.tg
                        ,"Curved Running Machine"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.th
                        ,"Running"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.ti
                        ,"Cardio Box"
                )); exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.tj
                        ,"Burpees"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.tl
                        ,"Mountain Climbers"
                ));
        exerciseDataA7.add(
                new StretcingModel(
                        R.drawable.tm
                        ,"Jumping"
                ));
        ExerciseAdapter7 exerciseAdapter7 = new ExerciseAdapter7(exerciseDataA7,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExerciseActivity7.this,LinearLayoutManager.VERTICAL,false);
        excerciserclv7.setLayoutManager(lm);
        excerciserclv7.setItemAnimator(new DefaultItemAnimator());
        excerciserclv7.setAdapter(exerciseAdapter7);
    }
}
