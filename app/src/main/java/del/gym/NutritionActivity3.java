package del.gym;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class NutritionActivity3 extends AppCompatActivity implements View.OnClickListener {

    private List<StretcingModel> nuutritionDataA3 = new ArrayList<>();
    private RecyclerView nutritionactivityrecyler3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition3);
        nutritionactivityrecyler3 = findViewById(R.id.nutrition_activity_rclv3);

        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"protein"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Creatine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Gainers"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Amino Acids / BCAAS"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Natural anabolics"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"ZMA"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"HMB"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Thermogenic"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"L-Carnitine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"CLA"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Green Tea"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Chromium Picolinate"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Nitric Oxide"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Ginseng"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Beta-Alanine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Caffeine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Coenzyme Q-10"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Arginine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Multivitamins"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Glutamine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Spirulina"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Reserveratrol"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Omega 3"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Glucomine/ Chondroitin"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Ginkgo Biloba"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Acai"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Alpha lipoic Acid"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Melatenin"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.nutrition_protien3,"Goji Barriers"));

        NutritionActivityAdapter3 nutritionActivityAdapter3 = new NutritionActivityAdapter3(nuutritionDataA3,this,this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(NutritionActivity3.this,3);
        nutritionactivityrecyler3.setLayoutManager(gridLayoutManager);
        nutritionactivityrecyler3.setItemAnimator(new DefaultItemAnimator());
        nutritionactivityrecyler3.setAdapter(nutritionActivityAdapter3);
    }

    @Override
    public void onClick(View v) {

    }
}
