package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkOutActivity2 extends AppCompatActivity {
    
    private List<StretcingModel> workoutDataA2 = new ArrayList<>();
    private  RecyclerView workoutrclv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out2);

        workoutrclv2 = findViewById(R.id.workout_rclv2);
        workoutrclv2.setHasFixedSize(true);
        workoutrclv2.setLayoutManager(new LinearLayoutManager(this));


        workoutDataA2.add(
                new StretcingModel(
                        R.drawable.day1
                        ,"8 Minutes"
                ));
        workoutDataA2.add(
                new StretcingModel(
                        R.drawable.day2
                        ,"15 Minutes"
                ));
        workoutDataA2.add(
                new StretcingModel(
                        R.drawable.day3
                        ,"25 Minutes"
                ));
        workoutDataA2.add(
                new StretcingModel(
                        R.drawable.day4
                        ,"Focused Muscles"
                ));
        workoutDataA2.add(
                new StretcingModel(
                        R.drawable.day4
                        ,"Fat Banner"
                ));


        WorkOutActivityAdapter2 workOutActivityAdapter2 = new WorkOutActivityAdapter2(workoutDataA2,this);
        LinearLayoutManager lm = new LinearLayoutManager(WorkOutActivity2.this,LinearLayoutManager.VERTICAL,false);

        workoutrclv2.setLayoutManager(lm);
        workoutrclv2.setItemAnimator(new DefaultItemAnimator());
        workoutrclv2.setAdapter(workOutActivityAdapter2);

    }
}
