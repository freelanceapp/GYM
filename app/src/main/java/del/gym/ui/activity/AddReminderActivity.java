package del.gym.ui.activity;

import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import del.gym.R;
import del.gym.modal.reminder_modal.EventModelDB;
import del.gym.utils.AppPreference;
import del.gym.utils.BaseActivity;
import del.gym.utils.TimeAlarm;
import io.realm.Realm;


public class AddReminderActivity extends BaseActivity implements View.OnClickListener {

    private EditText edtEvent, edtDate, edtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;
    private Button btnDone;
    private AlarmManager am;
    private String eventEntered;
    private String timeEntered;
    private String dateEntered;
    private String formattedTime;
    private Long tsCurrent, tsSet;
    private Calendar c1, c2;
    private String ts;
    private String toParse;
    private SimpleDateFormat formatter;
    private Date date;
    private String timeToNotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_reminder);

        init();
    }

    private void init() {
        findViewById(R.id.imgBack).setOnClickListener(this);
        edtEvent = (EditText) findViewById(R.id.event);
        edtTime = (EditText) findViewById(R.id.time);
        edtDate = (EditText) findViewById(R.id.date);
        btnDone = (Button) findViewById(R.id.button);

        edtTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1 = Calendar.getInstance();
                mHour = c1.get(Calendar.HOUR_OF_DAY);
                mMinute = c1.get(Calendar.MINUTE);
                // Launch Time Picker Dialog
                TimePickerDialog timePickerDialog = new TimePickerDialog(mContext, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        timeToNotify = hourOfDay + ":" + minute;
                        formattedTime = FormatTime(hourOfDay, minute);
                        edtTime.setText(formattedTime);
                    }
                }, mHour, mMinute, false);
                timePickerDialog.show();
            }
        });

        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2 = Calendar.getInstance();
                mYear = c2.get(Calendar.YEAR);
                mMonth = c2.get(Calendar.MONTH);
                mDay = c2.get(Calendar.DAY_OF_MONTH);
                // Launch Date Picker Dialog
                DatePickerDialog datePickerDialog = new DatePickerDialog(mContext, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        edtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                    }
                }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Save Entered data to Realm dataabse
                eventEntered = edtEvent.getText().toString();
                timeEntered = edtTime.getText().toString();
                dateEntered = edtDate.getText().toString();

                if (eventEntered.length() > 0 && timeEntered.length() > 0 && dateEntered.length() > 0) {
                    Realm myRealm = Realm.getInstance(getBaseContext());
                    myRealm.beginTransaction();

                    // Create an object
                    EventModelDB eventDetails = myRealm.createObject(EventModelDB.class);

                    // Set its fields
                    eventDetails.setEvent(eventEntered);
                    eventDetails.setTime(timeEntered);
                    eventDetails.setDate(dateEntered);

                    tsCurrent = System.currentTimeMillis();
                    ts = tsCurrent.toString();
                    eventDetails.setTimestamp(ts);

                    myRealm.commitTransaction();

                    // set the alarm
                    am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                    setOneTimeAlarm();

                    Toast.makeText(getBaseContext(), "Reminder Set for new Event", Toast.LENGTH_LONG).show();
                    AppPreference.setBooleanPreference(mContext, "isReminderAdded", true);
                    //startActivity(new Intent(getBaseContext(), ReminderActivity.class));
                    finish();

                } else {
                    Toast.makeText(getBaseContext(), "Fill Up The Input fields", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgBack:
                finish();
                break;
        }
    }

    public void setOneTimeAlarm() {
        Intent intent = new Intent(this, TimeAlarm.class);
        intent.putExtra("event", eventEntered);
        intent.putExtra("time", timeEntered);
        intent.putExtra("date", dateEntered);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
        try {
            toParse = dateEntered + " " + timeToNotify;
            formatter = new SimpleDateFormat("d-M-yyyy hh:mm");
            date = formatter.parse(toParse);
            tsSet = date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        am.set(AlarmManager.RTC_WAKEUP, tsSet, pendingIntent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    edtEvent.setText(text.get(0));
                }
                break;
            }
        }
    }


    public String FormatTime(int hour, int minute) {

        String time;
        time = "";
        String formattedMinute;

        if (minute / 10 == 0) {
            formattedMinute = "0" + minute;
        } else {
            formattedMinute = "" + minute;
        }


        if (hour == 0) {
            time = "12" + ":" + formattedMinute + " AM";
        } else if (hour < 12) {
            time = hour + ":" + formattedMinute + " AM";
        } else if (hour == 12) {
            time = "12" + ":" + formattedMinute + " PM";
        } else {
            int temp = hour - 12;
            time = temp + ":" + formattedMinute + " PM";
        }


        return time;
    }


}
