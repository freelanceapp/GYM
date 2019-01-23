package del.gym;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class WorkOutActivityAdapter extends RecyclerView.Adapter<WorkOutActivityAdapter.ViewHolder> {


    private List<StretcingModel> workoutData;
    private Context ctx;
    private View.OnClickListener onClickListener;

    public WorkOutActivityAdapter(List<StretcingModel> workoutData, Context ctx, View.OnClickListener onClickListener) {
        this.workoutData = workoutData;
        this.ctx = ctx;
        this.onClickListener = onClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1 = li.inflate(R.layout.workrclv, null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        StretcingModel workoutdata = workoutData.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(workoutdata.getImage1()));
        viewHolder.imgtext.setText(workoutdata.getName());

        viewHolder.onclickWorkOutrclv.setTag(i);
        viewHolder.onclickWorkOutrclv.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return workoutData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView onclickWorkOutrclv;
        ImageView image, logo;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.workouts_images);
            imgtext = itemView.findViewById(R.id.workouts_names);
            onclickWorkOutrclv = itemView.findViewById(R.id.onclickWorkOut);
        }
    }
}
