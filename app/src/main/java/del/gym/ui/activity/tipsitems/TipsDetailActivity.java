package del.gym.ui.activity.tipsitems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import del.gym.R;
import del.gym.ui.activity.home_menu_activities.ExerciseDetailActivity;
import del.gym.ui.fragment.HomeMenuDetailFragment;

public class TipsDetailActivity extends AppCompatActivity implements View.OnClickListener{

    private String strName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips2);
       findViewById(R.id.ic_back).setOnClickListener(this);
        getIntentData();
    }

    private void getIntentData() {

        strName = getIntent().getStringExtra("name");

        if (strName.equals(getString(R.string.how_to_acclerate))) {
            findViewById(R.id.tldata1).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips1));
        } else if (strName.equals(getString(R.string.whey_protein))) {
            findViewById(R.id.tldata2).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips2));
        } else if (strName.equals(getString(R.string.the_4_supplements))) {
            findViewById(R.id.tldata3).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips3));
        } else if (strName.equals(getString(R.string.how_to_recognize))) {
            findViewById(R.id.tldata4).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips4));
        } else if (strName.equals(getString(R.string.guide_to_choose_your_sepplement))) {
            findViewById(R.id.tldata5).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips5));
        } else if (strName.equals(getString(R.string.do_not))) {
            findViewById(R.id.tldata6).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips6));
        }else if (strName.equals(getString(R.string.go_to_market))) {
            findViewById(R.id.tldata7).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips7));
        }else if (strName.equals(getString(R.string.sign_up))) {
            findViewById(R.id.tldata8).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips12));
        }else if (strName.equals(getString(R.string.balanced_diet))) {
            findViewById(R.id.tldata9).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips8));
        }else if (strName.equals(getString(R.string.do_you_like))) {
            findViewById(R.id.tldata10).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips9));
        }else if (strName.equals(getString(R.string.enjoy_your_food))) {
            findViewById(R.id.tldata11).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips10));
        }else if (strName.equals(getString(R.string.in_your))) {
            findViewById(R.id.tldata12).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips11));
        }else if (strName.equals(getString(R.string.improve_your_enviroment))) {
            findViewById(R.id.tldata13).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips13));
        }else if (strName.equals(getString(R.string.eat_consciously))) {
            findViewById(R.id.tldata14).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips14));
        }else if (strName.equals(getString(R.string.he_chef))) {
            findViewById(R.id.tldata15).setVisibility(View.VISIBLE);
            ((ImageView) findViewById(R.id.image1)).setImageDrawable(getResources().getDrawable(R.drawable.tips15));
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ic_back:
            finish();

        }
    }
}
