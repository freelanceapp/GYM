package del.gym.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
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
    private View.OnClickListener onClickListener;

    public MyRoutineListAdapter(Context context, List<MyRoutineModal> lapList, View.OnClickListener onClickListener) {
        this.context = context;
        this.lapList = lapList;
        this.onClickListener = onClickListener;
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
        holder.tvDays.setText(lapList.get(position).getDays());

        holder.cardviewMyRoutine.setTag(position);
        holder.cardviewMyRoutine.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return lapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvExercise, tvWeight, tvDays;
        private CardView cardviewMyRoutine;

        public MyViewHolder(View view) {
            super(view);
            cardviewMyRoutine = view.findViewById(R.id.cardviewMyRoutine);
            tvExercise = view.findViewById(R.id.tvExercise);
            tvWeight = view.findViewById(R.id.tvWeight);
            tvDays = view.findViewById(R.id.tvDays);
        }
    }
}
