package del.gym;

import android.graphics.Color;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NutDietA1 extends AppCompatActivity implements View.OnClickListener {

    String strCalories;
    TextView nutSunday,nutMonday, nutTuesday, nutWednesday, nutThursday, nutFriday, nutSaturday;
    TextView textDayData,tvTitle;
    String data;
    ImageView nutBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut_diet_a1);

        strCalories = getIntent().getStringExtra("Calories");

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

        if (strCalories.equals("1800 Calories"))
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml(" <p><strong>Breakfast (382 calories)</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread<br />-1/ 2 medium avocado<br />-1 large egg , cooked in 1 / 4 tsp. olive oil or<br />coat pan with a thin layer of cooking spray<br />( 1-second spray )<br />Season egg with a pinch of salt and pepper .<br />-2 clementines<br /><br /><strong>Morning Snack ( 305 calories )</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong>Lunch ( 407 calories )</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br />preferably whole-wheat<br />-3 Tbsp. shredded Cheddar cheese<br />Top baguette slices with 1 1/2 Tbsp. cheese<br />each and a pinch of pepper. Toast until cheese is melted. cheese <br />each and a pinch of pepper . Toast until<br />cheese is melted. <br /><br /><strong>Afternoon Snack ( 169 calories )</strong><br /><br />-4 Tbsp. hummus<br />-1 cup sliced cucumber<br />-2 medium carrots<br /><br /><strong>Dinner ( 560 calories )</strong><br /><br />-1 1/2 cups Delicata Squash and Tofu Curry<br />-Serve curry over 1 cup brown rice<br /><br /><strong>Evening Snack ( 133 calories)</strong><br /><br />Salmon and Vegetables<br />-4 oz. baked salmon <br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice<br />-1/8 tsp. salt <br />- 1/8 tsp. pepper <br />- 1 Tbsp. walnuts <br />Vinaigrette <br />- Combine 1 1/2 tsp each olive oil, lemon<br /> juice and maple syrup; season with 1/8 tsp.<br /> salt. <br />Toss Brussels sprouts in 1/2 tsp. olive oil<br /> and bake at 425°F until lightly browned, 15<br /> to 20 minutes. Coat salmon with 1/4 tsp.<br /> olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each<br /> salt and pepper. Bake at 425°F until opaque <br />in the middle, 4 to 6 minutes. Serve Brussels <br />sprouts, salmon and brown rice drizzled with <br />vinaigrette and topped with walnuts.<br /><br /></p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<p><strong>Breakfast (382 calories)</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread<br />-1/ 2 medium avocado<br />-1 large egg , cooked in 1 / 4 tsp. olive oil or<br />coat pan with a thin layer of cooking spray<br />( 1-second spray )<br />Season egg with a pinch of salt and pepper .<br />-2 clementines<br /><br /><strong>Morning Snack ( 305 calories )</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong>Lunch ( 407 calories )</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br />preferably whole-wheat<br />-3 Tbsp. shredded Cheddar cheese<br />Top baguette slices with 1 1/2 Tbsp. cheese<br />each and a pinch of pepper. Toast until cheese is melted. cheese <br />each and a pinch of pepper . Toast until<br />cheese is melted. <br /><br /><strong>Afternoon Snack ( 169 calories )</strong><br /><br />-4 Tbsp. hummus<br />-1 cup sliced cucumber<br />-2 medium carrots<br /><br /><strong>Dinner ( 560 calories )</strong><br /><br />-1 1/2 cups Delicata Squash and Tofu Curry<br />-Serve curry over 1 cup brown rice<br /><br /><strong>Evening Snack ( 133 calories)</strong><br /><br />Salmon and Vegetables<br />-4 oz. baked salmon <br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice<br />-1/8 tsp. salt <br />- 1/8 tsp. pepper <br />- 1 Tbsp. walnuts <br />Vinaigrette <br />- Combine 1 1/2 tsp each olive oil, lemon<br /> juice and maple syrup; season with 1/8 tsp.<br /> salt. <br />Toss Brussels sprouts in 1/2 tsp. olive oil<br /> and bake at 425°F until lightly browned, 15<br /> to 20 minutes. Coat salmon with 1/4 tsp.<br /> olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each<br /> salt and pepper. Bake at 425°F until opaque <br />in the middle, 4 to 6 minutes. Serve Brussels <br />sprouts, salmon and brown rice drizzled with <br />vinaigrette and topped with walnuts.<br /><br /></p>"));
            }
        }else if (strCalories.equals("2000 Calories"))
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml("<p><strong>Breakfast (417 calories)</strong><br /><br />\n" +
                        "Avocado-Egg Toast <br />-1 slice whole-grain bread<br />-1/2 medium avocado <br />-1 large egg, cooked in 1/4 tsp. olive oil or<br /> coat pan with a thin layer of cooking spray<br /> (1-second spray) <br />Season egg with a pinch of salt and pepper.<br />-1 medium banana <br /><br /><strong> Morning Snack (305 calories)</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong> Lunch (468 calories)</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-3 Tbsp. shredded Cheddar cheese<br /> Top baguette slices with 1 1/2 Tbsp. cheese<br /> each and a pinch of pepper. Toast until<br /> cheese is melted.<br />- 1 medium orange <br />\n" +
                        "  <br /><br /><strong> Afternoon Snack (220 calories)</strong><br /><br />-5 Tbsp. hummus <br />-1 cup sliced cucumber <br />-2 medium carrots <br /><br /><strong>Dinner (584 calories)</strong><br /><br />Salmon and Vegetables <br />-4 oz. baked salmon<br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice <br />-1/8 tsp. salt <br />-1/8 tsp. pepper<br />-1 1/2 Tbsp. walnuts<br /><br /> Vinaigrette<br />- Combine 1 1/2 tsp. each olive oil,lemon<br /> juice and maple syrup; season with 1/8 tsp. <br />salt.<br /><br />Toss Brussels sprouts with 1/2 tsp. olive<br />oil and bake at 425°F until lightly browned,<br /> 15 to 20 minutes. Coat salmon with 1/4 tsp. <br />olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each <br />salt and pepper. Bake at 425°F until opaque<br /> in the middle, 4 to 6 minutes. Serve Brussels<br /> sprouts, salmon and brown rice drizzled with<br /> the vinaigrette and topped with walnuts.</p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<p><strong>Breakfast (417 calories)</strong><br /><br />\n" +
                        "Avocado-Egg Toast <br />-1 slice whole-grain bread<br />-1/2 medium avocado <br />-1 large egg, cooked in 1/4 tsp. olive oil or<br /> coat pan with a thin layer of cooking spray<br /> (1-second spray) <br />Season egg with a pinch of salt and pepper.<br />-1 medium banana <br /><br /><strong> Morning Snack (305 calories)</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong> Lunch (468 calories)</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-3 Tbsp. shredded Cheddar cheese<br /> Top baguette slices with 1 1/2 Tbsp. cheese<br /> each and a pinch of pepper. Toast until<br /> cheese is melted.<br />- 1 medium orange <br />\n" +
                        "  <br /><br /><strong> Afternoon Snack (220 calories)</strong><br /><br />-5 Tbsp. hummus <br />-1 cup sliced cucumber <br />-2 medium carrots <br /><br /><strong>Dinner (584 calories)</strong><br /><br />Salmon and Vegetables <br />-4 oz. baked salmon<br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice <br />-1/8 tsp. salt <br />-1/8 tsp. pepper<br />-1 1/2 Tbsp. walnuts<br /><br /> Vinaigrette<br />- Combine 1 1/2 tsp. each olive oil,lemon<br /> juice and maple syrup; season with 1/8 tsp. <br />salt.<br /><br />Toss Brussels sprouts with 1/2 tsp. olive<br />oil and bake at 425°F until lightly browned,<br /> 15 to 20 minutes. Coat salmon with 1/4 tsp. <br />olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each <br />salt and pepper. Bake at 425°F until opaque<br /> in the middle, 4 to 6 minutes. Serve Brussels<br /> sprouts, salmon and brown rice drizzled with<br /> the vinaigrette and topped with walnuts.</p>"));
            }
        }else if (strCalories.equals("2400 Calories"))
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml("<p><strong>Meal 1</strong><br /><br />Oat Bran1/2 cup <br />Banana 1 <br />Eggs EGG YOLK 1 <br />Hardboiled Eggs 6.<br /><br /><strong> Meal 2</strong><br /><br />Yogurt 1 cup Cottage <br />Cheese 1 cup <br />Grapes 1 <br />Flaxseed 1 tbsp. <br /><br /><strong> Meal 3</strong><br /><br />Spinach 3 cups<br />Turkey Bacon 2 strips<br />Mushrooms 1/2 cup <br />Carrots 1 cup <br />Grilled Chicken 3 oz <br />Balsamic Vinegar.<br/><br/><strong> Meal 4</strong><br /><br />Apple1 <br />Walnuts 1/2 oz <br />Protein 1 scoop.<br/><br/> <strong> Meal 5</strong> <br /><br />Salmon3 oz <br/>Rice 1/4 cup <br/> Swiss Chard <br/> 2 cups Steamed.<br/><br/>\n" +
                        "<strong> Meal 6</strong>\n" +
                        "<br/><br/>Cottage Cheese1 cup<br/> Almonds 1 oz <br/>Tomato 1/3 cup<br/> Basil Leaves<br/> Balsamic Vinegar.</p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<p><strong>Meal 1</strong><br /><br />Oat Bran1/2 cup <br />Banana 1 <br />Eggs EGG YOLK 1 <br />Hardboiled Eggs 6.<br /><br /><strong> Meal 2</strong><br /><br />Yogurt 1 cup Cottage <br />Cheese 1 cup <br />Grapes 1 <br />Flaxseed 1 tbsp. <br /><br /><strong> Meal 3</strong><br /><br />Spinach 3 cups<br />Turkey Bacon 2 strips<br />Mushrooms 1/2 cup <br />Carrots 1 cup <br />Grilled Chicken 3 oz <br />Balsamic Vinegar.<br/><br/><strong> Meal 4</strong><br /><br />Apple1 <br />Walnuts 1/2 oz <br />Protein 1 scoop.<br/><br/> <strong> Meal 5</strong> <br /><br />Salmon3 oz <br/>Rice 1/4 cup <br/> Swiss Chard <br/> 2 cups Steamed.<br/><br/>\n" +
                        "<strong> Meal 6</strong>\n" +
                        "<br/><br/>Cottage Cheese1 cup<br/> Almonds 1 oz <br/>Tomato 1/3 cup<br/> Basil Leaves<br/> Balsamic Vinegar.</p>"));
            }
        }else if (strCalories.equals("2800 Calories"))
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
            }
        }else if (strCalories.equals("3000 Calories"))
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
            }
        }else if (strCalories.equals("3500 Calories"))
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml("<p><strong>Example of Low Carb Day Menu: protein 49%% carbs 28%% fat 23%%</strong><br /><br /><strong>7am Breakfast</strong><br />3 eggs <br />1.5 oz cheese<br /><br />4 oz salsa <br />5 grilled asparagus spears <br />2 scoops whey</p>\n" +
                        "<p><strong>10 am snack 1</strong></p>\n" +
                        "<p>3 scoops whey protein powder</p>\n" +
                        "<p><strong>1 pm lunch</strong></p>\n" +
                        "<p>8 oz sliced turkey breast<br />4 pieces whole wheat bread carrot sticks (from 2 carrots) lettuce<br />2 scoops whey</p>\n" +
                        "<p><strong>4 pm snack 2</strong></p>\n" +
                        "<p>2.5 cups strawberries <br />1.5 cups 1%% fat cottage cheese</p>\n" +
                        "<p><strong>7:15 dinner</strong></p>\n" +
                        "<p>12 oz salmon<br />2 baked potatoes <br />1 cup broccoli</p>\n" +
                        "<p><strong>9:30:00 PM bedtime supplements</strong> <br /><br /><strong>10 pm bedtime</strong></p>\n" +
                        "<p>2 scoops casein protein <br />1 tablespoon flaxseed oil</p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<p><strong>Example of Low Carb Day Menu: protein 49%% carbs 28%% fat 23%%</strong><br /><br /><strong>7am Breakfast</strong><br />3 eggs <br />1.5 oz cheese<br /><br />4 oz salsa <br />5 grilled asparagus spears <br />2 scoops whey</p>\n" +
                        "<p><strong>10 am snack 1</strong></p>\n" +
                        "<p>3 scoops whey protein powder</p>\n" +
                        "<p><strong>1 pm lunch</strong></p>\n" +
                        "<p>8 oz sliced turkey breast<br />4 pieces whole wheat bread carrot sticks (from 2 carrots) lettuce<br />2 scoops whey</p>\n" +
                        "<p><strong>4 pm snack 2</strong></p>\n" +
                        "<p>2.5 cups strawberries <br />1.5 cups 1%% fat cottage cheese</p>\n" +
                        "<p><strong>7:15 dinner</strong></p>\n" +
                        "<p>12 oz salmon<br />2 baked potatoes <br />1 cup broccoli</p>\n" +
                        "<p><strong>9:30:00 PM bedtime supplements</strong> <br /><br /><strong>10 pm bedtime</strong></p>\n" +
                        "<p>2 scoops casein protein <br />1 tablespoon flaxseed oil</p>"));
            }
        }else  if (strCalories.equals("4000 Calories")){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                textDayData.setText(Html.fromHtml("", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml(""));
            }
        }



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nutMonday:
                nutMonday.setTextColor(Color.WHITE);
                nutSunday.setTextColor(Color.LTGRAY);
                nutSaturday.setTextColor(Color.LTGRAY);
                nutTuesday.setTextColor(Color.LTGRAY);
                nutThursday.setTextColor(Color.LTGRAY);
                nutWednesday.setTextColor(Color.LTGRAY);
                nutFriday.setTextColor(Color.LTGRAY);
                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (382 calories)</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread<br />-1/ 2 medium avocado<br />-1 large egg , cooked in 1 / 4 tsp. olive oil or<br />coat pan with a thin layer of cooking spray<br />( 1-second spray )<br />Season egg with a pinch of salt and pepper .<br />-2 clementines<br /><br /><strong>Morning Snack ( 305 calories )</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong>Lunch ( 407 calories )</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br />preferably whole-wheat<br />-3 Tbsp. shredded Cheddar cheese<br />Top baguette slices with 1 1/2 Tbsp. cheese<br />each and a pinch of pepper. Toast until cheese is melted. cheese <br />each and a pinch of pepper . Toast until<br />cheese is melted. <br /><br /><strong>Afternoon Snack ( 169 calories )</strong><br /><br />-4 Tbsp. hummus<br />-1 cup sliced cucumber<br />-2 medium carrots<br /><br /><strong>Dinner ( 560 calories )</strong><br /><br />-1 1/2 cups Delicata Squash and Tofu Curry<br />-Serve curry over 1 cup brown rice<br /><br /><strong>Evening Snack ( 133 calories)</strong><br /><br />Salmon and Vegetables<br />-4 oz. baked salmon <br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice<br />-1/8 tsp. salt <br />- 1/8 tsp. pepper <br />- 1 Tbsp. walnuts <br />Vinaigrette <br />- Combine 1 1/2 tsp each olive oil, lemon<br /> juice and maple syrup; season with 1/8 tsp.<br /> salt. <br />Toss Brussels sprouts in 1/2 tsp. olive oil<br /> and bake at 425°F until lightly browned, 15<br /> to 20 minutes. Coat salmon with 1/4 tsp.<br /> olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each<br /> salt and pepper. Bake at 425°F until opaque <br />in the middle, 4 to 6 minutes. Serve Brussels <br />sprouts, salmon and brown rice drizzled with <br />vinaigrette and topped with walnuts.<br /><br /></p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (382 calories)</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread<br />-1/ 2 medium avocado<br />-1 large egg , cooked in 1 / 4 tsp. olive oil or<br />coat pan with a thin layer of cooking spray<br />( 1-second spray )<br />Season egg with a pinch of salt and pepper .<br />-2 clementines<br /><br /><strong>Morning Snack ( 305 calories )</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong>Lunch ( 407 calories )</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br />preferably whole-wheat<br />-3 Tbsp. shredded Cheddar cheese<br />Top baguette slices with 1 1/2 Tbsp. cheese<br />each and a pinch of pepper. Toast until cheese is melted. cheese <br />each and a pinch of pepper . Toast until<br />cheese is melted. <br /><br /><strong>Afternoon Snack ( 169 calories )</strong><br /><br />-4 Tbsp. hummus<br />-1 cup sliced cucumber<br />-2 medium carrots<br /><br /><strong>Dinner ( 560 calories )</strong><br /><br />-1 1/2 cups Delicata Squash and Tofu Curry<br />-Serve curry over 1 cup brown rice<br /><br /><strong>Evening Snack ( 133 calories)</strong><br /><br />Salmon and Vegetables<br />-4 oz. baked salmon <br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice<br />-1/8 tsp. salt <br />- 1/8 tsp. pepper <br />- 1 Tbsp. walnuts <br />Vinaigrette <br />- Combine 1 1/2 tsp each olive oil, lemon<br /> juice and maple syrup; season with 1/8 tsp.<br /> salt. <br />Toss Brussels sprouts in 1/2 tsp. olive oil<br /> and bake at 425°F until lightly browned, 15<br /> to 20 minutes. Coat salmon with 1/4 tsp.<br /> olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each<br /> salt and pepper. Bake at 425°F until opaque <br />in the middle, 4 to 6 minutes. Serve Brussels <br />sprouts, salmon and brown rice drizzled with <br />vinaigrette and topped with walnuts.<br /><br /></p>"));
                    }
                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (417 calories)</strong><br /><br />\n" +
                                "Avocado-Egg Toast <br />-1 slice whole-grain bread<br />-1/2 medium avocado <br />-1 large egg, cooked in 1/4 tsp. olive oil or<br /> coat pan with a thin layer of cooking spray<br /> (1-second spray) <br />Season egg with a pinch of salt and pepper.<br />-1 medium banana <br /><br /><strong> Morning Snack (305 calories)</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong> Lunch (468 calories)</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-3 Tbsp. shredded Cheddar cheese<br /> Top baguette slices with 1 1/2 Tbsp. cheese<br /> each and a pinch of pepper. Toast until<br /> cheese is melted.<br />- 1 medium orange <br />\n" +
                                "  <br /><br /><strong> Afternoon Snack (220 calories)</strong><br /><br />-5 Tbsp. hummus <br />-1 cup sliced cucumber <br />-2 medium carrots <br /><br /><strong>Dinner (584 calories)</strong><br /><br />Salmon and Vegetables <br />-4 oz. baked salmon<br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice <br />-1/8 tsp. salt <br />-1/8 tsp. pepper<br />-1 1/2 Tbsp. walnuts<br /><br /> Vinaigrette<br />- Combine 1 1/2 tsp. each olive oil,lemon<br /> juice and maple syrup; season with 1/8 tsp. <br />salt.<br /><br />Toss Brussels sprouts with 1/2 tsp. olive<br />oil and bake at 425°F until lightly browned,<br /> 15 to 20 minutes. Coat salmon with 1/4 tsp. <br />olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each <br />salt and pepper. Bake at 425°F until opaque<br /> in the middle, 4 to 6 minutes. Serve Brussels<br /> sprouts, salmon and brown rice drizzled with<br /> the vinaigrette and topped with walnuts.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (417 calories)</strong><br /><br />\n" +
                                "Avocado-Egg Toast <br />-1 slice whole-grain bread<br />-1/2 medium avocado <br />-1 large egg, cooked in 1/4 tsp. olive oil or<br /> coat pan with a thin layer of cooking spray<br /> (1-second spray) <br />Season egg with a pinch of salt and pepper.<br />-1 medium banana <br /><br /><strong> Morning Snack (305 calories)</strong><br /><br />-1 medium apple<br />-2 Tbsp. peanut butter<br /><br /><strong> Lunch (468 calories)</strong><br /><br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-3 Tbsp. shredded Cheddar cheese<br /> Top baguette slices with 1 1/2 Tbsp. cheese<br /> each and a pinch of pepper. Toast until<br /> cheese is melted.<br />- 1 medium orange <br />\n" +
                                "  <br /><br /><strong> Afternoon Snack (220 calories)</strong><br /><br />-5 Tbsp. hummus <br />-1 cup sliced cucumber <br />-2 medium carrots <br /><br /><strong>Dinner (584 calories)</strong><br /><br />Salmon and Vegetables <br />-4 oz. baked salmon<br />-1 cup roasted Brussels sprouts <br />-1 cup brown rice <br />-1/8 tsp. salt <br />-1/8 tsp. pepper<br />-1 1/2 Tbsp. walnuts<br /><br /> Vinaigrette<br />- Combine 1 1/2 tsp. each olive oil,lemon<br /> juice and maple syrup; season with 1/8 tsp. <br />salt.<br /><br />Toss Brussels sprouts with 1/2 tsp. olive<br />oil and bake at 425°F until lightly browned,<br /> 15 to 20 minutes. Coat salmon with 1/4 tsp. <br />olive oil or a thin layer of cooking spray (1-<br />second spray) and season with 1/8 tsp. each <br />salt and pepper. Bake at 425°F until opaque<br /> in the middle, 4 to 6 minutes. Serve Brussels<br /> sprouts, salmon and brown rice drizzled with<br /> the vinaigrette and topped with walnuts.</p>"));
                    }
                } else if (strCalories.equals("2400 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Meal 1</strong><br /><br />Oat Bran1/2 cup <br />Banana 1 <br />Eggs EGG YOLK 1 <br />Hardboiled Eggs 6.<br /><br /><strong> Meal 2</strong><br /><br />Yogurt 1 cup Cottage <br />Cheese 1 cup <br />Grapes 1 <br />Flaxseed 1 tbsp. <br /><br /><strong> Meal 3</strong><br /><br />Spinach 3 cups<br />Turkey Bacon 2 strips<br />Mushrooms 1/2 cup <br />Carrots 1 cup <br />Grilled Chicken 3 oz <br />Balsamic Vinegar.<br/><br/><strong> Meal 4</strong><br /><br />Apple1 <br />Walnuts 1/2 oz <br />Protein 1 scoop.<br/><br/> <strong> Meal 5</strong> <br /><br />Salmon3 oz <br/>Rice 1/4 cup <br/> Swiss Chard <br/> 2 cups Steamed.<br/><br/>\n" +
                                "<strong> Meal 6</strong>\n" +
                                "<br/><br/>Cottage Cheese1 cup<br/> Almonds 1 oz <br/>Tomato 1/3 cup<br/> Basil Leaves<br/> Balsamic Vinegar.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Meal 1</strong><br /><br />Oat Bran1/2 cup <br />Banana 1 <br />Eggs EGG YOLK 1 <br />Hardboiled Eggs 6.<br /><br /><strong> Meal 2</strong><br /><br />Yogurt 1 cup Cottage <br />Cheese 1 cup <br />Grapes 1 <br />Flaxseed 1 tbsp. <br /><br /><strong> Meal 3</strong><br /><br />Spinach 3 cups<br />Turkey Bacon 2 strips<br />Mushrooms 1/2 cup <br />Carrots 1 cup <br />Grilled Chicken 3 oz <br />Balsamic Vinegar.<br/><br/><strong> Meal 4</strong><br /><br />Apple1 <br />Walnuts 1/2 oz <br />Protein 1 scoop.<br/><br/> <strong> Meal 5</strong> <br /><br />Salmon3 oz <br/>Rice 1/4 cup <br/> Swiss Chard <br/> 2 cups Steamed.<br/><br/>\n" +
                                "<strong> Meal 6</strong>\n" +
                                "<br/><br/>Cottage Cheese1 cup<br/> Almonds 1 oz <br/>Tomato 1/3 cup<br/> Basil Leaves<br/> Balsamic Vinegar.</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Example of Low Carb Day Menu: protein 49%% carbs 28%% fat 23%%</strong><br /><br /><strong>7am Breakfast</strong><br />3 eggs <br />1.5 oz cheese<br /><br />4 oz salsa <br />5 grilled asparagus spears <br />2 scoops whey</p>\n" +
                                "<p><strong>10 am snack 1</strong></p>\n" +
                                "<p>3 scoops whey protein powder</p>\n" +
                                "<p><strong>1 pm lunch</strong></p>\n" +
                                "<p>8 oz sliced turkey breast<br />4 pieces whole wheat bread carrot sticks (from 2 carrots) lettuce<br />2 scoops whey</p>\n" +
                                "<p><strong>4 pm snack 2</strong></p>\n" +
                                "<p>2.5 cups strawberries <br />1.5 cups 1%% fat cottage cheese</p>\n" +
                                "<p><strong>7:15 dinner</strong></p>\n" +
                                "<p>12 oz salmon<br />2 baked potatoes <br />1 cup broccoli</p>\n" +
                                "<p><strong>9:30:00 PM bedtime supplements</strong> <br /><br /><strong>10 pm bedtime</strong></p>\n" +
                                "<p>2 scoops casein protein <br />1 tablespoon flaxseed oil</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Example of Low Carb Day Menu: protein 49%% carbs 28%% fat 23%%</strong><br /><br /><strong>7am Breakfast</strong><br />3 eggs <br />1.5 oz cheese<br /><br />4 oz salsa <br />5 grilled asparagus spears <br />2 scoops whey</p>\n" +
                                "<p><strong>10 am snack 1</strong></p>\n" +
                                "<p>3 scoops whey protein powder</p>\n" +
                                "<p><strong>1 pm lunch</strong></p>\n" +
                                "<p>8 oz sliced turkey breast<br />4 pieces whole wheat bread carrot sticks (from 2 carrots) lettuce<br />2 scoops whey</p>\n" +
                                "<p><strong>4 pm snack 2</strong></p>\n" +
                                "<p>2.5 cups strawberries <br />1.5 cups 1%% fat cottage cheese</p>\n" +
                                "<p><strong>7:15 dinner</strong></p>\n" +
                                "<p>12 oz salmon<br />2 baked potatoes <br />1 cup broccoli</p>\n" +
                                "<p><strong>9:30:00 PM bedtime supplements</strong> <br /><br /><strong>10 pm bedtime</strong></p>\n" +
                                "<p>2 scoops casein protein <br />1 tablespoon flaxseed oil</p>"));
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml(""));
                    }
                }
                break;
            case R.id.nutTuesday:
                nutMonday.setTextColor(Color.LTGRAY);
                nutSunday.setTextColor(Color.LTGRAY);
                nutSaturday.setTextColor(Color.LTGRAY);
                nutTuesday.setTextColor(Color.WHITE);
                nutThursday.setTextColor(Color.LTGRAY);
                nutWednesday.setTextColor(Color.LTGRAY);
                nutFriday.setTextColor(Color.LTGRAY);
                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast ( 382 calories )</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread<br />-1/ 2 medium avocado<br />-1 large egg , cooked in 1 / 4 tsp. olive oil or<br />coat pan with a thin layer of cooking spray<br />( 1-second spray )<br />Season egg with a pinch of salt and pepper .<br />-2 clementines<br /><br /><strong>Morning Snack ( 172 calories )</strong><br /><br />-8 dried apricots<br />-8 walnut halves<br /><br /><strong>Lunch ( 441 calories )</strong><br /><br />Leftover soup<br />-2 cups Ravioli and Vegetable Soup<br />-2 diagonal slices baguette ( 1 / 4 inch thick ),<br />preferably whole-wheat<br />-3 Tbsp. shredded Cheddar cheese<br />Top each baguette slice with 1 1 / 2 Tbsp.<br />cheese and a pinch of pepper . Toast until<br />cheese is melted.<br />-1 clementine<br /><br /><strong>Afternoon Snack ( 154 calories )</strong><br /><br />-4 Tbsp. hummus<br />-2 medium carrots<br /><br /><strong>Dinner ( 533 calories )</strong><br /><br />-1 1/2 cups Delicata Squash and Tofu Curry<br />-Serve curry over 1 cup brown rice<br /><br /><strong>Evening Snack ( 133 calories)</strong><br /><br />-2 Medjool date<br /><br />Plan Ahead : Make Maple-Nut Granola for<br />tomorrow . You can also buy granola , to make<br />things easier . Aim for a granola that has<br />around 130 calories ( or less ) and less than 6<br />grams of sugar per 1 / 4 cup.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast ( 382 calories )</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread<br />-1/ 2 medium avocado<br />-1 large egg , cooked in 1 / 4 tsp. olive oil or<br />coat pan with a thin layer of cooking spray<br />( 1-second spray )<br />Season egg with a pinch of salt and pepper .<br />-2 clementines<br /><br /><strong>Morning Snack ( 172 calories )</strong><br /><br />-8 dried apricots<br />-8 walnut halves<br /><br /><strong>Lunch ( 441 calories )</strong><br /><br />Leftover soup<br />-2 cups Ravioli and Vegetable Soup<br />-2 diagonal slices baguette ( 1 / 4 inch thick ),<br />preferably whole-wheat<br />-3 Tbsp. shredded Cheddar cheese<br />Top each baguette slice with 1 1 / 2 Tbsp.<br />cheese and a pinch of pepper . Toast until<br />cheese is melted.<br />-1 clementine<br /><br /><strong>Afternoon Snack ( 154 calories )</strong><br /><br />-4 Tbsp. hummus<br />-2 medium carrots<br /><br /><strong>Dinner ( 533 calories )</strong><br /><br />-1 1/2 cups Delicata Squash and Tofu Curry<br />-Serve curry over 1 cup brown rice<br /><br /><strong>Evening Snack ( 133 calories)</strong><br /><br />-2 Medjool date<br /><br />Plan Ahead : Make Maple-Nut Granola for<br />tomorrow . You can also buy granola , to make<br />things easier . Aim for a granola that has<br />around 130 calories ( or less ) and less than 6<br />grams of sugar per 1 / 4 cup.</p>"));
                    }
                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (414 calories)</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread <br />-1/2 medium avocado <br />-1 large egg, cooked in 1/4 tsp. olive oil or<br /> coat pan with a thin layer of cooking spray <br />(1-second spray)<br />Season egg with a pinch of salt and pepper <br />- 1 medium pear<br /><br /><strong>Morning Snack (266 calories)</strong><br /><br />-7 dried apricots <br />-7 walnut halves <br />-1 oz. Cheddar cheese <br /><br /><strong>Lunch (468 calories)<br /><br /></strong>Leftover soup <br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-3 Tbsp. shredded Cheddar cheese<br /> Top each baguette slice with 1 1/2 Tbsp.<br /> cheese and a pinch of pepper. Toast until<br /> cheese is melted. <br />-1 medium orange <br /><br /><strong>Afternoon Snack (179 calories)</strong><br /><br />-4 Tbsp. hummus <br />-3 medium carrots <br /><br /><strong>Dinner (533 calories</strong><br /><br /> -1 1/2 cups Delicata Squash and Tofu Curry <br /> -Serve curry over 1 cup brown rice <br /><br /><strong>Evening Snack (133 calories)</strong><br /><br />-2 Medjool dates<br /> Plan Ahead: Make Maple-Nut Granola for<br /> tomorrow. You can also buy granola, to make<br />things easier. Aim for a granola that has<br /> around 130 calories (or less) and less than 6 <br />grams of sugar per 1/4 cup.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (414 calories)</strong><br /><br />Avocado-Egg Toast<br />-1 slice whole-grain bread <br />-1/2 medium avocado <br />-1 large egg, cooked in 1/4 tsp. olive oil or<br /> coat pan with a thin layer of cooking spray <br />(1-second spray)<br />Season egg with a pinch of salt and pepper <br />- 1 medium pear<br /><br /><strong>Morning Snack (266 calories)</strong><br /><br />-7 dried apricots <br />-7 walnut halves <br />-1 oz. Cheddar cheese <br /><br /><strong>Lunch (468 calories)<br /><br /></strong>Leftover soup <br />-2 cups Ravioli and Vegetable Soup <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-3 Tbsp. shredded Cheddar cheese<br /> Top each baguette slice with 1 1/2 Tbsp.<br /> cheese and a pinch of pepper. Toast until<br /> cheese is melted. <br />-1 medium orange <br /><br /><strong>Afternoon Snack (179 calories)</strong><br /><br />-4 Tbsp. hummus <br />-3 medium carrots <br /><br /><strong>Dinner (533 calories</strong><br /><br /> -1 1/2 cups Delicata Squash and Tofu Curry <br /> -Serve curry over 1 cup brown rice <br /><br /><strong>Evening Snack (133 calories)</strong><br /><br />-2 Medjool dates<br /> Plan Ahead: Make Maple-Nut Granola for<br /> tomorrow. You can also buy granola, to make<br />things easier. Aim for a granola that has<br /> around 130 calories (or less) and less than 6 <br />grams of sugar per 1/4 cup.</p>"));
                    }
                } else if (strCalories.equals("2400 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p>\n" +
                                "  <strong>Meal 1</strong><br/><br/>\n" +
                                "   Yogurt1 cup<br/> Cottage Cheese 1 cup<br/> Grapes 1 cup<br/> Flaxseed 1 tbsp.<br/><br/> \n" +
                                "\n" +
                                "  <strong>Meal 2</strong><br/><br/>\n" +
                                "  Choclate Milk 2 cups.<br/><br/>\n" +
                                "\n" +
                                " <strong>Meal 3</strong><br/><br/>\n" +
                                "  Oat Bran 1/2 cup <br/>Blueberries 1 cup <br/> Flaxseed 1 tbsp<br/> Walnuts 1/2 oz <br/>Protein 1 scoop.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 4</strong><br/><br/>\n" +
                                "   Salmon 3 oz<br/> Cooked Barley 1 cup<br/> Balsamic Vinegar 1 tsp <br/> Cottage Cheese 1 cup.<br/><br/>\n" +
                                "  \n" +
                                "  <strong>Meal 5</strong><br/><br/>\n" +
                                "    Pork Chop3 oz<br/> Sweet Potato 1 medium<br/> Broccoli 1 cup<br/> Orange 1.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 6</strong><br/><br/>\n" +
                                " Meal replacement Shake<br/> Blackberries 1 cup<br/> Flaxseed 1 tbsp.\n" +
                                "</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p>\n" +
                                "  <strong>Meal 1</strong><br/><br/>\n" +
                                "   Yogurt1 cup<br/> Cottage Cheese 1 cup<br/> Grapes 1 cup<br/> Flaxseed 1 tbsp.<br/><br/> \n" +
                                "\n" +
                                "  <strong>Meal 2</strong><br/><br/>\n" +
                                "  Choclate Milk 2 cups.<br/><br/>\n" +
                                "\n" +
                                " <strong>Meal 3</strong><br/><br/>\n" +
                                "  Oat Bran 1/2 cup <br/>Blueberries 1 cup <br/> Flaxseed 1 tbsp<br/> Walnuts 1/2 oz <br/>Protein 1 scoop.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 4</strong><br/><br/>\n" +
                                "   Salmon 3 oz<br/> Cooked Barley 1 cup<br/> Balsamic Vinegar 1 tsp <br/> Cottage Cheese 1 cup.<br/><br/>\n" +
                                "  \n" +
                                "  <strong>Meal 5</strong><br/><br/>\n" +
                                "    Pork Chop3 oz<br/> Sweet Potato 1 medium<br/> Broccoli 1 cup<br/> Orange 1.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 6</strong><br/><br/>\n" +
                                " Meal replacement Shake<br/> Blackberries 1 cup<br/> Flaxseed 1 tbsp.\n" +
                                "</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }

                break;
            case R.id.nutWednesday:
                nutMonday.setTextColor(Color.LTGRAY);
                nutSunday.setTextColor(Color.LTGRAY);
                nutSaturday.setTextColor(Color.LTGRAY);
                nutTuesday.setTextColor(Color.LTGRAY);
                nutThursday.setTextColor(Color.LTGRAY);
                nutWednesday.setTextColor(Color.WHITE);
                nutFriday.setTextColor(Color.LTGRAY);
                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (405 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt <br />-1/4 cup blueberries <br /><br /><strong>Morning Snack (128 calories)</strong><br /><br />-3 Tbsp. hummus <br />-2 medium carrots\n" +
                                "<p><strong>Lunch (443 calories)</strong><br /><br />Apple and Cheddar Pita Pocket <br />-1 whole-wheat pita round (6-1/2-inch) <br />-1 Tbsp. mustard <br />-1/2 medium apple, sliced <br />-1 1/2 oz. Cheddar cheese <br />-1 cup mixed greens<br />Cut pita in half and spread mustard inside.<br /> Fill with apple slices and cheese. Toast until <br />the cheese begins to melt. Add greens and<br /> serve.<br />-1 clementine <br /><br /><strong>Afternoon Snack (278 calories)</strong><br /><br />-1/2 medium apple, sliced <br />-1 Tbsp. peanut butter<br />-1/4 cup Maple-Nut Granola <br />Dip apple slices into peanut butter and <br />granola.<br /><br /><strong>Dinner (507 calories)</strong><br /><br />-1 Moroccan-Style Stuffed Pepper <br />-2 cups spinach<br />Saute spinach in 1 tsp. olive oil with a pinch<br /> of salt and pepper.<br />- 1 cup sliced carrots, steamed <br /><br /><strong>Evening Snack (50 calories)</strong><br /><br /> -1 Tbsp. chocolate chips, preferably dark <br />chocolate<br /><br /> Plan Ahead: Hard-boil 2 eggs-save one <br />for Day 5. Make Carrot-Ginger Vinaigrette<br /> or opt for a healthy, store-bought Asian-<br />style dressing. When buying salad dressing,<br /> choose one made with healthy fats, such as <br />olive oil or canola oil. Cook a chicken breast<br /> for tomorrow's lunch or substitute precooked <br />chicken or sliced chicken or turkey breast <br />from the grocery store. When choosing deli<br /> items, go for low-sodium, preservative-free <br />options.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (405 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt <br />-1/4 cup blueberries <br /><br /><strong>Morning Snack (128 calories)</strong><br /><br />-3 Tbsp. hummus <br />-2 medium carrots\n" +
                                "<p><strong>Lunch (443 calories)</strong><br /><br />Apple and Cheddar Pita Pocket <br />-1 whole-wheat pita round (6-1/2-inch) <br />-1 Tbsp. mustard <br />-1/2 medium apple, sliced <br />-1 1/2 oz. Cheddar cheese <br />-1 cup mixed greens<br />Cut pita in half and spread mustard inside.<br /> Fill with apple slices and cheese. Toast until <br />the cheese begins to melt. Add greens and<br /> serve.<br />-1 clementine <br /><br /><strong>Afternoon Snack (278 calories)</strong><br /><br />-1/2 medium apple, sliced <br />-1 Tbsp. peanut butter<br />-1/4 cup Maple-Nut Granola <br />Dip apple slices into peanut butter and <br />granola.<br /><br /><strong>Dinner (507 calories)</strong><br /><br />-1 Moroccan-Style Stuffed Pepper <br />-2 cups spinach<br />Saute spinach in 1 tsp. olive oil with a pinch<br /> of salt and pepper.<br />- 1 cup sliced carrots, steamed <br /><br /><strong>Evening Snack (50 calories)</strong><br /><br /> -1 Tbsp. chocolate chips, preferably dark <br />chocolate<br /><br /> Plan Ahead: Hard-boil 2 eggs-save one <br />for Day 5. Make Carrot-Ginger Vinaigrette<br /> or opt for a healthy, store-bought Asian-<br />style dressing. When buying salad dressing,<br /> choose one made with healthy fats, such as <br />olive oil or canola oil. Cook a chicken breast<br /> for tomorrow's lunch or substitute precooked <br />chicken or sliced chicken or turkey breast <br />from the grocery store. When choosing deli<br /> items, go for low-sodium, preservative-free <br />options.</p>"));
                    }
                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (426 calories)</strong><br /><br /> -1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt<br />-1/2 cup blueberries <br /><br /><strong>Morning Snack (220 calories)</strong><br /><br />-5 Tbsp. hummus <br />-2 medium carrots <br />-1 cup sliced cucumbers <br /><br /><strong>Lunch (466 calories)</strong><br /><br /> Apple and Cheddar Pita Pocket <br />-1 whole-wheat pita round (6-1/2-inch)<br />-1 Tbsp. mustard <br />-1/2 medium apple, sliced <br />-2 oz. Cheddar cheese <br />-1 cup mixed greens<br /> Cut pita in half and spread mustard inside.<br /> Fill with apple slices and cheese. Toast until <br />the cheese begins to melt. Add greens and<br /> serve.<br /><br /><strong>Afternoon Snack (278 calories)</strong><br /><br />-1/2 medium apple, sliced <br />-1 Tbsp. peanut butter <br />-1/4 cup Maple-Nut Granola<br /> Dip apple slices into peanut butter and<br /> granola. <br /><br /><strong>Dinner (507 calories)</strong><br /><br />-1 Moroccan-Style Stuffed Pepper <br />-2 cups spinach <br />Saute spinach in 1 tsp. olive oil with a pinch<br /> of salt and pepper. <br />-1 cup sliced carrots, steamed <br /><br /><strong>Evening Snack (101 calories)</strong><br /><br />-2 Tbsp. chocolate chips, preferably dark <br />chocolate Plan Ahead Hard-boil 2 eggs-<br />save one for Day 7. Make Carrot-Ginger <br />Vinaigrette or opt for a healthy, store-bought<br /> Asian-style dressing. When buying salad <br />dressing, choose one made with healthy <br />fats, such as olive oil or canola oil. Cook<br /> a chicken breast for tomorrow's lunch or<br /> substitute precooked chicken or sliced<br /> chicken or turkey breast from the grocery<br /> store. When choosing deli items, go for low-<br />sodium, preservative-free options.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (426 calories)</strong><br /><br /> -1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt<br />-1/2 cup blueberries <br /><br /><strong>Morning Snack (220 calories)</strong><br /><br />-5 Tbsp. hummus <br />-2 medium carrots <br />-1 cup sliced cucumbers <br /><br /><strong>Lunch (466 calories)</strong><br /><br /> Apple and Cheddar Pita Pocket <br />-1 whole-wheat pita round (6-1/2-inch)<br />-1 Tbsp. mustard <br />-1/2 medium apple, sliced <br />-2 oz. Cheddar cheese <br />-1 cup mixed greens<br /> Cut pita in half and spread mustard inside.<br /> Fill with apple slices and cheese. Toast until <br />the cheese begins to melt. Add greens and<br /> serve.<br /><br /><strong>Afternoon Snack (278 calories)</strong><br /><br />-1/2 medium apple, sliced <br />-1 Tbsp. peanut butter <br />-1/4 cup Maple-Nut Granola<br /> Dip apple slices into peanut butter and<br /> granola. <br /><br /><strong>Dinner (507 calories)</strong><br /><br />-1 Moroccan-Style Stuffed Pepper <br />-2 cups spinach <br />Saute spinach in 1 tsp. olive oil with a pinch<br /> of salt and pepper. <br />-1 cup sliced carrots, steamed <br /><br /><strong>Evening Snack (101 calories)</strong><br /><br />-2 Tbsp. chocolate chips, preferably dark <br />chocolate Plan Ahead Hard-boil 2 eggs-<br />save one for Day 7. Make Carrot-Ginger <br />Vinaigrette or opt for a healthy, store-bought<br /> Asian-style dressing. When buying salad <br />dressing, choose one made with healthy <br />fats, such as olive oil or canola oil. Cook<br /> a chicken breast for tomorrow's lunch or<br /> substitute precooked chicken or sliced<br /> chicken or turkey breast from the grocery<br /> store. When choosing deli items, go for low-<br />sodium, preservative-free options.</p>"));
                    }
                } else if (strCalories.equals("2400 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }
                break;
            case R.id.nutThursday:
                nutMonday.setTextColor(Color.LTGRAY);
                nutSunday.setTextColor(Color.LTGRAY);
                nutSaturday.setTextColor(Color.LTGRAY);
                nutTuesday.setTextColor(Color.LTGRAY);
                nutThursday.setTextColor(Color.WHITE);
                nutWednesday.setTextColor(Color.LTGRAY);
                nutFriday.setTextColor(Color.LTGRAY);
                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (405 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt <br />-1/4 cup blueberries <br /><br /><strong>Morning Snack (128 calories)</strong><br /><br />-3 Tbsp. hummus <br />-2 medium carrots</p>\n" +
                                "<p><strong>Lunch (443 calories)</strong><br /><br />Apple and Cheddar Pita Pocket <br />-1 whole-wheat pita round (6-1/2-inch) <br />-1 Tbsp. mustard <br />-1/2 medium apple, sliced <br />-1 1/2 oz. Cheddar cheese <br />-1 cup mixed greens<br />Cut pita in half and spread mustard inside.<br />Fill with apple slices and cheese. Toast until <br />the cheese begins to melt. Add greens and<br />serve.<br />-1 clementine <br /><br /><strong>Afternoon Snack (278 calories)</strong><br /><br />-1/2 medium apple, sliced <br />-1 Tbsp. peanut butter<br />-1/4 cup Maple-Nut Granola <br />Dip apple slices into peanut butter and <br />granola.<br /><br /><strong>Dinner (507 calories)</strong><br /><br />-1 Moroccan-Style Stuffed Pepper <br />-2 cups spinach<br />Saute spinach in 1 tsp. olive oil with a pinch<br />of salt and pepper.<br />- 1 cup sliced carrots, steamed <br /><br /><strong>Evening Snack (50 calories)</strong><br /><br />-1 Tbsp. chocolate chips, preferably dark <br />chocolate<br /><br />Plan Ahead: Hard-boil 2 eggs-save one <br />for Day 5. Make Carrot-Ginger Vinaigrette<br />or opt for a healthy, store-bought Asian-<br />style dressing. When buying salad dressing,<br />choose one made with healthy fats, such as <br />olive oil or canola oil. Cook a chicken breast<br />for tomorrow's lunch or substitute precooked <br />chicken or sliced chicken or turkey breast <br />from the grocery store. When choosing deli<br />items, go for low-sodium, preservative-free <br />options.</p>\n" +
                                "<p><strong>Breakfast (405 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt <br />-1/4 cup blueberries <br /><br /><strong>Morning Snack (305 calories)</strong><br /><br />-1 medium apple <br />-2 Tbsp. peanut butter <br /><br /><strong>Lunch (417 calories)</strong><br /><br />-2 cups mixed greens <br />-4 oz. cooked chicken breast <br />-1/2 medium red bell pepper, sliced <br />-1/4 cup grated carrots <br />-1 clementine, peeled and sectioned <br />-2 Tbsp. Carrot-Ginger Vinaigrette<br /> Combine ingredients and top the salad with<br /> the vinaigrette.<br /><br /><strong>Afternoon Snack (172 calories)\n" +
                                "</strong><br /><br />-8 dried apricots <br />-8 walnut halves <br /><br /><strong>Dinner (508 calories)</strong><br /><br /> -2 1/4 cups Warm Lentil Salad with <br />Sausage and Apple <br />-1/2 cup Quick Pickled Beets <br />-1 diagonal slice baguette (1/4 inch thick), <br />preferably whole-wheat <br />-Top baguette with 1 tsp. butter<br /><br /> Plan Ahead: Make Avocado-Yogurt Dip for <br />tomorrow. You can substitute store-bought<br /> hummus for the dip, if desired.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (405 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt <br />-1/4 cup blueberries <br /><br /><strong>Morning Snack (128 calories)</strong><br /><br />-3 Tbsp. hummus <br />-2 medium carrots</p>\n" +
                                "<p><strong>Lunch (443 calories)</strong><br /><br />Apple and Cheddar Pita Pocket <br />-1 whole-wheat pita round (6-1/2-inch) <br />-1 Tbsp. mustard <br />-1/2 medium apple, sliced <br />-1 1/2 oz. Cheddar cheese <br />-1 cup mixed greens<br />Cut pita in half and spread mustard inside.<br />Fill with apple slices and cheese. Toast until <br />the cheese begins to melt. Add greens and<br />serve.<br />-1 clementine <br /><br /><strong>Afternoon Snack (278 calories)</strong><br /><br />-1/2 medium apple, sliced <br />-1 Tbsp. peanut butter<br />-1/4 cup Maple-Nut Granola <br />Dip apple slices into peanut butter and <br />granola.<br /><br /><strong>Dinner (507 calories)</strong><br /><br />-1 Moroccan-Style Stuffed Pepper <br />-2 cups spinach<br />Saute spinach in 1 tsp. olive oil with a pinch<br />of salt and pepper.<br />- 1 cup sliced carrots, steamed <br /><br /><strong>Evening Snack (50 calories)</strong><br /><br />-1 Tbsp. chocolate chips, preferably dark <br />chocolate<br /><br />Plan Ahead: Hard-boil 2 eggs-save one <br />for Day 5. Make Carrot-Ginger Vinaigrette<br />or opt for a healthy, store-bought Asian-<br />style dressing. When buying salad dressing,<br />choose one made with healthy fats, such as <br />olive oil or canola oil. Cook a chicken breast<br />for tomorrow's lunch or substitute precooked <br />chicken or sliced chicken or turkey breast <br />from the grocery store. When choosing deli<br />items, go for low-sodium, preservative-free <br />options.</p>\n" +
                                "<p><strong>Breakfast (405 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt <br />-1/4 cup blueberries <br /><br /><strong>Morning Snack (305 calories)</strong><br /><br />-1 medium apple <br />-2 Tbsp. peanut butter <br /><br /><strong>Lunch (417 calories)</strong><br /><br />-2 cups mixed greens <br />-4 oz. cooked chicken breast <br />-1/2 medium red bell pepper, sliced <br />-1/4 cup grated carrots <br />-1 clementine, peeled and sectioned <br />-2 Tbsp. Carrot-Ginger Vinaigrette<br /> Combine ingredients and top the salad with<br /> the vinaigrette.<br /><br /><strong>Afternoon Snack (172 calories)\n" +
                                "</strong><br /><br />-8 dried apricots <br />-8 walnut halves <br /><br /><strong>Dinner (508 calories)</strong><br /><br /> -2 1/4 cups Warm Lentil Salad with <br />Sausage and Apple <br />-1/2 cup Quick Pickled Beets <br />-1 diagonal slice baguette (1/4 inch thick), <br />preferably whole-wheat <br />-Top baguette with 1 tsp. butter<br /><br /> Plan Ahead: Make Avocado-Yogurt Dip for <br />tomorrow. You can substitute store-bought<br /> hummus for the dip, if desired.</p>"));
                    }
                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (426 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt<br />-1/2 cup blueberries<br /><br /><strong>Morning Snack (305 calories)</strong><br /><br /> -1 medium apple <br />-2 Tbsp. peanut butter <br /><br /><strong>Lunch (487 calories)</strong><br /><br />-2 cups mixed greens <br /> -4 oz. cooked chicken breast <br /> -1/2 medium red bell pepper, sliced <br /> -1/4 cup grated carrots <br /> -1 1/2 Tbsp. unsalted dry-roasted almonds <br /> -2 Tbsp. Carrot-Ginger Vinaigrette<br />  Combine ingredients and top the salad with <br /> the vinaigrette. <br /> -1 medium orange <br /><br /><strong>Afternoon Snack (198 calories)</strong><br /><br />-8 dried apricots <br />-10 walnut halves <br /><br /><strong>Dinner (571 calories)</strong><br /><br />-2 1/4 cups Warm Lentil Salad with<br />Sausage and Apple<br />1/2 cup Quick Pickled Beets <br />1 diagonal slice baguette (1/4 inch thick),<br /> preferably whole-wheat<br /> -Top baguette with 1 tsp. butter<br /><br /> Plan Ahead: Make Avocado-Yogurt Dip for<br /> tomorrow. You can substitute store-bought <br />hummus for the dip, if desired.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (426 calories)</strong><br /><br />-1/2 cup Maple-Nut Granola <br />-1 cup nonfat plain Greek yogurt<br />-1/2 cup blueberries<br /><br /><strong>Morning Snack (305 calories)</strong><br /><br /> -1 medium apple <br />-2 Tbsp. peanut butter <br /><br /><strong>Lunch (487 calories)</strong><br /><br />-2 cups mixed greens <br /> -4 oz. cooked chicken breast <br /> -1/2 medium red bell pepper, sliced <br /> -1/4 cup grated carrots <br /> -1 1/2 Tbsp. unsalted dry-roasted almonds <br /> -2 Tbsp. Carrot-Ginger Vinaigrette<br />  Combine ingredients and top the salad with <br /> the vinaigrette. <br /> -1 medium orange <br /><br /><strong>Afternoon Snack (198 calories)</strong><br /><br />-8 dried apricots <br />-10 walnut halves <br /><br /><strong>Dinner (571 calories)</strong><br /><br />-2 1/4 cups Warm Lentil Salad with<br />Sausage and Apple<br />1/2 cup Quick Pickled Beets <br />1 diagonal slice baguette (1/4 inch thick),<br /> preferably whole-wheat<br /> -Top baguette with 1 tsp. butter<br /><br /> Plan Ahead: Make Avocado-Yogurt Dip for<br /> tomorrow. You can substitute store-bought <br />hummus for the dip, if desired.</p>"));
                    }
                } else if (strCalories.equals("2400 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("4000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml(""));
                    }
                }
                break;
            case R.id.nutFriday:
                nutMonday.setTextColor(Color.LTGRAY);
                nutSunday.setTextColor(Color.LTGRAY);
                nutSaturday.setTextColor(Color.LTGRAY);
                nutTuesday.setTextColor(Color.LTGRAY);
                nutThursday.setTextColor(Color.LTGRAY);
                nutWednesday.setTextColor(Color.LTGRAY);
                nutFriday.setTextColor(Color.WHITE);
                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (369 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1/2 cup blueberries <br />-2 Tbsp. unsalted dry-roasted almonds<br /><br /> <strong>Morning Snac (117 calories)</strong><br /><br />-1 cup sliced cucumber <br />-4 Tbsp. Avocado-Yogurt Dip <br /><br /><strong>Lunch (449 calories)</strong><br /><br />-2 Tomato-Cheddar Cheese Toasts <br />-2 cups mixed greens <br />-1/4 cup grated carrot <br />-1/2 cup cucumber, sliced <br />-1 hard-boiled egg <br />-2 Tbsp. unsalted dry-roasted almonds <br />-1 1/2 tsp. each olive oil and balsamic <br />vinegar<br /> Top greens with carrot, cucumber, hard-<br />boiled egg and almonds. Toss with balsamic<br /> vinaigrette. <br /><br /> <strong>Afternoon Snack (210 calories)</strong><br /><br />-1 medium banana <br />-8 walnut halves <br /><br /> <strong>Dinner (535 calories)</strong><br /><br />-1 1/2 cups Quick Chicken Tikka Masala <br />-1 cup brown rice<br /><br /> <strong>Evening Snack (133 calories)</strong><br /><br /> -2 Medjool dates</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (369 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1/2 cup blueberries <br />-2 Tbsp. unsalted dry-roasted almonds<br /><br /> <strong>Morning Snac (117 calories)</strong><br /><br />-1 cup sliced cucumber <br />-4 Tbsp. Avocado-Yogurt Dip <br /><br /><strong>Lunch (449 calories)</strong><br /><br />-2 Tomato-Cheddar Cheese Toasts <br />-2 cups mixed greens <br />-1/4 cup grated carrot <br />-1/2 cup cucumber, sliced <br />-1 hard-boiled egg <br />-2 Tbsp. unsalted dry-roasted almonds <br />-1 1/2 tsp. each olive oil and balsamic <br />vinegar<br /> Top greens with carrot, cucumber, hard-<br />boiled egg and almonds. Toss with balsamic<br /> vinaigrette. <br /><br /> <strong>Afternoon Snack (210 calories)</strong><br /><br />-1 medium banana <br />-8 walnut halves <br /><br /> <strong>Dinner (535 calories)</strong><br /><br />-1 1/2 cups Quick Chicken Tikka Masala <br />-1 cup brown rice<br /><br /> <strong>Evening Snack (133 calories)</strong><br /><br /> -2 Medjool dates</p>"));
                    }
                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (432 calories)</strong><br /><br /> -1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1 medium banana <br />-2 Tbsp. unsalted dry-roasted almonds <br /><br /><strong>Morning Snack (117 calories)</strong><br /><br />-1 cup sliced cucumber<br />-4 Tbsp. Avocado-Yogurt Dip <br /><br /><strong>Lunch (493 calories)</strong><br /><br />-2 Tomato-Cheddar Cheese Toasts<br />-2 cups mixed greens <br />-1/4 cup grated carrot <br />-1/2 cup cucumber, sliced <br />-1 hard-boiled egg <br />-1 1/2 Tbsp. unsalted dry-roasted almonds <br />-1 Tbsp. each olive oil and balsamic vinegar<br /> Top greens with carrot, cucumber, hard-<br />boiled egg and almonds. Toss with balsamic <br />vinaigrette.<br /><br /><strong>Afternoon Snack (288 calories)</strong><br /><br />-1/2 cup blueberries <br />-10 walnut halves <br />-1 oz. Cheddar cheese<br /><br /><strong>Dinner (614 calories)</strong><br /><br />-1 1/2 cups Quick Chicken Tikka Masala <br />-3/4 cup brown rice <br />-2 medjool dates to enjoy after dinner</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (432 calories)</strong><br /><br /> -1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1 medium banana <br />-2 Tbsp. unsalted dry-roasted almonds <br /><br /><strong>Morning Snack (117 calories)</strong><br /><br />-1 cup sliced cucumber<br />-4 Tbsp. Avocado-Yogurt Dip <br /><br /><strong>Lunch (493 calories)</strong><br /><br />-2 Tomato-Cheddar Cheese Toasts<br />-2 cups mixed greens <br />-1/4 cup grated carrot <br />-1/2 cup cucumber, sliced <br />-1 hard-boiled egg <br />-1 1/2 Tbsp. unsalted dry-roasted almonds <br />-1 Tbsp. each olive oil and balsamic vinegar<br /> Top greens with carrot, cucumber, hard-<br />boiled egg and almonds. Toss with balsamic <br />vinaigrette.<br /><br /><strong>Afternoon Snack (288 calories)</strong><br /><br />-1/2 cup blueberries <br />-10 walnut halves <br />-1 oz. Cheddar cheese<br /><br /><strong>Dinner (614 calories)</strong><br /><br />-1 1/2 cups Quick Chicken Tikka Masala <br />-3/4 cup brown rice <br />-2 medjool dates to enjoy after dinner</p>"));
                    }
                } else if (strCalories.equals("2400 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("4000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml(""));
                    }
                }
                break;
            case R.id.nutSaturday:
                nutMonday.setTextColor(Color.LTGRAY);
                nutSunday.setTextColor(Color.LTGRAY);
                nutSaturday.setTextColor(Color.WHITE);
                nutTuesday.setTextColor(Color.LTGRAY);
                nutThursday.setTextColor(Color.LTGRAY);
                nutWednesday.setTextColor(Color.LTGRAY);
                nutFriday.setTextColor(Color.LTGRAY);
                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (369 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1/2 cup blueberries <br />-2 Tbsp. unsalted dry-roasted almonds<br /><br /><strong>Morning Snack (176 calories)</strong><br /><br />-4 Tbsp. Avocado-Yogurt Dip <br />-3 medium carrots <br /><br /><strong>Lunch (440 calories)</strong><br /><br />Leftover Chicken Tikka Masala<br />-1 1/2 cups Quick Chicken Tikka Masala <br />-2 cups spinach<br />-1/2 cup brown rice Reheat the chicken on top of spinach in the <br />microwave. <br /><br /><strong>Afternoon Snack (210 calories)</strong><br /><br />-1 medium banana <br />-8 walnut halves</p>\n" +
                                "<p><strong>Lunch (440 calories)</strong><br /><br />Leftover Chicken Tikka Masala<br />-1 1/2 cups Quick Chicken Tikka Masala <br />-2 cups spinach<br />-1/2 cup brown rice<br />Reheat the chicken on top of spinach in the<br />microwave. <br /><br /><strong>Afternoon Snack (210 calories)</strong><br /><br />-1 medium banana <br />-8 walnut halves<br /><br /><strong>Dinner (604 calories)</strong><br /><br />-2 cups Korean Beef Stir-Fry <br />-1 cup cooked buckwheat soba noodles <br />(about 2 ounces dry noodles)<br /><br />Plan Ahead: Cook a chicken breast for <br />tomorrow's lunch or substitute precooked<br />chicken or sliced chicken or turkey breast<br />from the grocery store. When choosing del<br />i items, go for low-sodium, preservative-free <br />options.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (369 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1/2 cup blueberries <br />-2 Tbsp. unsalted dry-roasted almonds<br /><br /><strong>Morning Snack (176 calories)</strong><br /><br />-4 Tbsp. Avocado-Yogurt Dip <br />-3 medium carrots <br /><br /><strong>Lunch (440 calories)</strong><br /><br />Leftover Chicken Tikka Masala<br />-1 1/2 cups Quick Chicken Tikka Masala <br />-2 cups spinach<br />-1/2 cup brown rice Reheat the chicken on top of spinach in the <br />microwave. <br /><br /><strong>Afternoon Snack (210 calories)</strong><br /><br />-1 medium banana <br />-8 walnut halves</p>\n" +
                                "<p><strong>Lunch (440 calories)</strong><br /><br />Leftover Chicken Tikka Masala<br />-1 1/2 cups Quick Chicken Tikka Masala <br />-2 cups spinach<br />-1/2 cup brown rice<br />Reheat the chicken on top of spinach in the<br />microwave. <br /><br /><strong>Afternoon Snack (210 calories)</strong><br /><br />-1 medium banana <br />-8 walnut halves<br /><br /><strong>Dinner (604 calories)</strong><br /><br />-2 cups Korean Beef Stir-Fry <br />-1 cup cooked buckwheat soba noodles <br />(about 2 ounces dry noodles)<br /><br />Plan Ahead: Cook a chicken breast for <br />tomorrow's lunch or substitute precooked<br />chicken or sliced chicken or turkey breast<br />from the grocery store. When choosing del<br />i items, go for low-sodium, preservative-free <br />options.</p>"));
                    }
                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (428 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk<br />-1 medium pear <br />-2 Tbsp. unsalted dry-roasted almonds<br /><br /><strong> Morning Snack (176 calories)</strong><br /><br />-4 Tbsp. Avocado-Yogurt Dip <br />-3 medium carrots<br /><br /><strong>  Lunch (494 calories)</strong><br /><br />Leftover Chicken Tikka Masala<br />-1 1/2 cups Quick Chicken Tikka Masala <br />-2 cups spinach <br />-3/4 cup brown rice <br />Reheat the chicken on top of spinach in the<br /> microwave.<br /><br /><strong> Afternoon Snack (236 calories)</strong><br /><br />-1 medium banana<br /> -10 walnut halves<br /><br /><strong>  Dinner (604 calories)</strong><br /><br />-2 cups Korean Beef Stir-Fry <br />-1 cup cooked buckwheat soba noodles<br /> (about 2 ounces dry noodles) <br /><br /><strong> Evening Snack (62 calories)</strong><br /><br />-1 medium orange<br /> <br /> Plan Ahead Cook a chicken breast for <br /> tomorrow's lunch or substitute precooked <br /> chicken or sliced chicken or turkey breast<br />  from the grocery store. When choosing deli <br /> items, go for low-sodium, preservative-free <br /> options.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (428 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk<br />-1 medium pear <br />-2 Tbsp. unsalted dry-roasted almonds<br /><br /><strong> Morning Snack (176 calories)</strong><br /><br />-4 Tbsp. Avocado-Yogurt Dip <br />-3 medium carrots<br /><br /><strong>  Lunch (494 calories)</strong><br /><br />Leftover Chicken Tikka Masala<br />-1 1/2 cups Quick Chicken Tikka Masala <br />-2 cups spinach <br />-3/4 cup brown rice <br />Reheat the chicken on top of spinach in the<br /> microwave.<br /><br /><strong> Afternoon Snack (236 calories)</strong><br /><br />-1 medium banana<br /> -10 walnut halves<br /><br /><strong>  Dinner (604 calories)</strong><br /><br />-2 cups Korean Beef Stir-Fry <br />-1 cup cooked buckwheat soba noodles<br /> (about 2 ounces dry noodles) <br /><br /><strong> Evening Snack (62 calories)</strong><br /><br />-1 medium orange<br /> <br /> Plan Ahead Cook a chicken breast for <br /> tomorrow's lunch or substitute precooked <br /> chicken or sliced chicken or turkey breast<br />  from the grocery store. When choosing deli <br /> items, go for low-sodium, preservative-free <br /> options.</p>"));
                    }
                } else if (strCalories.equals("2400 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("4000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml(""));
                    }
                }
                break;
            case R.id.nutSunday:
                nutMonday.setTextColor(Color.LTGRAY);
                nutSunday.setTextColor(Color.WHITE);
                nutSaturday.setTextColor(Color.LTGRAY);
                nutTuesday.setTextColor(Color.LTGRAY);
                nutThursday.setTextColor(Color.LTGRAY);
                nutWednesday.setTextColor(Color.LTGRAY);
                nutFriday.setTextColor(Color.LTGRAY);

                if (strCalories.equals("1800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<pre><strong>Breakfast (362 calories)<br /></strong><br /> &bull; 1 cup all-bran cereal <br /> &bull; 3/4 cup skim milk<br /> &bull; 1/2 cup blueberries <br /> &bull; 2 Tbsp. chopped walnuts<br />        <br /><strong> Morning Snack (291 calories)</strong><br /><br /> &bull; 4 Tbsp. Avocado-Yogurt Dip <br /> &bull; 3 medium carrots <br /><br /><strong> Lunch (434 calories)<br /></strong><br /> &bull; 2 cups mixed greens<br /> &bull; 4 oz. cooked chicken breast<br /> &bull; 1/2 medium red bell pepper, sliced<br /> &bull; 1/4 cup grated carrots<br /> &bull; 1 Tbsp. unsalted dry-roasted almonds<br /> &bull; 2 Tbsp. Carrot-Ginger Vinaigrette<br /> &bull; 1 clementine, peeled and sectioned Combine ingredients and top the salad with the vinaigrette. <br /><br /><strong>  Afternoon Snack (142 calories)</strong><br /><br /> &bull; 1 hard-boiled egg<br /> &bull; 2 diagonal slices baguette (1/4 inch thick), preferably whole-wheat<br /> &bull; 1 tsp. hot sauce (if desired) Toast baguette slices and top with sliced egg and hot sauce.<br /> <br /><strong> Dinner (494 calories)<br /></strong><br /> &bull; 1 serving Wild Mushroom Pizza with Arugula and Pecorino <br /><br /><strong> Evening Snack (76 calories)</strong><br /><br /> &bull; 1 1/2 Tbsp. chocolate chips, preferably dark chocolate</pre> ", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<pre><strong>Breakfast (362 calories)<br /></strong><br /> &bull; 1 cup all-bran cereal <br /> &bull; 3/4 cup skim milk<br /> &bull; 1/2 cup blueberries <br /> &bull; 2 Tbsp. chopped walnuts<br />        <br /><strong> Morning Snack (291 calories)</strong><br /><br /> &bull; 4 Tbsp. Avocado-Yogurt Dip <br /> &bull; 3 medium carrots <br /><br /><strong> Lunch (434 calories)<br /></strong><br /> &bull; 2 cups mixed greens<br /> &bull; 4 oz. cooked chicken breast<br /> &bull; 1/2 medium red bell pepper, sliced<br /> &bull; 1/4 cup grated carrots<br /> &bull; 1 Tbsp. unsalted dry-roasted almonds<br /> &bull; 2 Tbsp. Carrot-Ginger Vinaigrette<br /> &bull; 1 clementine, peeled and sectioned Combine ingredients and top the salad with the vinaigrette. <br /><br /><strong>  Afternoon Snack (142 calories)</strong><br /><br /> &bull; 1 hard-boiled egg<br /> &bull; 2 diagonal slices baguette (1/4 inch thick), preferably whole-wheat<br /> &bull; 1 tsp. hot sauce (if desired) Toast baguette slices and top with sliced egg and hot sauce.<br /> <br /><strong> Dinner (494 calories)<br /></strong><br /> &bull; 1 serving Wild Mushroom Pizza with Arugula and Pecorino <br /><br /><strong> Evening Snack (76 calories)</strong><br /><br /> &bull; 1 1/2 Tbsp. chocolate chips, preferably dark chocolate</pre>"));
                    }

                } else if (strCalories.equals("2000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (424 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1 medium banana <br />-2 Tbsp. chopped walnuts<br /><br /><strong> Morning Snack (349 calories)</strong><br /><br />-4 Tbsp. Avocado-Yogurt Dip <br />-3 medium carrots <br />-1 1/2 oz. Cheddar cheese <br /><br /><strong>Lunch (487 calories)</strong><br /><br />-2 cups mixed greens<br />-4 oz. cooked chicken breast <br />-1/2 medium red bell pepper, sliced<br />-1/4 cup grated carrots <br />-2 Tbsp. Carrot-Ginger Vinaigrette <br />-1 1/2 Tbsp. unsalted dry-roasted almonds <br />Combine ingredients and top the salad with<br />the vinaigrette. <br />-1 medium orange <br /><br /><strong>Afternoon Snack (142 calories)</strong><br /><br />-1 hard-boiled egg <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-1 tsp. hot sauce (if desired)<br />Toast baguette slices and top with sliced<br /> egg and hot sauce. <br /><br /><strong>Dinner (595 calories)</strong><br /><br />-1 serving Wild Mushroom Pizza with<br />Arugula and Pecorino<br />-2 Tbsp. chocolate chips, preferably dark <br />chocolate, to enjoy after dinne</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast (424 calories)</strong><br /><br />-1 cup all-bran cereal <br />-3/4 cup skim milk <br />-1 medium banana <br />-2 Tbsp. chopped walnuts<br /><br /><strong> Morning Snack (349 calories)</strong><br /><br />-4 Tbsp. Avocado-Yogurt Dip <br />-3 medium carrots <br />-1 1/2 oz. Cheddar cheese <br /><br /><strong>Lunch (487 calories)</strong><br /><br />-2 cups mixed greens<br />-4 oz. cooked chicken breast <br />-1/2 medium red bell pepper, sliced<br />-1/4 cup grated carrots <br />-2 Tbsp. Carrot-Ginger Vinaigrette <br />-1 1/2 Tbsp. unsalted dry-roasted almonds <br />Combine ingredients and top the salad with<br />the vinaigrette. <br />-1 medium orange <br /><br /><strong>Afternoon Snack (142 calories)</strong><br /><br />-1 hard-boiled egg <br />-2 diagonal slices baguette (1/4 inch thick),<br /> preferably whole-wheat <br />-1 tsp. hot sauce (if desired)<br />Toast baguette slices and top with sliced<br /> egg and hot sauce. <br /><br /><strong>Dinner (595 calories)</strong><br /><br />-1 serving Wild Mushroom Pizza with<br />Arugula and Pecorino<br />-2 Tbsp. chocolate chips, preferably dark <br />chocolate, to enjoy after dinne</p>"));
                    }
                } else if (strCalories.equals("2400 Calories"))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }
                else if (strCalories.equals("2800 Calories"))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }else if (strCalories.equals("3000 Calories"))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }else if (strCalories.equals("3500 Calories"))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }else if (strCalories.equals("3000 Calories"))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                }

                break;

        }

    }
}
