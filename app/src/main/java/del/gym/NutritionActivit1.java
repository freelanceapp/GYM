package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class NutritionActivit1 extends AppCompatActivity {
    private List<StretcingModel> nutritionDataA1 = new ArrayList<>();
    RecyclerView nutactivityrecylerview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition1);
        nutactivityrecylerview1 = findViewById(R.id.nutrition_activity_rclv1);
        nutactivityrecylerview1.setHasFixedSize(true);
        nutactivityrecylerview1.setLayoutManager(new LinearLayoutManager(this));


        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"1800 Calories"
                ));
        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"2000 Calories"
                ));
        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"2400 Calories"
                ));
        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"2800 Calories"
                ));
        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"3000 Calories"
                ));
        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"3500 Calories"
                ));
        nutritionDataA1.add(
                new StretcingModel(
                        R.drawable.nutricion1
                        ,"4000 Calories"
                ));
        NutritionActivityAdapter1 nutritionActivityAdapter1 = new NutritionActivityAdapter1(nutritionDataA1, NutritionActivit1.this);
        LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        nutactivityrecylerview1.setLayoutManager(lm);
        nutactivityrecylerview1.setItemAnimator(new DefaultItemAnimator());
        nutactivityrecylerview1.setAdapter(nutritionActivityAdapter1);
    }
}
