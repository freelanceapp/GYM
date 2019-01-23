package del.gym;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class NutritionProductActity extends AppCompatActivity {
    private List<StretcingModel> productlist   = new ArrayList<>();

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_product_actity);
        tabLayout = findViewById(R.id.product_tabs);
        viewPager = findViewById(R.id.product_viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("WHAT ID IT"));
        tabLayout.addTab(tabLayout.newTab().setText("TYPES"));
        tabLayout.addTab(tabLayout.newTab().setText("RECOMMENDATIONS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(getResources().getColor(R.color.medium_black), getResources().getColor(R.color.white));

        ProductsAdapter adapter = new ProductsAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
