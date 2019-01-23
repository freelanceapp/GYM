package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StretchingActivity extends AppCompatActivity {

    private List<StretcingModel> stretcingData = new ArrayList<>();

    RecyclerView stretchingrecylerview;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);

        stretchingrecylerview = findViewById(R.id.strecyler);
        stretchingrecylerview.setHasFixedSize(true);
        stretchingrecylerview.setHasFixedSize(true);


        stretcingData.add(new StretcingModel(R.drawable.enviroment_improve_medicine,"Back Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips2,"Back Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips3,"Back Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips4,"Back Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips5,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips,"Back Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips1,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips2,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips3,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips4,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips4,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips13,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips6,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Biceps"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Biceps"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Biceps"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Chest"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Triceps"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Shoulders"));
        stretcingData.add(new StretcingModel(R.drawable.tips,"Shoulders"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Shoulders"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Back"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Abdomen"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Abdomen"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Back Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Abdomen"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Abdomen"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Front Leg"));
        stretcingData.add(new StretcingModel(R.drawable.tips7,"Front Leg"));




        StretchingAdapter stretchingAdapter = new StretchingAdapter(stretcingData,this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(StretchingActivity.this,2);
        stretchingrecylerview.setLayoutManager(gridLayoutManager);
        stretchingrecylerview.setItemAnimator(new DefaultItemAnimator());
        stretchingrecylerview.setAdapter(stretchingAdapter);
    }
}
