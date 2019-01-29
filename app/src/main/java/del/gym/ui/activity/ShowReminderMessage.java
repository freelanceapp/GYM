package del.gym.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import del.gym.R;

/**
 * Created by asu on 20-Aug-16.
 */
public class ShowReminderMessage extends AppCompatActivity {

    private TextView txvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_msg);

        txvMsg = (TextView) findViewById(R.id.reminder_msg);

        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("ReminderMsg");
        txvMsg.setText(msg);

    }
}
