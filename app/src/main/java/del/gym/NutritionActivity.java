package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NutritionActivity extends AppCompatActivity {

    private List<StretcingModel> nutritionData = new ArrayList<>();
    RecyclerView nutrecylerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        nutrecylerview = findViewById(R.id.nutrecyler);
        nutrecylerview.setHasFixedSize(true);
        nutrecylerview.setLayoutManager(new LinearLayoutManager(this));


        nutritionData.add(
                new StretcingModel(
                        R.drawable.tips3
                        ,"DIET PLANS"
                ));
        nutritionData.add(
                new StretcingModel(
                        R.drawable.nutrition2
                        ,"Foods"
                ));
        nutritionData.add(
                new StretcingModel(
                        R.drawable.nutimage3
                        ,"Supplements"
                ));
        nutritionData.add(
                new StretcingModel(
                        R.drawable.nutrition2
                        ,"Macronutrient meter"
                ));
        nutritionData.add(
                new StretcingModel(
                        R.drawable.tips13
                        ,"Tips"
                ));
        nutritionData.add(
                new StretcingModel(
                        R.drawable.nutimage3
                        ,"Ketogenic diet"
                ));



        NutritionAdapter nutritionAdapter = new NutritionAdapter(nutritionData,this);
        LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        nutrecylerview.setLayoutManager(lm);
        nutrecylerview.setItemAnimator(new DefaultItemAnimator());
        nutrecylerview.setAdapter(nutritionAdapter);

    }
}
