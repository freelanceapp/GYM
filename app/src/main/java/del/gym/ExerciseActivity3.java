package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity3 extends AppCompatActivity {
    private List<StretcingModel> exerciseDataA3 = new ArrayList<>();
    RecyclerView excerciserclv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
        excerciserclv3 = findViewById(R.id.exercise_activity_rclv3);
        excerciserclv3.setHasFixedSize(true);
        excerciserclv3.setLayoutManager(new LinearLayoutManager(this));


        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Slam Jump"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Snakes"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Claps"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Outside Circles"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Ultimate Warrior"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Grappler HIp-to-Hip Toss"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Alternating Waves + Squats"
                )); exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Double Arm Waves + Burpee"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Uppercuts"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Figure Eight Circles"
                ));
        exerciseDataA3.add(
                new StretcingModel(
                        R.drawable.exercise_activity3_image
                        ,"Jumping Jacks"
                ));
              ExerciseAdapter3 exerciseAdapter3 = new ExerciseAdapter3(exerciseDataA3,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExerciseActivity3.this,LinearLayoutManager.VERTICAL,false);
        excerciserclv3.setLayoutManager(lm);
        excerciserclv3.setItemAnimator(new DefaultItemAnimator());
        excerciserclv3.setAdapter(exerciseAdapter3);
    
    }
}
