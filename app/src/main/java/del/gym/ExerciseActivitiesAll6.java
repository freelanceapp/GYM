package del.gym;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ExerciseActivitiesAll6 extends AppCompatActivity {

    ImageView changeimage;
    TextView changename, changedescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_activities_all6);

        changeimage = findViewById(R.id.ex_change_img);
        changename = findViewById(R.id.ex_change_name);
        changedescription = findViewById(R.id.ex_change_description);

        Intent intent = getIntent();

        Bundle image = getIntent().getExtras();
        if (image != null){
            int image1 = image.getInt("DRAWABLE_IMAGE");
            changeimage.setImageResource(image1);
        }
        String name = intent.getStringExtra("NAME_KEY");
        changename.setText(name);


    }
}
