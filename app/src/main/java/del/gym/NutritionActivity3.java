package del.gym;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NutritionActivity3 extends AppCompatActivity implements View.OnClickListener {

    private List<StretcingModel> nuutritionDataA3 = new ArrayList<>();
    private RecyclerView nutritionactivityrecyler3;
    ImageView tvSupplementBack;
    ImageView tvTextSup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition3);
        nutritionactivityrecyler3 = findViewById(R.id.nutrition_activity_rclv3);


        tvSupplementBack = (ImageView)findViewById(R.id.tvSupplementBack);
        tvSupplementBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        nuutritionDataA3.add(new StretcingModel(R.drawable.sua,"protein"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sub,"Creatine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suc,"Gainers"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sud,"Amino Acids / BCAAS"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sue,"Natural anabolics"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suf,"ZMA"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sug,"HMB"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suh,"Thermogenic"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sui,"L-Carnitine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suj,"CLA"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suk,"Green Tea"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sul,"Chromium Picolinate"));
       /* nuutritionDataA3.add(new StretcingModel(R.drawable.sum,"Nitric Oxide"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sun,"Ginseng"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suo,"Beta-Alanine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sup,"Caffeine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.suq,"Coenzyme Q-10"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sur,"Arginine"));
        nuutritionDataA3.add(new StretcingModel(R.drawable.sus,"Multivitamins"));*/


        NutritionActivityAdapter3 nutritionActivityAdapter3 = new NutritionActivityAdapter3(nuutritionDataA3,this,this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(NutritionActivity3.this,2);
        nutritionactivityrecyler3.setLayoutManager(gridLayoutManager);
        nutritionactivityrecyler3.setItemAnimator(new DefaultItemAnimator());
        nutritionactivityrecyler3.setAdapter(nutritionActivityAdapter3);
    }

    @Override
    public void onClick(View v) {

    }
}
