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

public class WorkoutActivity3 extends AppCompatActivity {
    private List<StretcingModel> calisthenicslist = new ArrayList<>();
    RecyclerView calisthenicsrclv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout3);

        calisthenicsrclv = findViewById(R.id.calisthenics_rclv);

        calisthenicsrclv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),WorkoutBeginnerActivity.class);
                intent1.putParcelableArrayListExtra("workoutdata", (ArrayList<? extends Parcelable>) calisthenicslist);
                startActivity(intent1);
            }
        });
        calisthenicslist.add(new StretcingModel(R.drawable.day5,"workoutactivity 3 data"));
    }
}
