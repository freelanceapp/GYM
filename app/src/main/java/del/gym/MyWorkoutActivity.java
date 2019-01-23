package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyWorkoutActivity extends AppCompatActivity {
    private List<StretcingModel> myworkoutData = new ArrayList<>();

    RecyclerView myworecyler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_workout);
        myworecyler = findViewById(R.id.my_worecyler);
        myworecyler.setHasFixedSize(true);
        myworecyler.setLayoutManager(new LinearLayoutManager(this));


        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day1
                        ,"Monday"
                ));
        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day2
                        ,"Tuesday"
                ));
        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day3
                        ,"Wednesday"
                ));
        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day4
                        ,"Thursday"
                ));
        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day5
                        ,"Friday"
                ));
        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day6
                        ,"Saturday"
                ));
        myworkoutData.add(
                new StretcingModel(
                        R.drawable.day7
                        ,"Sunday"
                ));



        MyWorkOutAdapter myWorkOutAdapter = new MyWorkOutAdapter(myworkoutData,this);
        LinearLayoutManager lm = new LinearLayoutManager(MyWorkoutActivity.this,LinearLayoutManager.VERTICAL,false);

        myworecyler.setLayoutManager(lm);
        myworecyler.setItemAnimator(new DefaultItemAnimator());
        myworecyler.setAdapter(myWorkOutAdapter);
    }
}
