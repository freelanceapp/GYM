package del.gym;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BeginnerMediums extends AppCompatActivity {

    private List<StretcingModel> begginerfragmentList1 = new ArrayList<>();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_mediums);
        tabLayout = findViewById(R.id.bigginermedium_tabs);
        viewPager = findViewById(R.id.beginnermedium_viewpager);

        tabLayout.addTab(tabLayout.newTab().setText("BEGINNER"));
        tabLayout.addTab(tabLayout.newTab().setText("INTERMEDIUM"));
        tabLayout.addTab(tabLayout.newTab().setText("ADVANCED"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);
        tabLayout.setTabTextColors(getResources().getColor(R.color.medium_black), getResources().getColor(R.color.white));


        begginerfragmentList1.clear();
        begginerfragmentList1 = getIntent().getParcelableArrayListExtra("datalist");

        BeginnerMediumAdapter adapter = new BeginnerMediumAdapter(getSupportFragmentManager(), tabLayout.getTabCount(),begginerfragmentList1);
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
