package del.gym.ui.activity.home_menu_activities;
import del.gym.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import del.gym.utils.BaseActivity;

public class ExerciseListActivity extends BaseActivity implements View.OnClickListener {

    private String strName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);

        getIntentData();
    }

    private void getIntentData() {
        strName = getIntent().getStringExtra("name");
        ((TextView) findViewById(R.id.tvTitle)).setText(strName);

        if (strName.equals("Chest")) {
            ((LinearLayout) findViewById(R.id.llChestList)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llBackList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBicepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llTricepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llLegList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llShoulderList)).setVisibility(View.GONE);
        } else if (strName.equals("Back")) {
            ((LinearLayout) findViewById(R.id.llChestList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBackList)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llBicepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llTricepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llLegList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llShoulderList)).setVisibility(View.GONE);
        } else if (strName.equals("Shoulders")) {
            ((LinearLayout) findViewById(R.id.llShoulderList)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llChestList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBackList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBicepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llTricepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llLegList)).setVisibility(View.GONE);
        } else if (strName.equals("Leg")) {
            ((LinearLayout) findViewById(R.id.llLegList)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llChestList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBackList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBicepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llTricepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llShoulderList)).setVisibility(View.GONE);
        } else if (strName.equals("Triceps")) {
            ((LinearLayout) findViewById(R.id.llTricepsList)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llChestList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBackList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBicepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llLegList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llShoulderList)).setVisibility(View.GONE);
        } else if (strName.equals("Biceps")) {
            ((LinearLayout) findViewById(R.id.llBicepsList)).setVisibility(View.VISIBLE);
            ((LinearLayout) findViewById(R.id.llChestList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llBackList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llTricepsList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llLegList)).setVisibility(View.GONE);
            ((LinearLayout) findViewById(R.id.llShoulderList)).setVisibility(View.GONE);
        }
        clickEvent();
    }

    private void clickEvent() {
        ((ImageView) findViewById(R.id.imgBack)).setOnClickListener(this);
        
        ((LinearLayout) findViewById(R.id.llFlatChestFly)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFlatChestPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llInclineChestFly)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llInclineChestPress)).setOnClickListener(this);

        /*Back*/
        ((LinearLayout) findViewById(R.id.llSingleArmRow)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFrenchPress)).setOnClickListener(this);

        /*Biceps*/
        ((LinearLayout) findViewById(R.id.llHammerCurl)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llBicepCurl)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llConcentrationCurl)).setOnClickListener(this);

        /*Shoulders*/
        ((LinearLayout) findViewById(R.id.llShoulderPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llLateralRaise)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llReverseFly)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFrontRaise)).setOnClickListener(this);

        /*Triceps*/
        ((LinearLayout) findViewById(R.id.llTricepsExtension)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llTricepFrenchPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llTricepsKickback)).setOnClickListener(this);

        /*Leg*/
        ((LinearLayout) findViewById(R.id.llHalfSquats)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llDumbellLunges)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBack:
                finish();
                break;
            case R.id.llFlatChestFly:
                sendDetail("FlatChestFly");
                break;
            case R.id.llFlatChestPress:
                sendDetail("FlatChestPress");
                break;
            case R.id.llInclineChestFly:
                sendDetail("InclineChestFly");
                break;
            case R.id.llInclineChestPress:
                sendDetail("InclineChestPress");
                break;
            /* Back */
            case R.id.llSingleArmRow:
                sendDetail("SingleArmRow");
                break;
            case R.id.llFrenchPress:
                sendDetail("FrenchPress");
                break;
            /* Biceps */
            case R.id.llHammerCurl:
                sendDetail("HammerCurl");
                break;
            case R.id.llBicepCurl:
                sendDetail("BicepCurl");
                break;
            case R.id.llConcentrationCurl:
                sendDetail("ConcentrationCurl");
                break;
            /*Shoulders*/
            case R.id.llShoulderPress:
                sendDetail("ShoulderPress");
                break;
            case R.id.llLateralRaise:
                sendDetail("LateralRaise");
                break;
            case R.id.llReverseFly:
                sendDetail("ReverseFly");
                break;
            case R.id.llFrontRaise:
                sendDetail("FrontRaise");
                break;
            /*Triceps*/
            case R.id.llTricepsExtension:
                sendDetail("TricepsExtension");
                break;
            case R.id.llTricepFrenchPress:
                sendDetail("TricepFrenchPress");
                break;
            case R.id.llTricepsKickback:
                sendDetail("TricepsKickback");
                break;
            /*Leg*/
            case R.id.llHalfSquats:
                sendDetail("HalfSquats");
                break;
            case R.id.llDumbellLunges:
                sendDetail("DumbellLunges");
                break;
        }
    }

    private void sendDetail(String strName) {
        Intent intent = new Intent(mContext, ExerciseDetailActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
