package del.gym.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import del.gym.R;
import del.gym.modal.lap_modal.LapTimeModal;

public class LapTimeListAdapter extends RecyclerView.Adapter<LapTimeListAdapter.MyViewHolder> {

    private Context context;
    private List<LapTimeModal> lapList;

    public LapTimeListAdapter(Context context, List<LapTimeModal> lapList) {
        this.context = context;
        this.lapList = lapList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_lap_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tvMinute.setText(lapList.get(position).getMinute());
        holder.tvSeconds.setText(lapList.get(position).getSeconds());
        holder.tvMilliSeconds.setText(lapList.get(position).getMilliseconds());
    }

    @Override
    public int getItemCount() {
        return lapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvMinute, tvSeconds, tvMilliSeconds;

        public MyViewHolder(View view) {
            super(view);
            tvMinute = view.findViewById(R.id.tvMinute);
            tvSeconds = view.findViewById(R.id.tvSeconds);
            tvMilliSeconds = view.findViewById(R.id.tvMilliSeconds);
        }
    }
}
