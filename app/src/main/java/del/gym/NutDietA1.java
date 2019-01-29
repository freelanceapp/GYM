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
                textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br />1&frac12; cup cornflakes OR 1 cup cooked<br />oatmeal<br />1 slice whole wheat toast OR &frac12; English<br />muffin <br />1 cup skim or 1%% milk<br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br />margarine<br />1 egg or &frac14; cup scrambled egg substitut<br />&frac12; grapefruit OR &frac12; cup orange juice\n" +
                        "<br /><br /><strong>AM SNACK</strong><br /><br />4-4 inch across rice cakes<br /> &frac12; cup unsweetened applesauce OR 1 cup <br />honeydew melon \n" +
                        "<br /><br /><strong>LUNCH</strong><br /><br />\n" +
                        "1 cup vegetable beef soup<br /> 1 turkey sandwich<br /> 2 slice whole wheat bread <br />3 oz. sliced turkey breast <br />3 tsp. mayonnaise OR 3 Tbsp. reduced-fat<br /> mayonnaise<br /> lettuce, tomato, and mustard, as desired<br /> 1 cup raw carrot OR celery sticks <br />1 small apple \n" +
                        "<br /><br /><strong>PM SNACK</strong><br /><br /> 5-10 non-fat whole wheat crackers <br />1 oz. reduced-fat cheese <br />&frac12; cup fruit cocktail \n" +
                        "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz. baked pork chop <br />&frac12; cup cooked noodles<br /> 1 whole wheat dinner roll <br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br /> margarine<br /> 1 cup cooked green beans<br /> 1 small, unfrosted brownie (2x2 square) <br />1 cup skim or 1%% milk \n" +
                        "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />\n" +
                        "1 cup skim or 1%% milk<br /> 9 graham crackers AND 2 Tbsp. peanut <br />butter</p>", Html.FROM_HTML_MODE_COMPACT));
            } else {
                textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br />1&frac12; cup cornflakes OR 1 cup cooked<br />oatmeal<br />1 slice whole wheat toast OR &frac12; English<br />muffin <br />1 cup skim or 1%% milk<br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br />margarine<br />1 egg or &frac14; cup scrambled egg substitut<br />&frac12; grapefruit OR &frac12; cup orange juice\n" +
                        "<br /><br /><strong>AM SNACK</strong><br /><br />4-4 inch across rice cakes<br /> &frac12; cup unsweetened applesauce OR 1 cup <br />honeydew melon \n" +
                        "<br /><br /><strong>LUNCH</strong><br /><br />\n" +
                        "1 cup vegetable beef soup<br /> 1 turkey sandwich<br /> 2 slice whole wheat bread <br />3 oz. sliced turkey breast <br />3 tsp. mayonnaise OR 3 Tbsp. reduced-fat<br /> mayonnaise<br /> lettuce, tomato, and mustard, as desired<br /> 1 cup raw carrot OR celery sticks <br />1 small apple \n" +
                        "<br /><br /><strong>PM SNACK</strong><br /><br /> 5-10 non-fat whole wheat crackers <br />1 oz. reduced-fat cheese <br />&frac12; cup fruit cocktail \n" +
                        "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz. baked pork chop <br />&frac12; cup cooked noodles<br /> 1 whole wheat dinner roll <br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br /> margarine<br /> 1 cup cooked green beans<br /> 1 small, unfrosted brownie (2x2 square) <br />1 cup skim or 1%% milk \n" +
                        "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />\n" +
                        "1 cup skim or 1%% milk<br /> 9 graham crackers AND 2 Tbsp. peanut <br />butter</p>"));
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
                        textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br />1&frac12; cup cornflakes OR 1 cup cooked<br />oatmeal<br />1 slice whole wheat toast OR &frac12; English<br />muffin <br />1 cup skim or 1%% milk<br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br />margarine<br />1 egg or &frac14; cup scrambled egg substitut<br />&frac12; grapefruit OR &frac12; cup orange juice\n" +
                                "<br /><br /><strong>AM SNACK</strong><br /><br />4-4 inch across rice cakes<br /> &frac12; cup unsweetened applesauce OR 1 cup <br />honeydew melon \n" +
                                "<br /><br /><strong>LUNCH</strong><br /><br />\n" +
                                "1 cup vegetable beef soup<br /> 1 turkey sandwich<br /> 2 slice whole wheat bread <br />3 oz. sliced turkey breast <br />3 tsp. mayonnaise OR 3 Tbsp. reduced-fat<br /> mayonnaise<br /> lettuce, tomato, and mustard, as desired<br /> 1 cup raw carrot OR celery sticks <br />1 small apple \n" +
                                "<br /><br /><strong>PM SNACK</strong><br /><br /> 5-10 non-fat whole wheat crackers <br />1 oz. reduced-fat cheese <br />&frac12; cup fruit cocktail \n" +
                                "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz. baked pork chop <br />&frac12; cup cooked noodles<br /> 1 whole wheat dinner roll <br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br /> margarine<br /> 1 cup cooked green beans<br /> 1 small, unfrosted brownie (2x2 square) <br />1 cup skim or 1%% milk \n" +
                                "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />\n" +
                                "1 cup skim or 1%% milk<br /> 9 graham crackers AND 2 Tbsp. peanut <br />butter</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br />1&frac12; cup cornflakes OR 1 cup cooked<br />oatmeal<br />1 slice whole wheat toast OR &frac12; English<br />muffin <br />1 cup skim or 1%% milk<br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br />margarine<br />1 egg or &frac14; cup scrambled egg substitut<br />&frac12; grapefruit OR &frac12; cup orange juice\n" +
                                "<br /><br /><strong>AM SNACK</strong><br /><br />4-4 inch across rice cakes<br /> &frac12; cup unsweetened applesauce OR 1 cup <br />honeydew melon \n" +
                                "<br /><br /><strong>LUNCH</strong><br /><br />\n" +
                                "1 cup vegetable beef soup<br /> 1 turkey sandwich<br /> 2 slice whole wheat bread <br />3 oz. sliced turkey breast <br />3 tsp. mayonnaise OR 3 Tbsp. reduced-fat<br /> mayonnaise<br /> lettuce, tomato, and mustard, as desired<br /> 1 cup raw carrot OR celery sticks <br />1 small apple \n" +
                                "<br /><br /><strong>PM SNACK</strong><br /><br /> 5-10 non-fat whole wheat crackers <br />1 oz. reduced-fat cheese <br />&frac12; cup fruit cocktail \n" +
                                "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz. baked pork chop <br />&frac12; cup cooked noodles<br /> 1 whole wheat dinner roll <br />2 tsp. margarine OR 2 Tbsp. reduced-fat<br /> margarine<br /> 1 cup cooked green beans<br /> 1 small, unfrosted brownie (2x2 square) <br />1 cup skim or 1%% milk \n" +
                                "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />\n" +
                                "1 cup skim or 1%% milk<br /> 9 graham crackers AND 2 Tbsp. peanut <br />butter</p>"));
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
                        textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br /> 2-4&frac12; inch square reduced-fat waffle OR 4-4<br /> inch reduced-fat pancakes <br />1&frac14; cup strawberries OR &frac34; cup blueberries <br />2 Tbsp. sugar-free maple syrup <br />1 egg OR &frac14; cup scrambled egg substitute<br /> 1 cup skim or 1%% milk\n" +
                                "<br /><br /><strong>AM SNACK</strong><br /><br />1 &frac12; oz. pretzels<br /> 17 grapes OR 1 small orange \n" +
                                "<br /><br /><strong>LUNCH</strong><br /><br /> 1 hamburger<br /> 2 oz. hamburger bun<br /> 3 oz. cooked, lean hamburger patty <br />1 Tbsp. catsup and mustard,<br /> lettuce and tomato, if desired <br />16-25 (3 oz.) French fried potatoes<br /> 1 cup lettuce salad<br /> 2 Tbsp. salad dressing OR 4 Tbsp. reduced-<br />fat salad dressing<br /> 1 cup cantaloupe cubes OR &frac12; cup canned<br /> pears\n" +
                                "<br /><br /><strong>PM SNACK</strong><br /><br /> 1 peanut butter and jelly sandwich<br /> 2 slices whole wheat bread<br /> 2 Tbsp. peanut butter <br />1 Tbsp. jelly or jam \n" +
                                "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz.barbecue chicken breast OR 4 oz.<br /> baked fish <br />1 small baked potato OR &frac12; cup mashed <br />potatoes<br /> 1 whole wheat dinner roll OR 1 slice whole<br /> wheat bread <br />1 tsp. margarine OR 1 Tbsp. reduced-fat <br />margarine <br />&frac12; cup steamed broccoli <br />&frac12; cup cooked carrots<br /> &frac12; cup low-fat frozen yogurt <br />1 cup skim or 1%% milk\n" +
                                "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />1 cup skim or 1%% milk, 5 vanilla wafers<br /> 1 cup sugar-free pudding</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br /> 2-4&frac12; inch square reduced-fat waffle OR 4-4<br /> inch reduced-fat pancakes <br />1&frac14; cup strawberries OR &frac34; cup blueberries <br />2 Tbsp. sugar-free maple syrup <br />1 egg OR &frac14; cup scrambled egg substitute<br /> 1 cup skim or 1%% milk\n" +
                                "<br /><br /><strong>AM SNACK</strong><br /><br />1 &frac12; oz. pretzels<br /> 17 grapes OR 1 small orange \n" +
                                "<br /><br /><strong>LUNCH</strong><br /><br /> 1 hamburger<br /> 2 oz. hamburger bun<br /> 3 oz. cooked, lean hamburger patty <br />1 Tbsp. catsup and mustard,<br /> lettuce and tomato, if desired <br />16-25 (3 oz.) French fried potatoes<br /> 1 cup lettuce salad<br /> 2 Tbsp. salad dressing OR 4 Tbsp. reduced-<br />fat salad dressing<br /> 1 cup cantaloupe cubes OR &frac12; cup canned<br /> pears\n" +
                                "<br /><br /><strong>PM SNACK</strong><br /><br /> 1 peanut butter and jelly sandwich<br /> 2 slices whole wheat bread<br /> 2 Tbsp. peanut butter <br />1 Tbsp. jelly or jam \n" +
                                "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz.barbecue chicken breast OR 4 oz.<br /> baked fish <br />1 small baked potato OR &frac12; cup mashed <br />potatoes<br /> 1 whole wheat dinner roll OR 1 slice whole<br /> wheat bread <br />1 tsp. margarine OR 1 Tbsp. reduced-fat <br />margarine <br />&frac12; cup steamed broccoli <br />&frac12; cup cooked carrots<br /> &frac12; cup low-fat frozen yogurt <br />1 cup skim or 1%% milk\n" +
                                "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />1 cup skim or 1%% milk, 5 vanilla wafers<br /> 1 cup sugar-free pudding</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong><br /><br />1large Banana <br />2 slc Raisin toast w/ 1 Tbsp margarine<br />1 cup Cereal 1<br />cup skim Milk<br />1 cup Cranberry juice cocktail <br /><br /><strong>Snack</strong><br /><br />15 Crackers, wheat, unsalted<br />2 Tbs Peanut butter</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>1 Apple, sliced, w/skin <br />1 C Spaghetti, Cup Marinara Sauce <br />1/2 cup Beans<br />2 slc Italian bread<br />2 tsp margarine <br />1 1/2 cup Salad <br />1 cup Lettuce, tomato, carrot, cucumber green pepper and radishes, 1/2 cup Endive, 2 Tbsp Creamy Italian salad dressing, no oil or salt <br />20 Pretzel rings \"</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Sports Bar</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>1 Burrito large<br />1 Flour or wheat tortilla <br />1/2 cup Pinto beans<br />3 oz lean meat or chicken<br />1 oz Cheddar cheese, reduced fat <br />1/2 Cup Rice<br />1/2 cup Carrots<br />1/2 cup Ice milk</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>2 small peanut butter cookies <br />1 C apple juice</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong><br /><br />1large Banana <br />2 slc Raisin toast w/ 1 Tbsp margarine<br />1 cup Cereal 1<br />cup skim Milk<br />1 cup Cranberry juice cocktail <br /><br /><strong>Snack</strong><br /><br />15 Crackers, wheat, unsalted<br />2 Tbs Peanut butter</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>1 Apple, sliced, w/skin <br />1 C Spaghetti, Cup Marinara Sauce <br />1/2 cup Beans<br />2 slc Italian bread<br />2 tsp margarine <br />1 1/2 cup Salad <br />1 cup Lettuce, tomato, carrot, cucumber green pepper and radishes, 1/2 cup Endive, 2 Tbsp Creamy Italian salad dressing, no oil or salt <br />20 Pretzel rings \"</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Sports Bar</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>1 Burrito large<br />1 Flour or wheat tortilla <br />1/2 cup Pinto beans<br />3 oz lean meat or chicken<br />1 oz Cheddar cheese, reduced fat <br />1/2 Cup Rice<br />1/2 cup Carrots<br />1/2 cup Ice milk</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>2 small peanut butter cookies <br />1 C apple juice</p>"));
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
                        textDayData.setText(Html.fromHtml("<p>\n" +
                                "  <strong>Meal 1</strong><br/><br/>\n" +
                                "   Oats 1 cup<br/> Apple 1<br/> Cottage Cheese1 cup<br/> Walnuts 1/2 oz.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 2</strong><br/><br/>\n" +
                                "   Whole Wheat<br/> Bread 2 slices<br/> Banana 1<br/> Peanut Butter 1 tbsp<br/> Protein 1 scoop.<br/><br/>\n" +
                                "\n" +
                                "  <strong>Meal 3</strong><br/><br/>\n" +
                                "    Eggs yolk1<br/> Eggs whites 6<br/> Broccoli 1 cup<br/> Bell Peppers 1/2 cup<br/> Pear 2.<br/><br/>\n" +
                                "\n" +
                                "  <strong>Meal 4</strong><br/><br/>\n" +
                                "    Spinach 3 cups<br/> Turkey Bacon 2 strips<br/> Black Beans 1/2 cup<br/> Mushrooms 1/2 cup<br/> Carrots 1 cup<br/> Grilled Chicken 4 oz<br/> Balsamic Vinegar.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 5</strong><br/><br/>\n" +
                                "     Turkey Burger 4 oz<br/><br/> Carrots 1 cup<br/> Cooked quinoa1/2 cup<br/> Non fat Milk 1 cup. \n" +
                                "  \n" +
                                "  <strong> Meal 6</strong>\n" +
                                "   Non fat Milk 1 cup<br/> Cottage Cheese 1 cup<br/> Pineapple 1 cup<br/> Flaxseed 1 tbsp.<br/><br/>\n" +
                                "</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p>\n" +
                                "  <strong>Meal 1</strong><br/><br/>\n" +
                                "   Oats 1 cup<br/> Apple 1<br/> Cottage Cheese1 cup<br/> Walnuts 1/2 oz.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 2</strong><br/><br/>\n" +
                                "   Whole Wheat<br/> Bread 2 slices<br/> Banana 1<br/> Peanut Butter 1 tbsp<br/> Protein 1 scoop.<br/><br/>\n" +
                                "\n" +
                                "  <strong>Meal 3</strong><br/><br/>\n" +
                                "    Eggs yolk1<br/> Eggs whites 6<br/> Broccoli 1 cup<br/> Bell Peppers 1/2 cup<br/> Pear 2.<br/><br/>\n" +
                                "\n" +
                                "  <strong>Meal 4</strong><br/><br/>\n" +
                                "    Spinach 3 cups<br/> Turkey Bacon 2 strips<br/> Black Beans 1/2 cup<br/> Mushrooms 1/2 cup<br/> Carrots 1 cup<br/> Grilled Chicken 4 oz<br/> Balsamic Vinegar.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 5</strong><br/><br/>\n" +
                                "     Turkey Burger 4 oz<br/><br/> Carrots 1 cup<br/> Cooked quinoa1/2 cup<br/> Non fat Milk 1 cup. \n" +
                                "  \n" +
                                "  <strong> Meal 6</strong>\n" +
                                "   Non fat Milk 1 cup<br/> Cottage Cheese 1 cup<br/> Pineapple 1 cup<br/> Flaxseed 1 tbsp.<br/><br/>\n" +
                                "</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br />1 bagel with 4 Tbsp. reduced-fat cream <br />cheese <br />&frac12; cup shredded wheat<br /> 1 cup skim or 1%% milk<br /> 1 oz. Canadian bacon <br />1 small banana OR &frac12; cup canned peaches\n" +
                                "<br /><br /><strong>AM SNACK</strong><br /><br />&frac12; cup applesauce OR 1 medium peach <br />16 animal crackers \n" +
                                "<br /><br /><strong>LUNCH</strong><br /><br /> 1 cup tomato soup (made with water)<br /> 1 grilled ham and cheese sandwich<br /> 2 slices whole wheat bread<br /> 1 oz. sliced cheese<br /> 2 oz. sliced ham <br />3 tsp. margarine OR 3 Tbsp. reduced-fat<br /> margarine <br />&frac12; cup vegetable juice <br />&frac34; cup fresh pineapple OR 1 small orange\n" +
                                "<br /><br /><strong>PM SNACK</strong><br /><br /> 8 slices melba toast <br />&frac14; cup reduced-fat cottage cheese<br /> &frac12; cup pineapple juice OR 1 small nectarine \n" +
                                "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz. broiled flank steak <br /> &frac34; cup cooked white or brown rice<br />  &frac12; cup cooked cauliflower OR asparagus<br />  1 tsp. margarine OR 1 Tbsp reduced-fat <br /> margarine<br />  1 cup lettuce salad<br />  2 Tbsp. salad dressing OR 4 Tbsp. reduced-<br /> fat salad dressing<br /> 3 gingersnaps OR 2 small fat-free cookie<br />  1 cup skim or 1%% milk \n" +
                                "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />1 cup fruit flavored yogurt sweetened with <br />Nutrasweet&reg;,<br /> 6 gingersnaps AND 1 small granola bar</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>BREAKFAST</strong><br /><br />1 bagel with 4 Tbsp. reduced-fat cream <br />cheese <br />&frac12; cup shredded wheat<br /> 1 cup skim or 1%% milk<br /> 1 oz. Canadian bacon <br />1 small banana OR &frac12; cup canned peaches\n" +
                                "<br /><br /><strong>AM SNACK</strong><br /><br />&frac12; cup applesauce OR 1 medium peach <br />16 animal crackers \n" +
                                "<br /><br /><strong>LUNCH</strong><br /><br /> 1 cup tomato soup (made with water)<br /> 1 grilled ham and cheese sandwich<br /> 2 slices whole wheat bread<br /> 1 oz. sliced cheese<br /> 2 oz. sliced ham <br />3 tsp. margarine OR 3 Tbsp. reduced-fat<br /> margarine <br />&frac12; cup vegetable juice <br />&frac34; cup fresh pineapple OR 1 small orange\n" +
                                "<br /><br /><strong>PM SNACK</strong><br /><br /> 8 slices melba toast <br />&frac14; cup reduced-fat cottage cheese<br /> &frac12; cup pineapple juice OR 1 small nectarine \n" +
                                "<br /><br /><strong>DINNER</strong><br /><br /> 1-4 oz. broiled flank steak <br /> &frac34; cup cooked white or brown rice<br />  &frac12; cup cooked cauliflower OR asparagus<br />  1 tsp. margarine OR 1 Tbsp reduced-fat <br /> margarine<br />  1 cup lettuce salad<br />  2 Tbsp. salad dressing OR 4 Tbsp. reduced-<br /> fat salad dressing<br /> 3 gingersnaps OR 2 small fat-free cookie<br />  1 cup skim or 1%% milk \n" +
                                "<br /><br /><strong>BEDTIME SNACK</strong><br /><br />1 cup fruit flavored yogurt sweetened with <br />Nutrasweet&reg;,<br /> 6 gingersnaps AND 1 small granola bar</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>2 slc Rye bread w/ 1 Tbsp margarine and 1 Tbsp fruit spread <br />1 1/4 cup oat-type Cereal<br />1 cup skim Milk<br />1/2 Melon raw<br />1 1/2 cup Grapefruit juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Cup Chicken gumbo soup <br />1 C Salad with 2 T light dressing<br />1 slice bread<br />2 tsp margarine or olive oil</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>Noodles w/tuna and vegetables: 1 1/4 cup Egg noodles, cooked w/out salt, 1/3 cup Green peas, 1/2 cup Sweet red peppers, 1/4 cup Tuna in water, 1 Tbsp low fat Mayonnaise<br />1 oz Roll<br />1/2 cup Strawberries <br />1/4 cup raisins</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Trail mix: C <br />Peanuts, almonds, raisins</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>Baked Potato w/ <br />1 C veggie chili or beef chili<br />1/4 C onion <br />1 oz cheese<br />2 C Salad: Green lettuce, carrots, cucumbers, tomatoes, mushroom <br />2 Tbsp low fat dressing<br />1 C low fat cottage cheese</p>\n" +
                                "<p><strong>Snack</strong> <br /><br />4 Graham cracker halves <br />1 Tbsp Peanut Butter</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>2 slc Rye bread w/ 1 Tbsp margarine and 1 Tbsp fruit spread <br />1 1/4 cup oat-type Cereal<br />1 cup skim Milk<br />1/2 Melon raw<br />1 1/2 cup Grapefruit juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Cup Chicken gumbo soup <br />1 C Salad with 2 T light dressing<br />1 slice bread<br />2 tsp margarine or olive oil</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>Noodles w/tuna and vegetables: 1 1/4 cup Egg noodles, cooked w/out salt, 1/3 cup Green peas, 1/2 cup Sweet red peppers, 1/4 cup Tuna in water, 1 Tbsp low fat Mayonnaise<br />1 oz Roll<br />1/2 cup Strawberries <br />1/4 cup raisins</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Trail mix: C <br />Peanuts, almonds, raisins</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>Baked Potato w/ <br />1 C veggie chili or beef chili<br />1/4 C onion <br />1 oz cheese<br />2 C Salad: Green lettuce, carrots, cucumbers, tomatoes, mushroom <br />2 Tbsp low fat dressing<br />1 C low fat cottage cheese</p>\n" +
                                "<p><strong>Snack</strong> <br /><br />4 Graham cracker halves <br />1 Tbsp Peanut Butter</p>"));
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
                        textDayData.setText(Html.fromHtml("<p>\n" +
                                "  <strong>Meal 1</strong><br/><br/>\n" +
                                "    Oat Bran 1/2 cup<br/> Cottage Cheese 1 cup<br/> Blueberries 1 cup<br/> Flaxseed 1 tbsp<br/> Cinnamon To taste.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 2</strong><br/><br/>\n" +
                                "    Eggs 2 yolk<br/> Eggs 6 whites<br/> Spinach 3 cups<br/> Garlic 1<br/> Squash 1 cup<br/> Grapefruit 1 whole.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 3</strong><br/><br/>\n" +
                                "    Orange 1<br/> Apple 1<br/> Almonds 1 oz<br/> Yogurt 1 cup.<br/><br/>\n" +
                                "\n" +
                                "  <strong>Meal 4</strong><br/><br/>\n" +
                                "   Tuna 1 can<br/> Black Beans 1/2 cup<br/> Balsamic Vinegar 1 tsp<br/> Banana 1.<br/><br/>\n" +
                                "  \n" +
                                "  <strong>Meal 5</strong><br/><br/>\n" +
                                "    Bell Peppers 1 whole<br/> Read Meat 5 oz<br/> COOKED BARLEY 1 cup<br/> Mushrooms 1/2 cup<br/> Spaghetti Sauce 1/2 cup<br/><br/> Note: Cook red meat, add mushrooms and sauce. Remove stem from bell pepper, stuff mixture into cavity and bake at 425 for 40 minutes.<br/><br/> \n" +
                                "  \n" +
                                "   <strong> Meal 6</strong><br/><br/>\n" +
                                "     Shake<br/> Blueberries 1 cup<br/> Flaxseed 1 tbsp.<br/><br/>\n" +
                                "</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p>\n" +
                                "  <strong>Meal 1</strong><br/><br/>\n" +
                                "    Oat Bran 1/2 cup<br/> Cottage Cheese 1 cup<br/> Blueberries 1 cup<br/> Flaxseed 1 tbsp<br/> Cinnamon To taste.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 2</strong><br/><br/>\n" +
                                "    Eggs 2 yolk<br/> Eggs 6 whites<br/> Spinach 3 cups<br/> Garlic 1<br/> Squash 1 cup<br/> Grapefruit 1 whole.<br/><br/>\n" +
                                "  \n" +
                                "  <strong> Meal 3</strong><br/><br/>\n" +
                                "    Orange 1<br/> Apple 1<br/> Almonds 1 oz<br/> Yogurt 1 cup.<br/><br/>\n" +
                                "\n" +
                                "  <strong>Meal 4</strong><br/><br/>\n" +
                                "   Tuna 1 can<br/> Black Beans 1/2 cup<br/> Balsamic Vinegar 1 tsp<br/> Banana 1.<br/><br/>\n" +
                                "  \n" +
                                "  <strong>Meal 5</strong><br/><br/>\n" +
                                "    Bell Peppers 1 whole<br/> Read Meat 5 oz<br/> COOKED BARLEY 1 cup<br/> Mushrooms 1/2 cup<br/> Spaghetti Sauce 1/2 cup<br/><br/> Note: Cook red meat, add mushrooms and sauce. Remove stem from bell pepper, stuff mixture into cavity and bake at 425 for 40 minutes.<br/><br/> \n" +
                                "  \n" +
                                "   <strong> Meal 6</strong><br/><br/>\n" +
                                "     Shake<br/> Blueberries 1 cup<br/> Flaxseed 1 tbsp.<br/><br/>\n" +
                                "</p>"));
                    }
                } else if (strCalories.equals("2800 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Low Carb Percentages Protein 47%%, Carb 22%%, Fat31%%</strong>\n" +
                                "<br /><br /><strong>7am Breakfast</strong><br /><br />\n" +
                                "3 eggs <br />2 oz cheese <br />2 oz salsa<br /> 2 grilled asparagus spears <br />1 scoop whey \n" +
                                "<br /><br /><strong>9 am snack 1</strong><br /><br />\n" +
                                "2 scoops whey protein powder<br /> 4 oz 1%% milk \n" +
                                "<br /><br /><strong>11am lunch</strong><br /><br />5 oz sliced turkey breast<br /> 1 piece whole wheat bread<br /> carrot sticks (from 1 carrot) <br />lettuce<br /> 1 scoop whey<br /> 4 oz 1%% milk <br /><br /><strong>1 PM snack 2</strong><br /><br /> 1 1/2 cups strawberries<br /> 1 cup 1%% fat cottage cheese <br /><br /><strong>3 pm snack 3</strong><br /><br /> 2 cheese sticks<br /> 5 slices salami<br /><br /><strong>5:30 pm snack 4</strong><br /><br />1 apple <br />1 tablespoon peanut butter<br /> 1 cup 1%% fat milk <strong><br /><br />6-6:45 pm evening</strong><br /><br />6:45 pm post-workout supplements<br /> 7:15 dinner <br />7.5 oz salmon <br />1 baked potato <br />1/2 cup broccoli <br /><br /><strong>9:30:00 PM bedtime supplements</strong><br /><br />10 pm bedtime <br />2 1/2 scoops casein protein<br /> 8 oz 1 %% milk</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Low Carb Percentages Protein 47%%, Carb 22%%, Fat31%%</strong>\n" +
                                "<br /><br /><strong>7am Breakfast</strong><br /><br />\n" +
                                "3 eggs <br />2 oz cheese <br />2 oz salsa<br /> 2 grilled asparagus spears <br />1 scoop whey \n" +
                                "<br /><br /><strong>9 am snack 1</strong><br /><br />\n" +
                                "2 scoops whey protein powder<br /> 4 oz 1%% milk \n" +
                                "<br /><br /><strong>11am lunch</strong><br /><br />5 oz sliced turkey breast<br /> 1 piece whole wheat bread<br /> carrot sticks (from 1 carrot) <br />lettuce<br /> 1 scoop whey<br /> 4 oz 1%% milk <br /><br /><strong>1 PM snack 2</strong><br /><br /> 1 1/2 cups strawberries<br /> 1 cup 1%% fat cottage cheese <br /><br /><strong>3 pm snack 3</strong><br /><br /> 2 cheese sticks<br /> 5 slices salami<br /><br /><strong>5:30 pm snack 4</strong><br /><br />1 apple <br />1 tablespoon peanut butter<br /> 1 cup 1%% fat milk <strong><br /><br />6-6:45 pm evening</strong><br /><br />6:45 pm post-workout supplements<br /> 7:15 dinner <br />7.5 oz salmon <br />1 baked potato <br />1/2 cup broccoli <br /><br /><strong>9:30:00 PM bedtime supplements</strong><br /><br />10 pm bedtime <br />2 1/2 scoops casein protein<br /> 8 oz 1 %% milk</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>1 Bagel, sesame seed <br />2 Tbsp Cream cheese, low fat<br />1 1/2 cup Oatmeal, cooked<br />1/2 cup Skim Milk<br />1/2 cup Peaches, canned, light<br />1 1/2 Tbsp Almonds, dried, blanched <br />3/4 cup Grapefruit juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>10-18 Pretzel Twists <br />1 cup Orange juice, calcium fortified</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>1 Deli sandwich 1 Hard roll, 4 oz lean turkey or Chicken breast <br />1 oz Cheddar cheese, low fat <br />3/4 cup Lettuce, shredded<br />2 Tomatoes, sliced <br />3/4 cup Juice drink, mixed fruit<br />1 Apple<br />3/4 cup Frozen dessert, lower fat ice cream</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Banana<br />6-8 oz Low fat yogurt</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>3 oz Haddock, baked<br />3/4 cup Macaroni salad <br />1 C Rice<br />2 Tbsp Margarine<br />1 cup Squash, winter, mashed</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 cup Frozen dessert, lower fat ice cream or frozen yogurt</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>1 Bagel, sesame seed <br />2 Tbsp Cream cheese, low fat<br />1 1/2 cup Oatmeal, cooked<br />1/2 cup Skim Milk<br />1/2 cup Peaches, canned, light<br />1 1/2 Tbsp Almonds, dried, blanched <br />3/4 cup Grapefruit juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>10-18 Pretzel Twists <br />1 cup Orange juice, calcium fortified</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>1 Deli sandwich 1 Hard roll, 4 oz lean turkey or Chicken breast <br />1 oz Cheddar cheese, low fat <br />3/4 cup Lettuce, shredded<br />2 Tomatoes, sliced <br />3/4 cup Juice drink, mixed fruit<br />1 Apple<br />3/4 cup Frozen dessert, lower fat ice cream</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Banana<br />6-8 oz Low fat yogurt</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>3 oz Haddock, baked<br />3/4 cup Macaroni salad <br />1 C Rice<br />2 Tbsp Margarine<br />1 cup Squash, winter, mashed</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 cup Frozen dessert, lower fat ice cream or frozen yogurt</p>"));
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
                        textDayData.setText(Html.fromHtml("<p><strong>Low FAT Percentages Protein 36%%, Carb 48%%, Fat18%%\n" +
                                "</strong> <br /><br /><strong>7am Breakfast</strong><br /><br />2 eggs<br /> 7 egg whites<br /> 1 cup oatmeal<br /> 1 banana \n" +
                                "  <br /><br /><strong>9 am snack 1</strong><br /><br />8 oz 1 %% milk<br /> 1 cup oat bran<br /><br /><strong>11 am lunch</strong><br /><br /> 2 piece whole wheat bread to make 1/2 <br />grilled cheese <br />2 oz cheese<br /> calorie free butter spray for grilled cheese<br /> 16 oz tomato soup<br /> 8 oz 1 %% milk<br /><br /><strong>1 PM snack 2</strong><br /><br />1 cup pineapple <br />1 cup plain nonfat yogurt <br /><br /><strong>3 pm snack 3</strong><br /><br />1/2 cup whole wheat pasta<br /> 1/2 cup pasta sauce<br /> 1 Tb parmasean cheese<br /> 5 pm pre-workout supplements <br /><br /><strong>5:30 pm snack 4</strong><br /><br />1 scoop whey protein <br />8 oz 1 %% milk <br /><br /><strong>6-6:45 pm evening</strong><br /><br />6:45 pm post-workout supplements <br />7:15 dinner<br /> 8 oz chicken breast <br />1 cup white rice<br /> 1 cup corn<br />1 cup broccoli <br />9:30:00 PM bedtime supplements<br /><br /><strong>10 pm bedtime</strong><br /><br />2 scoops casein protein<br /> 8 oz 1 %% milk</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Low FAT Percentages Protein 36%%, Carb 48%%, Fat18%%\n" +
                                "</strong> <br /><br /><strong>7am Breakfast</strong><br /><br />2 eggs<br /> 7 egg whites<br /> 1 cup oatmeal<br /> 1 banana \n" +
                                "  <br /><br /><strong>9 am snack 1</strong><br /><br />8 oz 1 %% milk<br /> 1 cup oat bran<br /><br /><strong>11 am lunch</strong><br /><br /> 2 piece whole wheat bread to make 1/2 <br />grilled cheese <br />2 oz cheese<br /> calorie free butter spray for grilled cheese<br /> 16 oz tomato soup<br /> 8 oz 1 %% milk<br /><br /><strong>1 PM snack 2</strong><br /><br />1 cup pineapple <br />1 cup plain nonfat yogurt <br /><br /><strong>3 pm snack 3</strong><br /><br />1/2 cup whole wheat pasta<br /> 1/2 cup pasta sauce<br /> 1 Tb parmasean cheese<br /> 5 pm pre-workout supplements <br /><br /><strong>5:30 pm snack 4</strong><br /><br />1 scoop whey protein <br />8 oz 1 %% milk <br /><br /><strong>6-6:45 pm evening</strong><br /><br />6:45 pm post-workout supplements <br />7:15 dinner<br /> 8 oz chicken breast <br />1 cup white rice<br /> 1 cup corn<br />1 cup broccoli <br />9:30:00 PM bedtime supplements<br /><br /><strong>10 pm bedtime</strong><br /><br />2 scoops casein protein<br /> 8 oz 1 %% milk</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>2 slc wheat bread w/1 1/2 Tbsp margarine and 2 Tbsp fruit spread <br />1 Fried egg <br />1 oz of cheese <br />2 links (about 1 1/2 oz) Sausage, lean or turkey 1 Orange <br />3/4 cup Milk, skim</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Wheat Tortilla <br />1 Tbsp jelly or honey <br />1/2 Grapefruit <br />1 Apple</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>1 1/2 cup Fresh fruit salad, w/apples, bananas, grapes, oranges and pears Roast Beef Sandwich 2 Bread, 3 oz lean meat <br />1 Tbsp light mayo, lettuce<br />1 Cup low fat Yogurt<br />1 cup Raspberry juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>C Granola<br />4 oz Skim or low fat Milk</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>1 Large Grilled Chicken salad made with <br />1 cup Loose-leaf lettuce, 1/2 cup Garbanzo beans, 3 Tbsp Carrots, shredded, 3 oz grilled Chicken, 2 Tbsp lite dressing <br />1/2 cup Brussels sprouts <br />3/4 cup Corn, yellow cooked w/ 1/3 cup sweet red pepper, chopped <br />2 Wheat dinner rolls, small<br />1 tbsp margarine</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Cup chocolate Pudding pudding <br />2 Tbsp Frozen nondairy whipped topping</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>2 slc wheat bread w/1 1/2 Tbsp margarine and 2 Tbsp fruit spread <br />1 Fried egg <br />1 oz of cheese <br />2 links (about 1 1/2 oz) Sausage, lean or turkey 1 Orange <br />3/4 cup Milk, skim</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Wheat Tortilla <br />1 Tbsp jelly or honey <br />1/2 Grapefruit <br />1 Apple</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>1 1/2 cup Fresh fruit salad, w/apples, bananas, grapes, oranges and pears Roast Beef Sandwich 2 Bread, 3 oz lean meat <br />1 Tbsp light mayo, lettuce<br />1 Cup low fat Yogurt<br />1 cup Raspberry juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>C Granola<br />4 oz Skim or low fat Milk</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>1 Large Grilled Chicken salad made with <br />1 cup Loose-leaf lettuce, 1/2 cup Garbanzo beans, 3 Tbsp Carrots, shredded, 3 oz grilled Chicken, 2 Tbsp lite dressing <br />1/2 cup Brussels sprouts <br />3/4 cup Corn, yellow cooked w/ 1/3 cup sweet red pepper, chopped <br />2 Wheat dinner rolls, small<br />1 tbsp margarine</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Cup chocolate Pudding pudding <br />2 Tbsp Frozen nondairy whipped topping</p>"));
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
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong> <br /><br />2 serv Cereal<br />8 oz milk<br />8 oz non-fat yogurt<br />1/2 grapfruit<br /><br /><strong> AM Snack</strong> <br /><br />2 pita breads<br />3/4 cup cottage cheese<br />1 cup melon <br />1 T nuts or seeds <br /><br /><strong>Lunch</strong> <br /><br />Turkey sand. <br />mustard <br />salad with 1 T oil <br /><br /><strong>PM Snack</strong> <br /><br />8 oz skim milk <br />fruit<br />4 cups popcorn <br /><br /><strong>Dinner</strong> <br /><br />1 potato with<br />nonfat dressing or salsa<br />3-4oz salmon<br />1 cups carrots <br />salad with 1 T oil <br /><br /><strong>Eve Snack</strong> <br /><br />2 serv. Cereal<br />8 oz milk <br />1 T nuts or seeds</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong> <br /><br />2 serv Cereal<br />8 oz milk<br />8 oz non-fat yogurt<br />1/2 grapfruit<br /><br /><strong> AM Snack</strong> <br /><br />2 pita breads<br />3/4 cup cottage cheese<br />1 cup melon <br />1 T nuts or seeds <br /><br /><strong>Lunch</strong> <br /><br />Turkey sand. <br />mustard <br />salad with 1 T oil <br /><br /><strong>PM Snack</strong> <br /><br />8 oz skim milk <br />fruit<br />4 cups popcorn <br /><br /><strong>Dinner</strong> <br /><br />1 potato with<br />nonfat dressing or salsa<br />3-4oz salmon<br />1 cups carrots <br />salad with 1 T oil <br /><br /><strong>Eve Snack</strong> <br /><br />2 serv. Cereal<br />8 oz milk <br />1 T nuts or seeds</p>"));
                    }
                } else if (strCalories.equals("3000 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<h2>Title</h2><br><p>Description here</p>"));
                    }
                } else if (strCalories.equals("3500 Calories")) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>2 Belgian Waffles<br />2 Tbsp Pancake syrup, low calorie <br />2 tsp Margarine, tub <br />1 cup Skim Milk <br />1 1/2 cup Orange juice, calcium fortified</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Smoothie<br />C low-fat yogurt<br />1 C fruit juice <br />C -1 C fruit, fresh, frozen or canned Sweetener as desired</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>2 pce Cheese pizza (1 pce = 1/8 of 12 in pizza)<br />2 cups Tossed salad with lettuce, tomato, carrots, cucumber green pepper and radishes<br />2 Tbsp Vinegar and oil salad dressing <br />1 Breadstick, plain<br />1 Carrot, raw <br />1 cup Apple Juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Fruit Juice <br />Granola Bar (or Sports Bar and 8 oz sports drink)</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>2 cup Spaghetti<br />1 cup Spaghetti sauce 2 Tbsp Parmesan cheese, grated <br />1 thick slice Italian Bread<br />2 tsp Margarine, tub, unsalted <br />1 cup Green beans<br />1 Cup Corn<br />8 oz skim or low fat milk</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Ice Cream Sandwich</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>2 Belgian Waffles<br />2 Tbsp Pancake syrup, low calorie <br />2 tsp Margarine, tub <br />1 cup Skim Milk <br />1 1/2 cup Orange juice, calcium fortified</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Smoothie<br />C low-fat yogurt<br />1 C fruit juice <br />C -1 C fruit, fresh, frozen or canned Sweetener as desired</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>2 pce Cheese pizza (1 pce = 1/8 of 12 in pizza)<br />2 cups Tossed salad with lettuce, tomato, carrots, cucumber green pepper and radishes<br />2 Tbsp Vinegar and oil salad dressing <br />1 Breadstick, plain<br />1 Carrot, raw <br />1 cup Apple Juice</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 Fruit Juice <br />Granola Bar (or Sports Bar and 8 oz sports drink)</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>2 cup Spaghetti<br />1 cup Spaghetti sauce 2 Tbsp Parmesan cheese, grated <br />1 thick slice Italian Bread<br />2 tsp Margarine, tub, unsalted <br />1 cup Green beans<br />1 Cup Corn<br />8 oz skim or low fat milk</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>Ice Cream Sandwich</p>"));
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
                        textDayData.setText(Html.fromHtml("<p><strong>Meal 1</strong><br /><br />Oat Bran1/2 cup <br />Banana 1 <br />Eggs EGG YOLK 1 <br />Hardboiled Eggs 6.<br /><br /><strong> Meal 2</strong><br /><br />Yogurt 1 cup Cottage <br />Cheese 1 cup <br />Grapes 1 <br />Flaxseed 1 tbsp. <br /><br /><strong> Meal 3</strong><br /><br />Spinach 3 cups<br />Turkey Bacon 2 strips<br />Mushrooms 1/2 cup <br />Carrots 1 cup <br />Grilled Chicken 3 oz <br />Balsamic Vinegar.<br/><br/><strong> Meal 4</strong><br /><br />Apple1 <br />Walnuts 1/2 oz <br />Protein 1 scoop.<br/><br/> <strong> Meal 5</strong> <br /><br />Salmon3 oz <br/>Rice 1/4 cup <br/> Swiss Chard <br/> 2 cups Steamed.<br/><br/>\n" +
                                "<strong> Meal 6</strong>\n" +
                                "<br/><br/>Cottage Cheese1 cup<br/> Almonds 1 oz <br/>Tomato 1/3 cup<br/> Basil Leaves<br/> Balsamic Vinegar.</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>Meal 1</strong><br /><br />Oat Bran1/2 cup <br />Banana 1 <br />Eggs EGG YOLK 1 <br />Hardboiled Eggs 6.<br /><br /><strong> Meal 2</strong><br /><br />Yogurt 1 cup Cottage <br />Cheese 1 cup <br />Grapes 1 <br />Flaxseed 1 tbsp. <br /><br /><strong> Meal 3</strong><br /><br />Spinach 3 cups<br />Turkey Bacon 2 strips<br />Mushrooms 1/2 cup <br />Carrots 1 cup <br />Grilled Chicken 3 oz <br />Balsamic Vinegar.<br/><br/><strong> Meal 4</strong><br /><br />Apple1 <br />Walnuts 1/2 oz <br />Protein 1 scoop.<br/><br/> <strong> Meal 5</strong> <br /><br />Salmon3 oz <br/>Rice 1/4 cup <br/> Swiss Chard <br/> 2 cups Steamed.<br/><br/>\n" +
                                "<strong> Meal 6</strong>\n" +
                                "<br/><br/>Cottage Cheese1 cup<br/> Almonds 1 oz <br/>Tomato 1/3 cup<br/> Basil Leaves<br/> Balsamic Vinegar.</p>"));
                    }
                }
                else if (strCalories.equals("2800 Calories"))
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        textDayData.setText(Html.fromHtml("<p><strong>360 Cals/5g Fat/78g Protein/8g Net Carb</strong> <br /><br /><strong>Daily Totals</strong> <br /><br />2840 Calories<br /> 165g Fat of which about 40 were Saturated <br />Fat<br /> 265g Protein <br />~30g Net Carb<br /><br /><strong>Meal 1</strong> <br /><br />3 Whole Eggs with 1oz Pepperjack Cheese<br /> cooked in 1 Tsp Oil <br />2 Turkey Sausage Links<br /> 10g Peanut Butter<br /> 530 Cals/36.5g Fat/36.5g Protein/2.5g Net<br /> Carbs<br /><br /><strong>Meal 2</strong> <br /><br />4oz. Ground Pork <br />1 Italian Sausage <br />1.5 Cup Salad Mix<br /> 470 Cals/32g Fat/38g Protein/3g Net Carb <br /><br /><strong>Meal 3</strong> <br /><br /> 4oz. 93/7 Ground Beef w/1oz Pepperjack<br /> Cheese<br /> 1 Turkey Sausage Link<br /> 32g Peanut Butter<br /> 530 Cals/34.5g Fat/40.5g Protein/3g Net<br /> Carb  <br /><br /><strong>Meal 4</strong> <br /><br /> 5oz. White-meat Chicken Breast cooked in<br /> 1Tbsp Oil <br />1 Turkey Sausage Link<br /> 1.5 Cup Salad Mix w/1 Tbsp Flaxmeal<br /> 21g Peanut Butter<br /> 500 Cals/30g Fat/40.5g Protein/5.25g Net<br /> Carb <br /><br /><strong>Meal 5</strong> <br /><br />6oz 1%% Cottage Cheese <br />1/2 Scoop Whey Protein<br /> 16g Almond Butter<br /> 5g Flaxmeal <br />1 Tbsp Oil<br /> 450 Cals/27g Fat/36.5g Protein/9.5g Net<br /> Carb<br /><br /><strong>Pre/Post Workout Shakes</strong> <br /><br />1.5 Scoop Whey before workout <br />2 Scoop Whey after workout</p>", Html.FROM_HTML_MODE_COMPACT));
                    } else {
                        textDayData.setText(Html.fromHtml("<p><strong>360 Cals/5g Fat/78g Protein/8g Net Carb</strong> <br /><br /><strong>Daily Totals</strong> <br /><br />2840 Calories<br /> 165g Fat of which about 40 were Saturated <br />Fat<br /> 265g Protein <br />~30g Net Carb<br /><br /><strong>Meal 1</strong> <br /><br />3 Whole Eggs with 1oz Pepperjack Cheese<br /> cooked in 1 Tsp Oil <br />2 Turkey Sausage Links<br /> 10g Peanut Butter<br /> 530 Cals/36.5g Fat/36.5g Protein/2.5g Net<br /> Carbs<br /><br /><strong>Meal 2</strong> <br /><br />4oz. Ground Pork <br />1 Italian Sausage <br />1.5 Cup Salad Mix<br /> 470 Cals/32g Fat/38g Protein/3g Net Carb <br /><br /><strong>Meal 3</strong> <br /><br /> 4oz. 93/7 Ground Beef w/1oz Pepperjack<br /> Cheese<br /> 1 Turkey Sausage Link<br /> 32g Peanut Butter<br /> 530 Cals/34.5g Fat/40.5g Protein/3g Net<br /> Carb  <br /><br /><strong>Meal 4</strong> <br /><br /> 5oz. White-meat Chicken Breast cooked in<br /> 1Tbsp Oil <br />1 Turkey Sausage Link<br /> 1.5 Cup Salad Mix w/1 Tbsp Flaxmeal<br /> 21g Peanut Butter<br /> 500 Cals/30g Fat/40.5g Protein/5.25g Net<br /> Carb <br /><br /><strong>Meal 5</strong> <br /><br />6oz 1%% Cottage Cheese <br />1/2 Scoop Whey Protein<br /> 16g Almond Butter<br /> 5g Flaxmeal <br />1 Tbsp Oil<br /> 450 Cals/27g Fat/36.5g Protein/9.5g Net<br /> Carb<br /><br /><strong>Pre/Post Workout Shakes</strong> <br /><br />1.5 Scoop Whey before workout <br />2 Scoop Whey after workout</p>"));
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
                        textDayData.setText(Html.fromHtml("<p><strong>Breakfast</strong></p>\n" +
                                "<p>1 cup Corn flakes cereal <br />1 cup Skim milk <br />2 slc Wheat bread, toasted w/1 Tbsp tub margarine and 1 Tbsp creamy peanut butter<br />1 Pear <br />3/4 cup Orange juice, calcium fortified</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1 cup Apple juice<br />1 Peach</p>\n" +
                                "<p><strong>Lunch</strong></p>\n" +
                                "<p>2 slices multigrain bread <br />2 tbsp peanut butter <br /> C raisins<br />1 raw carrot <br />1 cup low-fat or skim milk<br />2 Oatmeal Cookies</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>1-2 Slices wheat bread <br />3 oz deli sliced lean turkey, lettuce, mustard <br />1 Fruit</p>\n" +
                                "<p><strong>Dinner</strong></p>\n" +
                                "<p>Mixed vegetables w/linguini and 3 oz salmon <br />1 cup Mixed vegetables, broccoli, peppers, mushroom <br />1 Tbsp olive oil <br />1 cup Linguini<br />3 oz Pink salmon <br />2 spg Parsley, chopped <br />1/4 tsp Sage, ground <br />1 C Sweet potato</p>\n" +
                                "<p><strong>Snack</strong></p>\n" +
                                "<p>3 cups Popcorn, microwave, natural flavor, salt free <br />12 oz mixed juice</p>", Html.FROM_HTML_MODE_COMPACT));
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
