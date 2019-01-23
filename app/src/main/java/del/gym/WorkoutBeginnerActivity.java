package del.gym;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class WorkoutBeginnerActivity extends AppCompatActivity implements View.OnClickListener {
    private List<StretcingModel> begginermanList = new ArrayList<>();

    private List<StretcingModel> beginnierdatalist0 = new ArrayList<>();
    private List<StretcingModel> beginnierdatalist1 = new ArrayList<>();
    private List<StretcingModel> beginnierdatalist2 = new ArrayList<>();
    private List<StretcingModel> beginnierdatalist3 = new ArrayList<>();
    private List<StretcingModel> beginnierdatalist4 = new ArrayList<>();

    RecyclerView biginnerrclv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_beginner);

        biginnerrclv = findViewById(R.id.biginer_rclv);
        biginnerrclv.setHasFixedSize(true);
        biginnerrclv.setLayoutManager(new LinearLayoutManager(this));

        /*beginnner 1*/
        beginnierdatalist0.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Squats"));
        beginnierdatalist0.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Crunch"));
        beginnierdatalist0.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Burpees"));
        beginnierdatalist0.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Close Hands Push Ups"));

        beginnierdatalist1.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Squats"));
        beginnierdatalist1.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Clap Push Ups"));
        beginnierdatalist1.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Hindu Push Ups"));
        beginnierdatalist1.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Jumping Jacks"));

        beginnierdatalist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Wide Push Ups"));
        beginnierdatalist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Squats"));
        beginnierdatalist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Clap Push Ups"));
        beginnierdatalist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Hindu Push Ups"));
        beginnierdatalist2.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Jumping"));

        beginnierdatalist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Awesome Glutes"));
        beginnierdatalist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Huge Arm"));
        beginnierdatalist3.add(new StretcingModel(R.drawable.exercise_activity5_image1, "Legs"));

        beginnierdatalist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "list adapter 5"));
        beginnierdatalist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "list adapter 5"));
        beginnierdatalist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "list adapter 5"));
        beginnierdatalist4.add(new StretcingModel(R.drawable.exercise_activity5_image1, "list adapter 5"));


        begginermanList.clear();
        begginermanList = getIntent().getParcelableArrayListExtra("data");

        BiginerAdapter bAdapter = new BiginerAdapter(begginermanList, this, this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(WorkoutBeginnerActivity.this, LinearLayoutManager.VERTICAL, false);
        biginnerrclv.setLayoutManager(layoutManager);
        biginnerrclv.setItemAnimator(new DefaultItemAnimator());
        biginnerrclv.setAdapter(bAdapter);
        bAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.biginnerrclvonclick:
                int position = Integer.parseInt(v.getTag().toString());

                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(), BeginnerMediums.class);
                        intent0.putParcelableArrayListExtra("datalist", (ArrayList<? extends Parcelable>) beginnierdatalist0);
                        startActivity(intent0);
                        break;

                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), BeginnerMediums.class);
                        intent1.putParcelableArrayListExtra("datalist", (ArrayList<? extends Parcelable>) beginnierdatalist1);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), BeginnerMediums.class);
                        intent2.putParcelableArrayListExtra("datalist", (ArrayList<? extends Parcelable>) beginnierdatalist2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), ExerciseActivity1.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), NutritionActivity6.class);
                        startActivity(intent4);
                        break;
                }
                break;
        }
    }

}
