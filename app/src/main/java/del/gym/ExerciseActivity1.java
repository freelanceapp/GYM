package del.gym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity1 extends AppCompatActivity implements View.OnClickListener {

    private List<StretcingModel> exerciseData1 = new ArrayList<>();
    RecyclerView excerciserclv1;
    ImageView favouritesimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        excerciserclv1 = findViewById(R.id.exerciserclv1);
        favouritesimage = findViewById(R.id.favourites);
        excerciserclv1.setHasFixedSize(true);

        exerciseData1.add(new StretcingModel(R.drawable.ic_chest,"Chest"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_back_muscle,"Abdomen"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_front_leg,"Back"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_back_leg,"Shoulders"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_buttocks,"Front Leg"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_abdomen,"Triceps"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_shoulders,"Back Leg"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_triceps,"Biceps"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_biceps,"Buttocks"));
        exerciseData1.add(new StretcingModel(R.drawable.ic_forearm,"Forearm"));


        ExerciseAdapter1 exerciseAdapter1 = new ExerciseAdapter1(exerciseData1,this,this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(ExerciseActivity1.this,2);
        excerciserclv1.setLayoutManager(gridLayoutManager);
        excerciserclv1.setItemAnimator(new DefaultItemAnimator());
        excerciserclv1.setAdapter(exerciseAdapter1);
        favouritesimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0 = new Intent(getApplicationContext(), NutritionActivity6.class);
                startActivity(intent0);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
