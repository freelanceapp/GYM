package del.gym.ui.activity.home_menu_activities;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import del.gym.R;
import del.gym.adapter.ExerciseTextAdapter;
import del.gym.utils.BaseActivity;
import pl.droidsonroids.gif.GifImageView;

public class ExerciseDetailActivity extends BaseActivity implements View.OnClickListener {

    private String strName = "";
    private GifImageView gifImage;
    private ExerciseTextAdapter exerciseTextAdapter;
    private List<String> stringList = new ArrayList<>();
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
        if (getIntent() == null)
            return;

        tvMinute = (TextView) findViewById(R.id.tvMinute);
        ((ImageView) findViewById(R.id.imgBack)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnStart)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnCancel)).setOnClickListener(this);
        gifImage = (GifImageView) findViewById(R.id.gifImage);
        strName = getIntent().getStringExtra("name");
        stringList.clear();

        if (strName.equals("FlatChestFly")) {
            stringList.add("Lying flat on bench, hold dumbbells directly above chest.");
            stringList.add("Bend elbows slightly and maintain throughout the exercise.");
            stringList.add("Open arms to sides. Elbows should remain 'locked' in a slightly flexed position.");
            stringList.add("When upper arms are parallel to floor, return the weights to the starting position and repeat.");
            gifImage.setImageResource(R.drawable.ic_chest_a);
        } else if (strName.equals("FlatChestPress")) {
            stringList.add("Lying flat on bench, hold the dumbbells directly above chest, arms extended.");
            stringList.add("Lower dumbbells to chest in a controlled manner.");
            stringList.add("Press dumbbells back to starting position and repeat.");
            stringList.add("Repeat the movement with the left hand. This equals one repetition.");
            gifImage.setImageResource(R.drawable.ic_chest_b);
        } else if (strName.equals("InclineChestFly")) {
            stringList.add("Adjust bench to an incline of 30 to 45 degrees.");
            stringList.add("Bend elbows slightly and maintain throughout the exercise.");
            stringList.add("Open arms to sides. Elbows should remain 'locked' in a slightly flexed position.");
            stringList.add("When upper arms are parallel to floor, return the weights to the starting position and repeat.");
            gifImage.setImageResource(R.drawable.ic_chest_c);
        } else if (strName.equals("InclineChestPress")) {
            stringList.add("Adjust bench to an incline of 30 to 45 degrees.");
            stringList.add("Lower dumbbells to chest in a controlled manner.");
            stringList.add("Press dumbbells back to starting position and repeat.");
            stringList.add("Repeat the movement with the left hand. This equals one repetition.");
            stringList.add("Avoid locking elbows.");
            gifImage.setImageResource(R.drawable.ic_chest_d);
        } else if (strName.equals("SingleArmRow")) {
            stringList.add("Stand upright next to bench. Place one knee and hand on bench. Upper body should be parallel to floor.");
            stringList.add("Hold one dumbbell with arm extended.");
            stringList.add("Raise dumbbell up to your midsection keeping back still throughout movement.");
            stringList.add("Slowly lower dumbbell to start position and repeat. After desired number of reps repeat for other arm.");
            gifImage.setImageResource(R.drawable.ic_back_a);
        } else if (strName.equals("FrenchPress")) {
            stringList.add("Lie flat on bench. Hold dumbbells directly above chest with palms facing each other. Dumbbells should be just about touching each other.");
            stringList.add("Keep your shoulders locked and fold your elbows so dumbbells are lowered down to either side of head.");
            stringList.add("Extend arm back to starting position. Repeat for the desired number of reps and switch arms.");
            gifImage.setImageResource(R.drawable.ic_back_b);
        } else if (strName.equals("HammerCurl")) {
            stringList.add("Stand upright with dumbells at sides.");
            stringList.add("Turn palms inward so they face body.");
            stringList.add("Keep elbows close to body and curl weight up by bending elbows.");
            stringList.add("Curl dumbbells up slowly, keeping your elbows close to sides.");
            gifImage.setImageResource(R.drawable.ic_bicep_a);
        } else if (strName.equals("BicepCurl")) {
            stringList.add("Adjust bench to a 45 degree incline.");
            stringList.add("Hold dumbbells at sides. Arms should be fully extended.");
            stringList.add("Keep elbows close to body and curl weight up by bending elbows.");
            stringList.add("Repeat the movement with the left hand. This equals one repetition.");
            gifImage.setImageResource(R.drawable.ic_bicep_b);
        } else if (strName.equals("ConcentrationCurl")) {
            stringList.add("Holding dumbbell, place elbow on inside of thigh, just above knee.");
            stringList.add("Turn palms inward so they face body.");
            stringList.add("Curl dumbbell up towards your face. Do not swing back as you lift the weight.");
            stringList.add("Slowly lower the weight and repeat for desired number of reps before switching arms.");
            gifImage.setImageResource(R.drawable.ic_bicep_c);
        } else if (strName.equals("ShoulderPress")) {
            stringList.add("Sit upright on bench with dumbbells over head. Make sure back is flat.");
            stringList.add("Lower dumbbells slowly to shoulders.");
            stringList.add("When arms are at 90 degrees, press the dumbbells back up and repeat.");
            gifImage.setImageResource(R.drawable.ic_shoulder_a);
        } else if (strName.equals("LateralRaise")) {
            stringList.add("Stand upright, knees slightly bent, shoulder width apart, holding dumbbells at sides.");
            stringList.add("Bend elbows slightly and raise the dumbbells out to sides. Keep elbows slightly bent throughout.");
            stringList.add("When arms are parallel to floor, slowly lower back and repeat.");
            gifImage.setImageResource(R.drawable.ic_shoulder_b);
        } else if (strName.equals("ReverseFly")) {
            stringList.add("Stand upright, knees slightly bent, shoulder width apart, holding dumbbells at sides.");
            stringList.add("Bend elbows slightly and raise the dumbbells out to sides. Keep elbows slightly bent throughout.");
            stringList.add("When arms are parallel to floor, slowly lower back and repeat.");
            gifImage.setImageResource(R.drawable.ic_shoulder_c);
        } else if (strName.equals("FrontRaise")) {
            stringList.add("Stand upright, knees slightly bent, shoulder width apart. Palms should be towards thighs.");
            stringList.add("Raise one dumbbell directly in front of you.");
            stringList.add("When arm is parallel to ground lower dumbbell slowly back. Repeat with the other arm.");
            gifImage.setImageResource(R.drawable.ic_shoulder_d);
        } else if (strName.equals("TricepsExtension")) {
            stringList.add("Stand upright, feet shoulder width apart.");
            stringList.add("Hold dumbbell directly above head with arm fully extended. Clasp elbow with free hand for support.");
            stringList.add("Slowly fold elbow so dumbbell is lowered behind head.");
            stringList.add("Extend arm back to starting position. Repeat for the desired number of reps and switch arms.");
            gifImage.setImageResource(R.drawable.ic_tricep_a);
        } else if (strName.equals("TricepFrenchPress")) {
            stringList.add("Lie flat on bench. Hold dumbbells directly above chest with palms facing each other. Dumbbells should be just about touching each other.");
            stringList.add("Keep your shoulders locked and fold your elbows so dumbbells are lowered down to either side of head.");
            stringList.add("Extend arm back to starting position. Repeat for the desired number of reps and switch arms.");
            gifImage.setImageResource(R.drawable.ic_tricep_b);
        } else if (strName.equals("TricepsKickback")) {
            stringList.add("Stand upright next to bench. Place one arm and leg on bench. Upper body should be parallel to ground.");
            stringList.add("Hold dumbbell and raise elbow so upper arm is parallel to ground. Elbow should be bent at right angles.");
            stringList.add("Extend elbow so entire arm is parallel to ground.");
            stringList.add("Slowly return to start position and repeat for desired number of reps before changing arms.");
            gifImage.setImageResource(R.drawable.ic_tricep_c);
        } else if (strName.equals("HalfSquats")) {
            stringList.add("Holding dumbbells at sides, stand upright with your feet shoulder width apart.");
            stringList.add("Bend from knees until thighs are almost parallel to the ground (avoid letting knees turn inwards).");
            stringList.add("Keep back flat, lower back slightly arched inwards and head up.");
            stringList.add("Return to upright position and repeat.");
            gifImage.setImageResource(R.drawable.ic_leg_a);
        } else if (strName.equals("DumbellLunges")) {
            stringList.add("Holding dumbbells at sides, stand upright with feet slightly less than shoulder width apart.");
            stringList.add("Step forward about 2 feet with one foot and bend knee to about 90 degrees. As you plant your foot bend trailing knee so it nearly touches floor.");
            stringList.add("Push off with front foot to return to starting position.");
            stringList.add("Repeat for the desired number of reps and change legs.");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        }

        /* Bodyweight */
        else if (strName.equals("Squats")) {
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            stringList.clear();
            gifImage.setImageResource(R.drawable.ic_bw_benchdip);
        } else if (strName.equals("Crunch")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_boxjump);
        } else if (strName.equals("PullUps")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_jump);
        } else if (strName.equals("ClapPushups")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_plank);
        } else if (strName.equals("Handstand")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_bw_pushup);
        }

        /*Battlerope*/
        else if (strName.equals("AlternatingWaves")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("DoubleArmWaves")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("DoubleArmSlam")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("DoubleArmSlamJump")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        } else if (strName.equals("Snakes")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_leg_b);
        }

        /*Box*/
        else if (strName.equals("StepUpJumps")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_a));
            gifImage.setImageResource(R.drawable.ic_box_hurdel_jump);
        } else if (strName.equals("SingleLegJumps")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_b));
            gifImage.setImageResource(R.drawable.ic_box_jump);
        } else if (strName.equals("LateralJumps")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_c));
            gifImage.setImageResource(R.drawable.ic_box_lateral_jump);
        } else if (strName.equals("DepthJumps")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_d));
            gifImage.setImageResource(R.drawable.ic_box_depth_jump);
        } else if (strName.equals("StepUps")) {
            stringList.clear();
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText(getString(R.string.box_string_e));
            gifImage.setImageResource(R.drawable.ic_box_lateral_push_off);
        }

        /*Suspension*/
        else if (strName.equals("SuspensionSquat")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_biseps);
        } else if (strName.equals("SuspensionChestPress")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_crossing_balance);
        } else if (strName.equals("SuspensionTricepsPress")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_hamstring_curl);
            gifImage.setImageResource(R.drawable.ic_suspension_hamstring_curl);
        } else if (strName.equals("SuspensionPowerPull")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_legs);
        } else if (strName.equals("SuspensionLunge")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setText("");
            gifImage.setImageResource(R.drawable.ic_suspension_pendulum);
        }


        /*Cardio*/
        else if (strName.equals("CardioClamshell")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_clamshell);
        } else if (strName.equals("CardioFireHydrant")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_fire_hydrant);
        } else if (strName.equals("CardioSideKick")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_side_kick);
        } else if (strName.equals("CardioSidePlankHip")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_side_plank_hip);
        } else if (strName.equals("CardioStandingOpenGate")) {
            stringList.clear();
            ((LinearLayout) findViewById(R.id.llData)).setVisibility(View.GONE);
            ((RecyclerView) findViewById(R.id.recyclerViewData)).setVisibility(View.GONE);
            ((TextView) findViewById(R.id.tvExerciseDetail)).setVisibility(View.GONE);
            gifImage.setImageResource(R.drawable.ic_cardio_standing_open_gate);
        }

        setExerciseData();
    }

    private void setExerciseData() {
        RecyclerView recyclerViewData = (RecyclerView) findViewById(R.id.recyclerViewData);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewData.setLayoutManager(mLayoutManager);
        recyclerViewData.setItemAnimator(new DefaultItemAnimator());
        recyclerViewData.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        exerciseTextAdapter = new ExerciseTextAdapter(mContext, stringList);
        recyclerViewData.setAdapter(exerciseTextAdapter);
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
