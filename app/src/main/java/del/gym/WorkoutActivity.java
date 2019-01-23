package del.gym;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class WorkoutActivity extends AppCompatActivity implements View.OnClickListener {
    private List<StretcingModel> beginniermanlist2 = new ArrayList<>();
    private List<StretcingModel> beginniermanlist3 = new ArrayList<>();
    private List<StretcingModel> beginniermanlist4 = new ArrayList<>();
    private List<StretcingModel> beginniermanlist5 = new ArrayList<>();

    private List<StretcingModel> workoutData = new ArrayList<>();
    RecyclerView worecyler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        worecyler = findViewById(R.id.worecyler);
        worecyler.setHasFixedSize(true);

        beginniermanlist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "8 Minutes"));
        beginniermanlist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "15 Minutes"));
        beginniermanlist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "25  Minutes"));
        beginniermanlist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Focused Muscles"));
        beginniermanlist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Fat Burner"));

        beginniermanlist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Full Body"));
        beginniermanlist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push Pull"));
        beginniermanlist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Fat Burner"));
        beginniermanlist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Focused Muscles"));

        beginniermanlist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Full Body"));
        beginniermanlist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push Pull"));
        beginniermanlist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Fat Burner"));
        beginniermanlist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Special Workout"));

        beginniermanlist5.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Full BOdy"));
        beginniermanlist5.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Push/Pull"));
        beginniermanlist5.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Fat Burner"));
        beginniermanlist5.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Special Workout"));

        workoutData.add(new StretcingModel(R.drawable.workoutimage4, "Gym"));
        workoutData.add(new StretcingModel(R.drawable.workoutsimage5, "Home - No Equipment"));
        workoutData.add(new StretcingModel(R.drawable.workoutimage4, "Calisthenics"));
        workoutData.add(new StretcingModel(R.drawable.workoutimage4, "Functional Training"));
        workoutData.add(new StretcingModel(R.drawable.workoutsimage5, "Suspension Training"));

        WorkOutActivityAdapter workOutActivityAdapter = new WorkOutActivityAdapter(workoutData, this, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(WorkoutActivity.this, 2);
        worecyler.setLayoutManager(gridLayoutManager);
        worecyler.setItemAnimator(new DefaultItemAnimator());
        worecyler.setAdapter(workOutActivityAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.onclickWorkOut:
                int position = Integer.parseInt(v.getTag().toString());

                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(), WorkOutActivity1.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), WorkoutBeginnerActivity.class);
                        intent1.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) beginniermanlist2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), WorkoutBeginnerActivity.class);
                        intent2.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) beginniermanlist3);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), WorkoutBeginnerActivity.class);
                        intent3.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) beginniermanlist4);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), WorkoutBeginnerActivity.class);
                        intent4.putParcelableArrayListExtra("data", (ArrayList<? extends Parcelable>) beginniermanlist5);
                        startActivity(intent4);
                        break;

                }
                break;
        }
    }

}
