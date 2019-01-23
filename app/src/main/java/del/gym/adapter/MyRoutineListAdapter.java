package del.gym.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import del.gym.R;
import del.gym.modal.MyRoutineModal;

public class MyRoutineListAdapter extends RecyclerView.Adapter<MyRoutineListAdapter.MyViewHolder> {

    private Context context;
    private List<MyRoutineModal> lapList;

    public MyRoutineListAdapter(Context context, List<MyRoutineModal> lapList) {
        this.context = context;
        this.lapList = lapList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_my_routine, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tvExercise.setText(lapList.get(position).getExercise());
        holder.tvWeight.setText(lapList.get(position).getWeight());
    }

    @Override
    public int getItemCount() {
        return lapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvExercise, tvWeight;

        public MyViewHolder(View view) {
            super(view);
            tvExercise = view.findViewById(R.id.tvExercise);
            tvWeight = view.findViewById(R.id.tvWeight);
        }
    }
}
