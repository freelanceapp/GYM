package del.gym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class NutritionActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition4);

        LinearLayout mans = findViewById(R.id.nutrition_activity4_man);
        LinearLayout womans = findViewById(R.id.nutrition_activity4_woman);

        mans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(NutritionActivity4.this,NutMan4.class);
                startActivity(intent);
            }
        });
        womans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NutritionActivity4.this,NutWoman4.class);
                startActivity(intent);
            }
        });
    }
}
