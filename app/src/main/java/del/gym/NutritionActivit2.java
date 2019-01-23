package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NutritionActivit2 extends AppCompatActivity {

    private List<NutritionModel2> nutritionDataA2 = new ArrayList<>();
    private RecyclerView nutactivityrecylerview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition2);
        nutactivityrecylerview2 = findViewById(R.id.nutrition_activity_rclv2);
        nutactivityrecylerview2.setHasFixedSize(true);
        nutactivityrecylerview2.setLayoutManager(new LinearLayoutManager(this));


        nutritionDataA2.add(
                new NutritionModel2(
                        "Milk"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Yoghurt"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Cheeses"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Eggs"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Meats"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Cold cuts and sausages"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Fish meat"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Canned fish"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "shellfish"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Vegetables"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Pulses"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Fresh fruits"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Cereals"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Fresh and Dry Pasta"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Sugars and sweets"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Chocolate and Cocos"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Pastries and desserts"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Fats"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Others"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Soft drinks"
                ));
        nutritionDataA2.add(
                new NutritionModel2(
                        "Alcoholic beverages"
                ));


        NutritionActivityAdapter2 nutritionActivityAdapter2 = new NutritionActivityAdapter2(nutritionDataA2, NutritionActivit2.this);
        LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        nutactivityrecylerview2.setLayoutManager(lm);
        nutactivityrecylerview2.setItemAnimator(new DefaultItemAnimator());
        nutactivityrecylerview2.setAdapter(nutritionActivityAdapter2);
    }
}
