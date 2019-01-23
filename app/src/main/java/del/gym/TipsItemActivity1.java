package del.gym;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.view.menu.MenuBuilder;
import android.view.MenuItem;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;


public class TipsItemActivity1 extends AppCompatActivity {
   private Menu menu;
  private CoordinatorLayout coordinator;
   private CollapsingToolbarLayout collapsing;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_item1);
        final Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        coordinator =(CoordinatorLayout) findViewById(R.id.coordinator);
        collapsing =(CollapsingToolbarLayout) findViewById(R.id.collapsing);


        AppBarLayout appBarLayout = findViewById(R.id.appbar_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        this.menu = menu;

        getMenuInflater().inflate(R.menu.collapsemenutoolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.getproversion) {
            return true;
        } else if (id == R.id.ourotherapps) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
