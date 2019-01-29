package del.gym.ui.activity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;

import del.gym.R;
import del.gym.menu.DrawerAdapter;
import del.gym.menu.DrawerItem;
import del.gym.menu.SimpleItem;
import del.gym.ui.fragment.HomeFragment;
import del.gym.ui.fragment.HomeMenuDetailFragment;
import del.gym.ui.fragment.ToolsFragment;
import del.gym.utils.BaseActivity;
import del.gym.utils.ConstantData;

public class NavigationLibraryActivity extends BaseActivity implements DrawerAdapter.OnItemSelectedListener {

    public static FragmentManager fragmentManager;
    private SlidingRootNav slidingRootNav;
    private static final int NAV1 = 0;
    private static final int NAV2 = 1;
    private static final int NAV3 = 2;
    private static final int NAV4 = 3;
    private static final int NAV5 = 4;

    private Drawable[] screenIcons;
    private String[] screenTitles;
    public static TextView tooltext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_library);
        mContext = this;

        init(savedInstanceState);
    }

    private void init(Bundle savedInstanceState) {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fragmentManager = getSupportFragmentManager();
        tooltext = findViewById(R.id.tooltext);

        slidingRootNav = new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(true)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_left_drawer)
                .inject();

        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();

        DrawerAdapter drawadapter = new DrawerAdapter(Arrays.asList(
                createItemFor(NAV1).setChecked(true),
                createItemFor(NAV2),
                createItemFor(NAV3),
                createItemFor(NAV4),
                createItemFor(NAV5)));
        drawadapter.setListener(this);

        RecyclerView list = findViewById(R.id.list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(drawadapter);
        drawadapter.setSelected(NAV1);

        setHomePage();
    }

    public void setHomePage() {
        tooltext.setText("Home");
        fragmentManager
                .beginTransaction()
                .replace(R.id.home_frame, new HomeFragment(),
                        ConstantData.HOME).commit();
    }

    private DrawerItem createItemFor(int position) {
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.lightWhite))
                .withTextTint(color(R.color.lightWhite))
                .withSelectedIconTint(color(R.color.lightWhite))
                .withSelectedTextTint(color(R.color.lightWhite));
    }

    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.ld_activityScreenTitles);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.ld_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0) {
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }

    @Override
    public void onItemSelected(int position) {
        if (position == NAV1) {
            tooltext.setText("Home");
            setHomePage();
        } else if (position == NAV2) {
            changeFragment("Tools", new ToolsFragment(), ConstantData.TOOLS);
        } else if (position == NAV3) {
            changeFragment("ExerciseGuide", ConstantData.HomeMenuDetailFragment);
        } else if (position == NAV4) {
            changeFragment("Workout", ConstantData.HomeMenuDetailFragment);
        } else if (position == NAV5) {
            setIntentData("MyWorkout");
        }
        slidingRootNav.closeMenu();
    }

    @ColorInt
    private int color(@ColorRes int res) {
        return ContextCompat.getColor(this, res);
    }

    @Override
    public void onBackPressed() {
        if (slidingRootNav.isMenuOpened()) {
            slidingRootNav.closeMenu();
        }

        Fragment HomeFragment = fragmentManager.findFragmentByTag(ConstantData.HOME);
        Fragment ToolsFragment = fragmentManager.findFragmentByTag(ConstantData.TOOLS);
        Fragment HomeMenuDetailFragment = fragmentManager.findFragmentByTag(ConstantData.HomeMenuDetailFragment);

        if (HomeFragment != null)
            setHomePage();
        else if (ToolsFragment != null)
            setHomePage();
        else if (HomeMenuDetailFragment != null)
            setHomePage();
        else
            finish();
    }

    private void changeFragment(String strName, Fragment fragment, String strTag) {
        tooltext.setText(strName);
        fragmentManager
                .beginTransaction()
                .replace(R.id.home_frame, fragment,
                        strTag).commit();
    }

    private void changeFragment(String strName, String strTag) {
        HomeMenuDetailFragment homeMenuDetailFragment = new HomeMenuDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", strName);
        homeMenuDetailFragment.setArguments(bundle);
        tooltext.setText(strName);
        fragmentManager
                .beginTransaction()
                .replace(R.id.home_frame, homeMenuDetailFragment,
                        strTag).commit();
    }

    private void setIntentData(String data) {
        Intent intent = new Intent(mContext, MyWorkOutActivity.class);
        intent.putExtra("name", data);
        startActivity(intent);
    }
}
