package del.gym;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class WorkOutActivity4 extends AppCompatActivity {
    private List<StretcingModel>  functinaltrainingList = new ArrayList<>();
     RecyclerView workoutrclv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out4);
        workoutrclv4 = findViewById(R.id.workout_id_rclv4);

        workoutrclv4.setHasFixedSize(true);
        workoutrclv4.setLayoutManager(new LinearLayoutManager(this));

        functinaltrainingList.add(new StretcingModel(R.drawable.exercise_activity5_image1,"Full Body"));
        functinaltrainingList.add(new StretcingModel(R.drawable.exercise_activitiy4_image5,"Push/Pull"));
        functinaltrainingList.add(new StretcingModel(R.drawable.exercise_activity5_image1,"Fat Burner"));
        functinaltrainingList.add(new StretcingModel(R.drawable.exercise_activitiy4_image5,"Special Workout"));

   /*     WorkOutActivityAdapter4 workOutActivityAdapter4 = new WorkOutActivityAdapter4(functinaltrainingList, this);
        LinearLayoutManager layoutManager = new LinearLayoutManager(WorkOutActivity4.this, LinearLayoutManager.VERTICAL, false);
        workoutrclv4.setLayoutManager(layoutManager);
        workoutrclv4.setItemAnimator(new DefaultItemAnimator());
        workoutrclv4.setAdapter(workOutActivityAdapter4);
        workOutActivityAdapter4.notifyDataSetChanged();
   */ }
}
