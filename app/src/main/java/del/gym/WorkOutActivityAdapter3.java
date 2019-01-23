package del.gym;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class WorkOutActivityAdapter3 extends RecyclerView.Adapter<WorkOutActivityAdapter3.ViewHolder> {

    List<StretcingModel> workoutDataA3;
    private Context ctx;

    public WorkOutActivityAdapter3(List<StretcingModel> workoutDataA3, Context ctx) {
        this.workoutDataA3 = workoutDataA3;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.workout_activity_rclv3,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel workoutdata3 = workoutDataA3.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(workoutdata3.getImage1()));
        viewHolder.imgtext.setText(workoutdata3.getName());


    }

    @Override
    public int getItemCount() {
        return workoutDataA3.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.workout_activity3_images);
            imgtext = itemView.findViewById(R.id.workout_activity3_names);
           

        }
    }
}
