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

import java.util.List;

class WorkActiivty1Adapter2 extends RecyclerView.Adapter<WorkActiivty1Adapter2.ViewHolder> {

    private List<StretcingModel> workoutAdapterActivityD2;
    Context ctx;

    public WorkActiivty1Adapter2(List<StretcingModel> workoutAdapterActivityD2, Context ctx) {
        this.workoutAdapterActivityD2 = workoutAdapterActivityD2;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.work_rclv_pushpull1,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel workoutAdapterActivityd2= workoutAdapterActivityD2.get(i);
        final String name = workoutAdapterActivityd2.getName();
        final int imgPath = workoutAdapterActivityd2.getImage1();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(workoutAdapterActivityd2.getImage1()));
        viewHolder.texttools.setText(workoutAdapterActivityd2.getName());
        viewHolder.adapterac2onclick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ctx, ExerciseActivitiesAll6.class);
                intent1.putExtra("DRAWABLE_IMAGE", imgPath);
                intent1.putExtra("NAME_KEY", name);
                ctx.startActivity(intent1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return workoutAdapterActivityD2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout adapterac2onclick2;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exercise_adapter1_activity2_images);
            texttools = itemView.findViewById(R.id.exercise_adapter1_activity2_names);
            adapterac2onclick2 = itemView.findViewById(R.id.adapterac2onclick2);
        }
    }
}