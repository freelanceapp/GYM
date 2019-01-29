package del.gym;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NutritionActivity6 extends AppCompatActivity implements View.OnClickListener {
    String strCalories;
    TextView nutSunday,nutMonday, nutTuesday, nutWednesday, nutThursday, nutFriday, nutSaturday;
    TextView textDayData,tvTitle;
    String data;
    ImageView nutBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition6);

        nutMonday = (TextView) findViewById(R.id.nutMonday);
        nutSunday = (TextView) findViewById(R.id.nutSunday);
        nutSaturday = (TextView) findViewById(R.id.nutSaturday);
        nutTuesday = (TextView) findViewById(R.id.nutTuesday);
        nutThursday = (TextView) findViewById(R.id.nutThursday);
        nutWednesday = (TextView) findViewById(R.id.nutWednesday);
        nutFriday = (TextView) findViewById(R.id.nutFriday);
        textDayData = (TextView) findViewById(R.id.textDayData);
        nutBack = (ImageView) findViewById(R.id.nutBack);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        nutBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        nutFriday.setOnClickListener(this);
        nutWednesday.setOnClickListener(this);
        nutThursday.setOnClickListener(this);
        nutTuesday.setOnClickListener(this);
        nutSaturday.setOnClickListener(this);
        nutSunday.setOnClickListener(this);
        nutMonday.setOnClickListener(this);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textDayData.setText("Breakfast: Eggs with bacon (Calories: 704, fat: 64, carbohydrates: 2, proteins: 30) \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Lunch: Minipizzas (Calories: 427, fats: 35, carbohydrates: 4, proteins: 24) \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Food: Pork chops (Calories: 532, fats: 30, carbohydrates: 5, proteins: 68)\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Dinner: Crunchy green beans (Calories: 221, fat: 21, carbohydrates: 3, protein: 5)");
        }
        
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nutMonday:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    textDayData.setText("Breakfast: Eggs with bacon (Calories: 704, fat: 64, carbohydrates: 2, proteins: 30) \n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Lunch: Minipizzas (Calories: 427, fats: 35, carbohydrates: 4, proteins: 24) \n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Food: Pork chops (Calories: 532, fats: 30, carbohydrates: 5, proteins: 68)\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Dinner: Crunchy green beans (Calories: 221, fat: 21, carbohydrates: 3, protein: 5)");
                }
                break;
            case R.id.nutTuesday:
                textDayData.setText("Breakfast: Sausage omelette with spinach (Calories 523, fat: 43, carbohydrates: 3, proteins: 31) \n" +
                        "\n" +
                        "Lunch: We can not have lunch or reserve part of breakfast for lunch or lunch. \n" +
                        "\n" +
                        "Food: Meat wrapped with bacon (Calories: 449, fats: 33, carbohydrates: 3,5, \n" +
                        "protein: 34.5) \n" +
                        "\n" +
                        "Dinner: 2x Cirspy Mini pizzas (Calories: 918, fats: 70, carbohydrates: 8,\n");

                break;
            case R.id.nutWednesday:
                textDayData.setText("Breakfast: Bacon frittata (Calories: 482, fats: 38, carbohydrates: 2, proteins: 33) \n" +
                        "\n" +
                        "Lunch: A cup of Parmesan cheese (Calories: 326, fat: 22, carbohydrates: 2, protein: 30) \n" +
                        "\n" +
                        "Food: Curried chicken with butter: (Calories: 481, fat: 44, carbohydrates: 2, protein: 17) \n" +
                        "\n" +
                        "Dinner: Rice with cauliflower (Calories: 249, fats: 21, carbohydrates: 1, protein 14)\n");

                break;
            case R.id.nutThursday:
                textDayData.setText("Breakfast: 1 Cup of coffee (Calories: 482, fats: 38, carbohydrates: 2, protein: 33 and 2 tablespoons of coconut oil (Calories: 252, fats: 28, carbohydrates: 0, proteins: 0) \n" +
                        "\n" +
                        "Lunch: Bacon frittata (Calories: 482, fats: 38, carbohydrates: 2, proteins: 33) \n" +
                        "\n" +
                        "Food: Meat with chili (Calories: 365, fat: 25, carbohydrates: 6, proteins: 29) (Calories: 312, fat: 24, carbohydrates: 0, protein: 24) \n" +
                        "\n" +
                        "Dinner ½ cup parmesan cheese (Calories: 223, fats: 11, carbohydrates: 1, proteins: 30)\n");

                break;
            case R.id.nutFriday:
                textDayData.setText("Breakfast: Pumpkin pancakes (Calories: 579, fat: 51, carbohydrate: 8, protein: 22) \n" +
                        "\n" +
                        "Lunch: one teaspoon and ½ coconut oil (Calories: 189, fat :, 21, carbohydrates: 0, protein: 0) \n" +
                        "\n" +
                        "Food: Bacon wrapped meat (Calories: 449, fat: 33, carbohydrate: 3.5, protein: 34.5) \n" +
                        "\n" +
                        "Dinner: Portobello hamburger (Calories: 684, fats: 48, carbohydrates: 3, proteins: 60)\n");

                break;
            case R.id.nutSaturday:
                textDayData.setText("Breakfast: 1 Cup of coffee (Calories: 482, fats: 38, carbohydrates: 2, protein: 33 and 2 tablespoons of coconut oil (Calories: 252, fats: 28, carbohydrates: 0, proteins: 0) \n" +
                        "\n" +
                        "Lunch: Bacon frittata (Calories: 482, fats: 38, carbohydrates: 2, proteins: 33) \n" +
                        "\n" +
                        "Food: Meat with chili (Calories: 365, fat: 25, carbohydrates: 6, proteins: 29) (Calories: 312, fat: 24, carbohydrates: 0, protein: 24) \n" +
                        "\n" +
                        "Dinner ½ cup parmesan cheese (Calories: 223, fats: 11, carbohydrates: 1, proteins: 30)\n");

                break;
            case R.id.nutSunday:
                textDayData.setText("Breakfast: Ketogenic Butter Packs (Calories: 210, Fats: 10, Carbohydrates: 5, Protein: 25) and 2 Tablespoons of Coconut Oil (Calories: 252, Fat: 28, Carbohydrate: 0, Protein: 0) \n" +
                        "\n" +
                        "Lunch: Meat wrapped in bacon (Calories: 449, fats: 33, carbohydrates: 3.5, protein: 34.5) \n" +
                        "\n" +
                        "Food: Low-carbohydrate mashed potatoes (Calories: 76, fats: 5, carbohydrates: 5m proteins: 1 and a tablespoon of butter (Calories: 99, fat: 11, carbohydrates: 0, protein 0) \n" +
                        "\n" +
                        "Dinner: Portobello Burgers (Calories: 684, fat: 48 carbohydrates: 3, protein: 60) and a tablespoon of olive oil (Calories: 120, fat: 14, carbohydrates: 0, protein 0)\n");

                break;

        }
    }
}
