package del.gym.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import del.gym.R;
import del.gym.modal.reminder_modal.EventModelDB;
import del.gym.modal.reminder_modal.ListingsModel;
import del.gym.utils.Alerts;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by asu on 15-Aug-16.
 */
public class ListingsAdapter extends RecyclerView.Adapter<ListingsAdapter.Viewholder> {

    private ArrayList<ListingsModel> data;
    private ListingsModel model;
    private Context context;

    public ListingsAdapter(ArrayList<ListingsModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public static class Viewholder extends RecyclerView.ViewHolder {

        private TextView eventText, timeAndDateText;
        private LinearLayout toplayout;

        public Viewholder(View itemView) {
            super(itemView);

            eventText = (TextView) itemView.findViewById(R.id.event);
            timeAndDateText = (TextView) itemView.findViewById(R.id.time_and_date);
            toplayout = (LinearLayout) itemView.findViewById(R.id.toplayout);
        }
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listings_row, parent, false);

        return new Viewholder(itemView);
    }

    @Override
    public void onBindViewHolder(final Viewholder holder, final int position) {

        model = data.get(position);

        holder.eventText.setText(model.getEvent());
        holder.timeAndDateText.setText("At  " + model.getTime() + "  On  " + model.getDate());

        holder.toplayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alerts.show(context, "Long press to delete");
            }
        });
        // long click an item to delete it from database
        holder.toplayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Realm realm = Realm.getInstance(context);
                RealmResults<EventModelDB> result = realm.where(EventModelDB.class)
                        .equalTo("timestamp", data.get(position).getTimestamp())
                        .findAll();

                if (result != null) {
                    if (result.size() > 0) {
                        realm.beginTransaction();
                        result.remove(0);
                        realm.commitTransaction();
                    }
                }
                data.remove(position);
                notifyDataSetChanged();
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
