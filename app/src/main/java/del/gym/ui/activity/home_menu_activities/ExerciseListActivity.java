package del.gym.ui.activity.home_menu_activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import del.gym.R;
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
        ((LinearLayout) findViewById(R.id.llic_chest_pechoe)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechof)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechog)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechoh)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechoi)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechoj)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechok)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechol)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechom)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechon)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_chest_pechoo)).setOnClickListener(this);

        /*Back*/
        ((LinearLayout) findViewById(R.id.llSingleArmRow)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFrenchPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldac)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldad)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldae)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldaf)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldag)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldah)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldai)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldaj)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldak)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_back_espaldal)).setOnClickListener(this);

        /*Biceps*/
        ((LinearLayout) findViewById(R.id.llHammerCurl)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llBicepCurl)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llConcentrationCurl)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepsd)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepse)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepsf)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepsg)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepsh)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepsi)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_bicepsj)).setOnClickListener(this);

        /*Shoulders*/
        ((LinearLayout) findViewById(R.id.llShoulderPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llLateralRaise)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llReverseFly)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llFrontRaise)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrose)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosf)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosg)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosh)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosi)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosj)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosk)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_shoulder_hombrosl)).setOnClickListener(this);

        /*Triceps*/
        ((LinearLayout) findViewById(R.id.llTricepsExtension)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llTricepFrenchPress)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llTricepsKickback)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepsd)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepse)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepsf)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepsg)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepsh)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepsi)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_tricepsj)).setOnClickListener(this);

        /*Leg*/
        ((LinearLayout) findViewById(R.id.llHalfSquats)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llDumbellLunges)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_leg_piernasc)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_leg_piernasd)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_leg_piernase)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_leg_piernasf)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_leg_piernasg)).setOnClickListener(this);
        ((LinearLayout) findViewById(R.id.llic_leg_piernash)).setOnClickListener(this);
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
            case R.id.llic_chest_pechoe:
                sendDetail("llic_chest_pechoe");
                break;
            case R.id.llic_chest_pechof:
                sendDetail("llic_chest_pechof");
                break;
            case R.id.llic_chest_pechog:
                sendDetail("llic_chest_pechog");
                break;
            case R.id.llic_chest_pechoh:
                sendDetail("llic_chest_pechoh");
                break;
            case R.id.llic_chest_pechoi:
                sendDetail("llic_chest_pechoi");
                break;
            case R.id.llic_chest_pechoj:
                sendDetail("llic_chest_pechoj");
                break;
            case R.id.llic_chest_pechok:
                sendDetail("llic_chest_pechok");
                break;
            case R.id.llic_chest_pechol:
                sendDetail("llic_chest_pechol");
                break;
            case R.id.llic_chest_pechom:
                sendDetail("llic_chest_pechom");
                break;
            case R.id.llic_chest_pechon:
                sendDetail("llic_chest_pechon");
                break;
            case R.id.llic_chest_pechoo:
                sendDetail("llic_chest_pechoo");
                break;


            /* Back */
            case R.id.llSingleArmRow:
                sendDetail("SingleArmRow");
                break;
            case R.id.llFrenchPress:
                sendDetail("FrenchPress");
                break;
            case R.id.llic_back_espaldac:
                sendDetail("llic_back_espaldac");
                break;
            case R.id.llic_back_espaldad:
                sendDetail("llic_back_espaldad");
                break;
            case R.id.llic_back_espaldae:
                sendDetail("llic_back_espaldae");
                break;
            case R.id.llic_back_espaldaf:
                sendDetail("llic_back_espaldaf");
                break;
            case R.id.llic_back_espaldag:
                sendDetail("llic_back_espaldag");
                break;
            case R.id.llic_back_espaldah:
                sendDetail("llic_back_espaldah");
                break;
            case R.id.llic_back_espaldai:
                sendDetail("llic_back_espaldai");
                break;
            case R.id.llic_back_espaldaj:
                sendDetail("llic_back_espaldaj");
                break;
            case R.id.llic_back_espaldak:
                sendDetail("llic_back_espaldak");
                break;
            case R.id.llic_back_espaldal:
                sendDetail("llic_back_espaldal");
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
            case R.id.llic_bicepsd:
                sendDetail("llic_bicepsd");
                break;
            case R.id.llic_bicepse:
                sendDetail("llic_bicepse");
                break;
            case R.id.llic_bicepsf:
                sendDetail("llic_bicepsf");
                break;
            case R.id.llic_bicepsg:
                sendDetail("llic_bicepsg");
                break;
            case R.id.llic_bicepsh:
                sendDetail("llic_bicepsh");
                break;
            case R.id.llic_bicepsi:
                sendDetail("llic_bicepsi");
                break;
            case R.id.llic_bicepsj:
                sendDetail("llic_bicepsj");
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
            case R.id.llic_shoulder_hombrose:
                sendDetail("llic_shoulder_hombrose");
                break;
            case R.id.llic_shoulder_hombrosf:
                sendDetail("llic_shoulder_hombrosf");
                break;
            case R.id.llic_shoulder_hombrosg:
                sendDetail("llic_shoulder_hombrosg");
                break;
            case R.id.llic_shoulder_hombrosh:
                sendDetail("llic_shoulder_hombrosh");
                break;
            case R.id.llic_shoulder_hombrosi:
                sendDetail("llic_shoulder_hombrosi");
                break;
            case R.id.llic_shoulder_hombrosj:
                sendDetail("llic_shoulder_hombrosj");
                break;
            case R.id.llic_shoulder_hombrosk:
                sendDetail("llic_shoulder_hombrosk");
                break;
            case R.id.llic_shoulder_hombrosl:
                sendDetail("llic_shoulder_hombrosl");
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
            case R.id.llic_tricepsd:
                sendDetail("llic_tricepsd");
                break;
            case R.id.llic_tricepse:
                sendDetail("llic_tricepse");
                break;
            case R.id.llic_tricepsf:
                sendDetail("llic_tricepsf");
                break;
            case R.id.llic_tricepsg:
                sendDetail("llic_tricepsg");
                break;
            case R.id.llic_tricepsh:
                sendDetail("llic_tricepsh");
                break;
            case R.id.llic_tricepsi:
                sendDetail("llic_tricepsi");
                break;
            case R.id.llic_tricepsj:
                sendDetail("llic_tricepsj");
                break;


            /*Leg*/
            case R.id.llHalfSquats:
                sendDetail("HalfSquats");
                break;
            case R.id.llDumbellLunges:
                sendDetail("DumbellLunges");
                break;
            case R.id.llic_leg_piernasc:
                sendDetail("llic_leg_piernasc");
                break;
            case R.id.llic_leg_piernasd:
                sendDetail("llic_leg_piernasd");
                break;
            case R.id.llic_leg_piernase:
                sendDetail("llic_leg_piernase");
                break;
            case R.id.llic_leg_piernasf:
                sendDetail("llic_leg_piernasf");
                break;
            case R.id.llic_leg_piernasg:
                sendDetail("llic_leg_piernasg");
                break;
            case R.id.llic_leg_piernash:
                sendDetail("llic_leg_piernash");
                break;
        }
    }

    private void sendDetail(String strName) {
        Intent intent = new Intent(mContext, ExerciseDetailActivity.class);
        intent.putExtra("name", strName);
        startActivity(intent);
    }
}
