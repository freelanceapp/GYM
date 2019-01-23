package del.gym;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class StretchingActivityAllData extends AppCompatActivity {

    ImageView  imagechanged;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching_all_data);

        imagechanged = findViewById(R.id.st_image_chng);

        Intent intent = getIntent();
        Bitmap image = (Bitmap) intent.getParcelableExtra("DRAWABLE_IMAGE");
        imagechanged.setImageBitmap(image);
    }
}
