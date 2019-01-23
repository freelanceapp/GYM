package del.gym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class NutWoman4 extends AppCompatActivity {
    LinearLayout layout1,layout2,layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut_woman4);

        layout1 = findViewById(R.id.nutman_lay_image1_wo);
        layout2 = findViewById(R.id.nutman_lay_image2_wo);
        layout3 = findViewById(R.id.nutman_lay_image3_wo);

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NutWoman4.this,NutEndActivity.class);
                startActivity(intent);
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NutWoman4.this,NutEndActivity.class);
                startActivity(intent);
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NutWoman4.this,NutritionActivity6.class);
                startActivity(intent);
            }
        });

    }
}
