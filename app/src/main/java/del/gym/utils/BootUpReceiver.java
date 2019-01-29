package del.gym.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import del.gym.ui.activity.ReminderActivity;

/**
 * Created by asu on 21-Aug-16.
 */
public class BootUpReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, ReminderActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }

}
