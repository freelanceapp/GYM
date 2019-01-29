package del.gym.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import del.gym.R;
import del.gym.adapter.ListingsAdapter;
import del.gym.modal.reminder_modal.EventModelDB;
import del.gym.modal.reminder_modal.ListingsModel;
import del.gym.utils.AppPreference;
import del.gym.utils.BaseActivity;
import io.realm.Realm;
import io.realm.RealmResults;

public class ReminderActivity extends BaseActivity implements View.OnClickListener {

    private ArrayList<ListingsModel> list;
    private RecyclerView rvListings;
    private ListingsAdapter adapter;
    private ListingsModel model;
    private LinearLayoutManager mLayoutManager;
    private Realm myRealm;
    private RealmResults<EventModelDB> results1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        init();
    }

    private void init() {
        (findViewById(R.id.fabAddReminder)).setOnClickListener(this);
        findViewById(R.id.imgBack).setOnClickListener(this);
        rvListings = (RecyclerView) findViewById(R.id.events);

        setReminderList();
    }

    private void setReminderList() {
        list = new ArrayList<ListingsModel>();
        list.clear();
        myRealm = Realm.getInstance(getBaseContext());
        results1 = myRealm.where(EventModelDB.class).findAll();

        for (int i = results1.size() - 1; i >= 0; i--) {
            EventModelDB c = results1.get(i);
            model = new ListingsModel();
            model.setEvent(c.getEvent());
            model.setTime(c.getTime());
            model.setDate(c.getDate());
            model.setTimestamp(c.getTimestamp());
            list.add(model);
        }

        adapter = new ListingsAdapter(list, getBaseContext());
        rvListings.setAdapter(adapter);
        mLayoutManager = new LinearLayoutManager(this);
        rvListings.setLayoutManager(mLayoutManager);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fabAddReminder:
                startActivity(new Intent(getBaseContext(), AddReminderActivity.class));
                break;
            case R.id.imgBack:
                finish();
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (AppPreference.getBooleanPreference(mContext, "isReminderAdded")) {
            setReminderList();
            AppPreference.setBooleanPreference(mContext, "isReminderAdded", false);
        }
    }
}
