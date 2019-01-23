package del.gym;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CratinineActivity extends AppCompatActivity {
    private List<StretcingModel> nutritionDatalist = new ArrayList<>();

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cratinine);

        tabLayout = findViewById(R.id.product_tabs);
        viewPager = findViewById(R.id.product_viewpager);
        tabLayout.addTab(tabLayout.newTab().setText("WHAT IS IT?"));
        tabLayout.addTab(tabLayout.newTab().setText("BENEFITS"));
        tabLayout.addTab(tabLayout.newTab().setText("ADVANTAGE"));
        tabLayout.addTab(tabLayout.newTab().setText("SIDE EFFECTS"));
        tabLayout.addTab(tabLayout.newTab().setText("TYPES"));
        tabLayout.addTab(tabLayout.newTab().setText("RECOMMENDATIONS"));
        tabLayout.addTab(tabLayout.newTab().setText("DISADVANTAGES"));
        tabLayout.addTab(tabLayout.newTab().setText("WHEN TO USE"));
        tabLayout.addTab(tabLayout.newTab().setText("YOU MUST KNOW"));
        tabLayout.addTab(tabLayout.newTab().setText("HOW DOES IT"));
        tabLayout.addTab(tabLayout.newTab().setText("DANGERS"));
        tabLayout.addTab(tabLayout.newTab().setText("HOW DOES IT"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(getResources().getColor(R.color.white),getResources().getColor(R.color.medium_black));

        Bundle bundle = getIntent().getExtras();
        ArrayList<String>  stringData= bundle.getStringArrayList("StringData");

        CraetinineAdapter adapter = new CraetinineAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
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
