package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkOutActivity5 extends AppCompatActivity {
    
    private List<StretcingModel> workoutDataA5 = new ArrayList<>();
    private RecyclerView workoutrclv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out5);

        workoutrclv5 =findViewById(R.id.workout_rclv5);
        workoutrclv5.setHasFixedSize(true);
        workoutrclv5.setLayoutManager(new LinearLayoutManager(this));


        workoutDataA5.add(
                new StretcingModel(
                        R.drawable.day1
                        ,"Full Body"
                ));
        workoutDataA5.add(
                new StretcingModel(
                        R.drawable.day2
                        ,"Push/Pull"
                ));
        workoutDataA5.add(
                new StretcingModel(
                        R.drawable.day3
                        ,"Fat Burner"
                ));
        workoutDataA5.add(
                new StretcingModel(
                        R.drawable.day4
                        ,"Special Workout"
                ));




        WorkOutActivityAdapter5 workOutActivityAdapter5 = new WorkOutActivityAdapter5(workoutDataA5,this);
        LinearLayoutManager lm = new LinearLayoutManager(WorkOutActivity5.this,LinearLayoutManager.VERTICAL,false);

        workoutrclv5.setLayoutManager(lm);
        workoutrclv5.setItemAnimator(new DefaultItemAnimator());
        workoutrclv5.setAdapter(workOutActivityAdapter5);
    }
}
