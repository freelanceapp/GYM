package del.gym;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class WorkOutActivity1 extends AppCompatActivity {
    private List<StretcingModel> beginniermanlist = new ArrayList<>();
    private List<StretcingModel> intermediumlist = new ArrayList<>();
    private List<StretcingModel> advancedlist = new ArrayList<>();
    private List<StretcingModel> begginerwomenlist = new ArrayList<>();

    Button workoutbutton1,workoutbutton2,workoutbutton3,workoutbutton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out1);

        workoutbutton1 = findViewById(R.id.workout_button1);
        workoutbutton2 = findViewById(R.id.workout_button2);
        workoutbutton3 =findViewById(R.id.workout_button3);
        workoutbutton4 = findViewById(R.id.workout_button4);

        workoutbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),WorkoutBeginnerActivity.class);
                intent1.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) beginniermanlist);
                startActivity(intent1);
            }
        });
        workoutbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),WorkoutBeginnerActivity.class);
                intent1.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) intermediumlist);
                startActivity(intent1);
            }
        });
        workoutbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),WorkoutBeginnerActivity.class);
                intent1.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) advancedlist);
                startActivity(intent1);
            }
        });
        workoutbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),WorkoutBeginnerActivity.class);
                intent1.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) begginerwomenlist);
                startActivity(intent1);
            }
        });
        /*beginnner 1*/
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weight Loss"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weekly Workout"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Frequency 2 Wieder"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Focused Muscle"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Conditioning Full Body"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Celebrity Routines"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push/Pulls"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Multifiber"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Iron Six Pack"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Massive Chest"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Awesome Glutes"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Huge Arm"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Legs"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Mens physique Weekly"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Maximum Hypertrophy 30 days"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Lose Fat 30 days"));
        beginniermanlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Special beginners 30 days"));
        /*beginners list 2*/
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weight Loss"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weekly Workout"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Frequency 2 Wieder"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Focused Muscle"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Conditioning Full Body"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Celebrity Routines"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push/Pulls"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Multifiber"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Iron Six Pack"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Massive Chest"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Awesome Glutes"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Huge Arm"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Legs"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Mens physique Weekly"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Maximum Hypertrophy 30 days"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Lose Fat 30 days"));
        intermediumlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Special beginners 30 days"));
      
        /*begginer list 3*/
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weight Loss"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weekly Workout"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Frequency 2 Wieder"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Focused Muscle"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Conditioning Full Body"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Celebrity Routines"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push/Pulls"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Multifiber"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Iron Six Pack"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Massive Chest"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Awesome Glutes"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Huge Arm"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Legs"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Mens physique Weekly"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Maximum Hypertrophy 30 days"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Lose Fat 30 days"));
        advancedlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Special beginners 30 days"));

        /*beginner list 4*/
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weight Loss"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Weekly Workout"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Frequency 2 Wieder"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Focused Muscle"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Conditioning Full Body"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Celebrity Routines"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push/Pulls"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Multifiber"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Iron Six Pack"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Massive Chest"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Awesome Glutes"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Huge Arm"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Legs"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Mens physique Weekly"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Maximum Hypertrophy 30 days"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Lose Fat 30 days"));
        begginerwomenlist.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Special beginners 30 days"));



    }
}
