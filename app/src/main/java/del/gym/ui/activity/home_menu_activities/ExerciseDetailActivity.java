package del.gym.ui.activity.home_menu_activities;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import del.gym.R;
import del.gym.utils.BaseActivity;
import pl.droidsonroids.gif.GifImageView;

public class ExerciseDetailActivity extends BaseActivity implements View.OnClickListener {

    private String strName = "";
    private GifImageView gifImage;
    private ImageView imgExercise;
    private CountDownTimer cTimer;
    private boolean isTimerStart = false;
    private TextView tvMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        getIntentData();
    }

    private void getIntentData() {
        if (getIntent() == null) return;

        tvMinute = findViewById(R.id.tvMinute);
        findViewById(R.id.imgBack).setOnClickListener(this);
        findViewById(R.id.btnStart).setOnClickListener(this);
        findViewById(R.id.btnCancel).setOnClickListener(this);
        gifImage = findViewById(R.id.gifImage);
        imgExercise = findViewById(R.id.imgExercise);
        strName = getIntent().getStringExtra("name");

        if (strName.equals("FlatChestFly")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC1));
            gifImage.setImageResource(R.drawable.ic_chest_pechoa);
        } else if (strName.equals("FlatChestPress")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC2));
            gifImage.setImageResource(R.drawable.ic_chest_pechob);
        } else if (strName.equals("InclineChestFly")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC3));
            gifImage.setImageResource(R.drawable.ic_chest_pechoc);
        } else if (strName.equals("InclineChestPress")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC4));
            gifImage.setImageResource(R.drawable.ic_chest_pechod);
        } else if (strName.equals("llic_chest_pechoe")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC5));
            gifImage.setImageResource(R.drawable.ic_chest_pechoe);
        } else if (strName.equals("llic_chest_pechof")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC6));
            gifImage.setImageResource(R.drawable.ic_chest_pechof);
        } else if (strName.equals("llic_chest_pechog")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC7));
            gifImage.setImageResource(R.drawable.ic_chest_pechog);
        } else if (strName.equals("llic_chest_pechoh")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC8));
            gifImage.setImageResource(R.drawable.ic_chest_pechoh);
        } else if (strName.equals("llic_chest_pechoi")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC9));
            gifImage.setImageResource(R.drawable.ic_chest_pechoi);
        } else if (strName.equals("llic_chest_pechoj")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC10));
            gifImage.setImageResource(R.drawable.ic_chest_pechoj);
        } else if (strName.equals("llic_chest_pechok")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC11));
            gifImage.setImageResource(R.drawable.ic_chest_pechok);
        } else if (strName.equals("llic_chest_pechol")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC12));
            gifImage.setImageResource(R.drawable.ic_chest_pechol);
        } else if (strName.equals("llic_chest_pechom")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC13));
            gifImage.setImageResource(R.drawable.ic_chest_pechom);
        } else if (strName.equals("llic_chest_pechon")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC14));
            gifImage.setImageResource(R.drawable.ic_chest_pechon);
        } else if (strName.equals("llic_chest_pechoo")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PEC15));
            gifImage.setImageResource(R.drawable.ic_chest_pechoo);
        }

        /*Back*/
        else if (strName.equals("SingleArmRow")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP1));
            gifImage.setImageResource(R.drawable.ic_back_espaldaa);
        } else if (strName.equals("FrenchPress")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP2));
            gifImage.setImageResource(R.drawable.ic_back_espaldab);
        } else if (strName.equals("llic_back_espaldac")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP3));
            gifImage.setImageResource(R.drawable.ic_back_espaldac);
        } else if (strName.equals("llic_back_espaldad")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP4));
            gifImage.setImageResource(R.drawable.ic_back_espaldad);
        } else if (strName.equals("llic_back_espaldae")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP5));
            gifImage.setImageResource(R.drawable.ic_back_espaldae);
        } else if (strName.equals("llic_back_espaldaf")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP6));
            gifImage.setImageResource(R.drawable.ic_back_espaldaf);
        } else if (strName.equals("llic_back_espaldag")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP7));
            gifImage.setImageResource(R.drawable.ic_back_espaldag);
        } else if (strName.equals("llic_back_espaldah")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP8));
            gifImage.setImageResource(R.drawable.ic_back_espaldah);
        } else if (strName.equals("llic_back_espaldai")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP9));
            gifImage.setImageResource(R.drawable.ic_back_espaldai);
        } else if (strName.equals("llic_back_espaldaj")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP10));
            gifImage.setImageResource(R.drawable.ic_back_espaldaj);
        } else if (strName.equals("llic_back_espaldak")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP11));
            gifImage.setImageResource(R.drawable.ic_back_espaldak);
        } else if (strName.equals("llic_back_espaldal")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.ESP12));
            gifImage.setImageResource(R.drawable.ic_back_espaldal);
        }

        /*Shoulders*/
        else if (strName.equals("ShoulderPress")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM1));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosa);
        } else if (strName.equals("LateralRaise")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM2));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosb);
        } else if (strName.equals("ReverseFly")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM3));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosc);
        } else if (strName.equals("FrontRaise")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM4));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosd);
        } else if (strName.equals("llic_shoulder_hombrose")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM5));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrose);
        } else if (strName.equals("llic_shoulder_hombrosf")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM6));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosf);
        } else if (strName.equals("llic_shoulder_hombrosg")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM7));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosg);
        } else if (strName.equals("llic_shoulder_hombrosh")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM8));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosh);
        } else if (strName.equals("llic_shoulder_hombrosi")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM9));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosi);
        } else if (strName.equals("llic_shoulder_hombrosj")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM10));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosj);
        } else if (strName.equals("llic_shoulder_hombrosk")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM11));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosk);
        } else if (strName.equals("llic_shoulder_hombrosl")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.HOM12));
            gifImage.setImageResource(R.drawable.ic_shoulder_hombrosl);
        }

        /*Biceps*/
        else if (strName.equals("HammerCurl")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC1));
            gifImage.setImageResource(R.drawable.ic_bicepsa);
        } else if (strName.equals("BicepCurl")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC5));
            gifImage.setImageResource(R.drawable.ic_bicepsb);
        } else if (strName.equals("ConcentrationCurl")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC3));
            gifImage.setImageResource(R.drawable.ic_bicepsc);
        } else if (strName.equals("llic_bicepsd")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC4));
            gifImage.setImageResource(R.drawable.ic_bicepsd);
        } else if (strName.equals("llic_bicepse")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC5));
            gifImage.setImageResource(R.drawable.ic_bicepse);
        } else if (strName.equals("llic_bicepsf")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC6));
            gifImage.setImageResource(R.drawable.ic_bicepsf);
        } else if (strName.equals("llic_bicepsg")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC7));
            gifImage.setImageResource(R.drawable.ic_bicepsg);
        } else if (strName.equals("llic_bicepsh")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC8));
            gifImage.setImageResource(R.drawable.ic_bicepsh);
        } else if (strName.equals("llic_bicepsi")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC9));
            gifImage.setImageResource(R.drawable.ic_bicepsi);
        } else if (strName.equals("llic_bicepsj")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.BIC10));
            gifImage.setImageResource(R.drawable.ic_bicepsj);
        }

        /*Triceps*/
        else if (strName.equals("TricepsExtension")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI1));
            gifImage.setImageResource(R.drawable.ic_tricepsa);
        } else if (strName.equals("TricepFrenchPress")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI2));
            gifImage.setImageResource(R.drawable.ic_tricepsb);
        } else if (strName.equals("TricepsKickback")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI3));
            gifImage.setImageResource(R.drawable.ic_tricepsc);
        } else if (strName.equals("llic_tricepsd")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI4));
            gifImage.setImageResource(R.drawable.ic_tricepsd);
        } else if (strName.equals("llic_tricepse")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI5));
            gifImage.setImageResource(R.drawable.ic_tricepse);
        } else if (strName.equals("llic_tricepsf")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI6));
            gifImage.setImageResource(R.drawable.ic_tricepsf);
        } else if (strName.equals("llic_tricepsg")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI7));
            gifImage.setImageResource(R.drawable.ic_tricepsg);
        } else if (strName.equals("llic_tricepsh")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI8));
            gifImage.setImageResource(R.drawable.ic_tricepsh);
        } else if (strName.equals("llic_tricepsi")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI9));
            gifImage.setImageResource(R.drawable.ic_tricepsi);
        } else if (strName.equals("llic_tricepsj")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.TRI10));
            gifImage.setImageResource(R.drawable.ic_tricepsj);
        }

        /*Leg*/
        else if (strName.equals("HalfSquats")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE1));
            gifImage.setImageResource(R.drawable.ic_leg_piernasa);
        } else if (strName.equals("DumbellLunges")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE2));
            gifImage.setImageResource(R.drawable.ic_leg_piernasb);
        } else if (strName.equals("llic_leg_piernasc")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE3));
            gifImage.setImageResource(R.drawable.ic_leg_piernasc);
        } else if (strName.equals("llic_leg_piernasd")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE4));
            gifImage.setImageResource(R.drawable.ic_leg_piernasd);
        } else if (strName.equals("llic_leg_piernase")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE5));
            gifImage.setImageResource(R.drawable.ic_leg_piernase);
        } else if (strName.equals("llic_leg_piernasf")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE6));
            gifImage.setImageResource(R.drawable.ic_leg_piernasf);
        } else if (strName.equals("llic_leg_piernasg")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE7));
            gifImage.setImageResource(R.drawable.ic_leg_piernasg);
        } else if (strName.equals("llic_leg_piernash")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.PIE8));
            gifImage.setImageResource(R.drawable.ic_leg_piernash);
        }

        /* Bodyweight */
        else if (strName.equals("Squats")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_benchdip);
        } else if (strName.equals("Crunch")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_boxjump);
        } else if (strName.equals("PullUps")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_jump);
        } else if (strName.equals("ClapPushups")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_plank);
        } else if (strName.equals("Handstand")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_pushup);
        } else if (strName.equals("llic_bw_muscle_up")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_muscle_up);
        } else if (strName.equals("llic_bw_crunch")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_crunch);
        } else if (strName.equals("llic_bw_pull_ups")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_pull_ups);
        } else if (strName.equals("llic_bw_squats")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_squats);
        }

        /*Battlerope*/
        else if (strName.equals("AlternatingWaves")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("DoubleArmWaves")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("DoubleArmSlam")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("DoubleArmSlamJump")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("Snakes")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        }

        /*Box*/
        else if (strName.equals("StepUpJumps")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_a));
            gifImage.setImageResource(R.drawable.ic_box_hurdel_jump);
        } else if (strName.equals("SingleLegJumps")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_b));
            gifImage.setImageResource(R.drawable.ic_box_jump);
        } else if (strName.equals("LateralJumps")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_c));
            gifImage.setImageResource(R.drawable.ic_box_lateral_jump);
        } else if (strName.equals("DepthJumps")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_d));
            gifImage.setImageResource(R.drawable.ic_box_depth_jump);
        } else if (strName.equals("StepUps")) {
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_e));
            gifImage.setImageResource(R.drawable.ic_box_lateral_push_off);
        }

        /*Suspension*/
        else if (strName.equals("SuspensionSquat")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_biseps);
        } else if (strName.equals("SuspensionChestPress")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_crossing_balance);
        } else if (strName.equals("SuspensionTricepsPress")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_hamstring_curl);
            gifImage.setImageResource(R.drawable.ic_suspension_hamstring_curl);
        } else if (strName.equals("SuspensionPowerPull")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_legs);
        } else if (strName.equals("SuspensionLunge")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_pendulum);
        }

        /*Cardio*/
        else if (strName.equals("CardioClamshell")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            findViewById(R.id.tvExerciseDetail).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_clamshell);
        } else if (strName.equals("CardioFireHydrant")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            findViewById(R.id.tvExerciseDetail).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_fire_hydrant);
        } else if (strName.equals("CardioSideKick")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            findViewById(R.id.tvExerciseDetail).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_side_kick);
        } else if (strName.equals("CardioSidePlankHip")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            findViewById(R.id.tvExerciseDetail).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_side_plank_hip);
        } else if (strName.equals("CardioStandingOpenGate")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            findViewById(R.id.tvExerciseDetail).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_standing_open_gate);
        }

        /*Home exercise*/
        else if (strName.equals("ScissorCrunches")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_home_ex_scissors_crunches);
        } else if (strName.equals("RopeJump")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_home_ex_rope_jump);
        } else if (strName.equals("InclinePushUp")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_home_ex_push_up);
        } else if (strName.equals("HandstandAssist")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_home_ex_handstand);
        } else if (strName.equals("MountainClimber")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_home_ex_mountain_climbing);
        }

        /*Calisthenics*/
        else if (strName.equals("CalisthenicsPushUps")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_calisthenics_push_ups);
        } else if (strName.equals("CalisthenicsBicycleCrunches")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_calisthenics_bicycle_crunches);
        } else if (strName.equals("CalisthenicsChinUps")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_calisthenics_chin_ups);
        } else if (strName.equals("CalisthenicsSitUps")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_calisthenics_sit_ups);
        } else if (strName.equals("CalisthenicsWidePushups")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_calisthenics_wide_pushups);
        }

        /*Calisthenics*/
        else if (strName.equals("CalisthenicsPushUps")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setImageResource(R.drawable.ic_calisthenics_push_ups);
        } else if (strName.equals("CalisthenicsBicycleCrunches")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setImageResource(R.drawable.ic_calisthenics_bicycle_crunches);
        } else if (strName.equals("CalisthenicsChinUps")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setImageResource(R.drawable.ic_calisthenics_chin_ups);
        } else if (strName.equals("CalisthenicsSitUps")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setImageResource(R.drawable.ic_calisthenics_sit_ups);
        } else if (strName.equals("CalisthenicsWidePushups")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setImageResource(R.drawable.ic_calisthenics_wide_pushups);
        }

        /*FunctionalTraining*/
        else if (strName.equals("FunctionalStepsUpJump")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_functional_step_jumps);
        } else if (strName.equals("FunctionalAlternatingWaves")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_functional_alternating_waves);
        } else if (strName.equals("FunctionalBurpees")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_functional_burpees);
        } else if (strName.equals("FunctionalDoubleArmWaves")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_functional_double_arm_waves);
        } else if (strName.equals("FunctionalJumpingJacks")) {

            findViewById(R.id.llData).setVisibility(View.GONE);
            imgExercise.setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_functional_jumping_jacks);
        }

        /*SuspensionTraining*/
        else if (strName.equals("SuspensionTrainPushUp")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_suspension_push_up);
        } else if (strName.equals("SuspensionTrainChestPress")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_suspension_chest_press);
        } else if (strName.equals("SuspensionTrainLowRow")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_suspension_low_row);
        } else if (strName.equals("SuspensionTrainSingleArmRow")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_suspension_single_arm);
        } else if (strName.equals("SuspensionTrainBiceps")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setVisibility(View.VISIBLE);
            gifImage.setImageResource(R.drawable.ic_suspension_biceps);
        }

        /* Stretching */
        else if (strName.equals("llBackLegA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_1);
        } else if (strName.equals("llBackLegB")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_2);
        } else if (strName.equals("llBackLegC")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_3);
        } else if (strName.equals("llBackLegD")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_4);
        } else if (strName.equals("llFrontLegA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_5);
        } else if (strName.equals("llBackLegE")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_6);
        } else if (strName.equals("llFrontLegB")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_7);
        } else if (strName.equals("llFrontLegC")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_8);
        } else if (strName.equals("llBackA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_9);
        } else if (strName.equals("llBackB")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_10);
        } else if (strName.equals("llBackC")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_11);
        }/* else if (strName.equals("llFrontLegD")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_12);
        } */ else if (strName.equals("llFrontLegE")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_13);
        } else if (strName.equals("llFrontLegF")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_14);
        } else if (strName.equals("llBicepA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_15);
        } else if (strName.equals("llChestA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_16);
        } else if (strName.equals("llBackD")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_17);
        } else if (strName.equals("llTricepsA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_18);
        } else if (strName.equals("llShoulderA")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_19);
        } else if (strName.equals("llShoulderB")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_20);
        } else if (strName.equals("llShoulderC")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_21);
        } else if (strName.equals("llBackE")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_22);
        } /*else if (strName.equals("llBackF")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_23);
        }*/ else if (strName.equals("llBackG")) {
            findViewById(R.id.llData).setVisibility(View.GONE);
            ((ImageView) findViewById(R.id.imgSuspensionExercise)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_stretch_estiramiento_24);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStart:
                String strMinutes = ((EditText) findViewById(R.id.edtMinutes)).getText().toString();
                if (strMinutes.isEmpty()) {
                    Toast.makeText(mContext, "Please enter minutes", Toast.LENGTH_SHORT).show();
                } else if (strMinutes.equals("0")) {
                    Toast.makeText(mContext, "Please enter minutes", Toast.LENGTH_SHORT).show();
                } else {
                    isTimerStart = true;
                    startTimer();
                }
                break;
            case R.id.btnCancel:
                if (isTimerStart) {
                    cTimer.cancel();
                    tvMinute.setText("00:00");
                    isTimerStart = false;
                }
                break;
            case R.id.imgBack:
                finish();
                break;
        }
    }

    private void startTimer() {
        String strMinutes = ((EditText) findViewById(R.id.edtMinutes)).getText().toString();
        long minutes = 0;
        if (strMinutes.isEmpty() || strMinutes.equals("0")) {
            minutes = 0;
        } else {
            minutes = Long.parseLong(strMinutes);
        }

        minutes = minutes * 60000;
        cTimer = new CountDownTimer(minutes, 1000) {
            public void onTick(long millisUntilFinished) {
                tvMinute.setText((millisUntilFinished / 60000) + ":" + (millisUntilFinished % 60000 / 1000));
            }

            public void onFinish() {
                tvMinute.setText((00));
            }
        };
        cTimer.start();
    }
}