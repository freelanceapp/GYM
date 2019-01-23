package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/**
        homecontent = findViewById(R.id.home_content);

      homecontent.setHasFixedSize(true);
      homecontent.setLayoutManager(new LinearLayoutManager(this));

      arrayData.add(
              new ArrayofContentsModel(
                      R.drawable.exercise_guide
                      ,"Exercise Guide"
              ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.workouts
                        ,"Workouts"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.my_workouts
                        ,"My Workouts"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.nutrition
                        ,"Nutrition"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.stretching
                        ,"Stretching"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.tips
                        ,"Tips"
                ));


        HomeContentAdapter hc = new HomeContentAdapter(arrayData, this);
      LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
      homecontent.setLayoutManager(lm);
      homecontent.setItemAnimator(new DefaultItemAnimator());
      homecontent.setAdapter(hc);
 */

    }
}
