package del.gym;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProteinActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein);
        tabLayout = findViewById(R.id.product_tabs);
        viewPager = findViewById(R.id.product_viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("WHAT IS IT"));
        tabLayout.addTab(tabLayout.newTab().setText("TYPES"));
        tabLayout.addTab(tabLayout.newTab().setText("RECOMMENDATIONS"));
        tabLayout.setTabGravity(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(getResources().getColor(R.color.white), getResources().getColor(R.color.medium_black));

        ProteinAdapter adapter = new ProteinAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
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

