package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExerciseContentsActiivty extends AppCompatActivity {

    private List<StretcingModel> exercisecontents = new ArrayList<>();
    private RecyclerView contentsrclv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_contents_actiivty);
        contentsrclv = findViewById(R.id.exercise_contents_rclv);
        contentsrclv.setHasFixedSize(true);
        contentsrclv.setLayoutManager(new LinearLayoutManager(this));

        exercisecontents.clear();
        exercisecontents = getIntent().getParcelableArrayListExtra("exerciseonents");

        ExerciseContentAdapter exerciseContentAdapter = new ExerciseContentAdapter(exercisecontents,this);
        LinearLayoutManager lm = new LinearLayoutManager(ExerciseContentsActiivty.this,LinearLayoutManager.VERTICAL,false);
        contentsrclv.setLayoutManager(lm);
        contentsrclv.setItemAnimator(new DefaultItemAnimator());
        contentsrclv.setAdapter(exerciseContentAdapter);

    }
}
