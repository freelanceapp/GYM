package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity2 extends AppCompatActivity {
    private List<StretcingModel> exerciseDataA2 = new ArrayList<>();
    RecyclerView excerciserclv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        excerciserclv2 = findViewById(R.id.exercise_activity_rclv2);
        excerciserclv2.setHasFixedSize(true);
        excerciserclv2.setLayoutManager(new LinearLayoutManager(this));


        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Trunk Front Lever"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Squats"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Crunch"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Dips"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Pull Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Muscle Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Body Weight Skull Crushers"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Jump On Higher Platform"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Bulgarian Splits Squats"
                )); exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Burpees"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Calf Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Clap Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Close Grip Chin"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Decline Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Diamond Push Up"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Half Burpee"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Handstand Hold"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Hand Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Hanging Oblique Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Incline Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Hindu PUsh Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Horizontal Jump"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Wide Grip Australian"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Knee Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Leg Raises On Parallel Bars"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Walkin Lounges"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Mountain Climbers"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Pike Presses Elevated Feet"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Pike Push Ups"
                )); exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Pistol Squats"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Plank"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Scissors Kicks"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Side Plank"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Squat Jumps"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"V-SitUps"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Windshield Wipers Bar"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Adv. Tuck Planche"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Incline Push Up"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Run"
                )); exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Tuck Planche"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Straddle Planche"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Leg Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Tucked Back Lever"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Dragon Flag"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Leg Raises 90 Bar"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Korean Dips"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Front Lever Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Straddle Back lever"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"V-Sit"
                )); exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"L-Sit To Bent Arm Handstand"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Archer Rows"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Alternating High Knees"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Dips On Straight Bar"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Duck Walk"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Right Side Oblique Crunches"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Rope Jump"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Scissor Crunches"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Muscle-Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Behind Clap Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Bench Dips"
                )); exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Bent Arm Planche Hold"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Bicycles Crunches"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Elbow Lever"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Explosive High Pull Ups To Chest"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Explosive Toe touch Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Shuttle Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Side Plank Hip Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Single Leg Burpees "
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Sit Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Split Leg V-Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Sprawl Jumps"
                )); exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Squat Jumps With 180 Tum"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Star Toe-Touch"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Knee raises I-sit hanging"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Close Hands Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Contralateral Limb Raises"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Human Flag Hold"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Incline Chin Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Superman Push Ups"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Superman Hold"
                ));
        exerciseDataA2.add(
                new StretcingModel(
                        R.drawable.exercise_act_image1
                        ,"Incline Run"
                ));
        ExerciseAdapter2 exerciseAdapter2 = new ExerciseAdapter2(exerciseDataA2,this);

        LinearLayoutManager lm = new LinearLayoutManager(ExerciseActivity2.this,LinearLayoutManager.VERTICAL,false);
        excerciserclv2.setLayoutManager(lm);
        excerciserclv2.setItemAnimator(new DefaultItemAnimator());
        excerciserclv2.setAdapter(exerciseAdapter2);
    }
}
