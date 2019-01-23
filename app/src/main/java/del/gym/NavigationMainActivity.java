package del.gym;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import del.gym.modal.home_data.ArrayofContentsModel;

public class NavigationMainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<ArrayofContentsModel> arrayData = new ArrayList<>();
    private RecyclerView homecontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        homecontent = findViewById(R.id.home_content);
        homecontent.setHasFixedSize(true);
        homecontent.setLayoutManager(new LinearLayoutManager(this));

        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.exercise_guide
                        , "Exercise Guide"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.workouts
                        , "Workouts"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.my_workouts
                        , "My Workouts"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.nutrition
                        , "Nutrition"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.stretching
                        , "Stretching"
                ));
        arrayData.add(
                new ArrayofContentsModel(
                        R.drawable.tips
                        , "Tips"
                ));

        HomeContentAdapter hc = new HomeContentAdapter(arrayData, this);
        LinearLayoutManager lm = new LinearLayoutManager(NavigationMainActivity.this, LinearLayoutManager.VERTICAL, false);
        homecontent.setLayoutManager(lm);
        homecontent.setItemAnimator(new DefaultItemAnimator());
        //homecontent.setAdapter(hc);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.share) {
            return true;
        } else if (id == R.id.getpro) {
            return true;
        } else if (id == R.id.ourapps) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.tools) {
            fragment = new Tools();
        } else if (id == R.id.exercise) {
            fragment = new Exerciseguide();
        } else if (id == R.id.workouts) {
            fragment = new Workouts();
        } else if (id == R.id.my_workouts) {
            fragment = new MyWorkouts();
        } else if (id == R.id.nutrition) {
            fragment = new Nutritions();
        } else if (id == R.id.coach) {
            fragment = new Coach();
        } else if (id == R.id.challenges) {
            fragment = new Challenges();
        } else if (id == R.id.reminders) {
            fragment = new Reminder();
        } else if (id == R.id.stretching) {
            fragment = new Stritching();
        } else if (id == R.id.get_pro_version) {
            fragment = new GetProVersion();
        } else if (id == R.id.plus) {
            fragment = new Plus();
        } else if (id == R.id.language) {
            fragment = new Language();
        } else {

        }

        if (fragment != null) {
            FragmentManager ft = getSupportFragmentManager();
            ft.beginTransaction().replace(R.id.frame, fragment).commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
