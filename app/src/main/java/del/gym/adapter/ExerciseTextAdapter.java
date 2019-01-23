package del.gym.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import del.gym.R;

public class ExerciseTextAdapter extends RecyclerView.Adapter<ExerciseTextAdapter.MyViewHolder> {

    private Context context;
    private List<String> lapList;

    public ExerciseTextAdapter(Context context, List<String> lapList) {
        this.context = context;
        this.lapList = lapList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_exercise_text, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        int pos = position + 1;
        holder.tvNumber.setText(pos + ".");
        holder.tvText.setText(lapList.get(position));
    }

    @Override
    public int getItemCount() {
        return lapList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvNumber, tvText;

        public MyViewHolder(View view) {
            super(view);
            tvNumber = view.findViewById(R.id.tvNumber);
            tvText = view.findViewById(R.id.tvText);
        }
    }
}
