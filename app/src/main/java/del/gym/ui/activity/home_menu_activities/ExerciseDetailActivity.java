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
                    startTimer();
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

    private void cancelTimer() {
        if (cTimer != null)
            cTimer.cancel();
    }

}
