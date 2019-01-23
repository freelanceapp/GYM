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

class WorkActiivty1Adapter3 extends RecyclerView.Adapter<WorkActiivty1Adapter3.ViewHolder> {

    private List<StretcingModel> workoutAdapterActivityD3;
    Context ctx;

    public WorkActiivty1Adapter3(List<StretcingModel> workoutAdapterActivityD3, Context ctx) {
        this.workoutAdapterActivityD3 = workoutAdapterActivityD3;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.work_functional_rclv,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
/*

        StretcingModel workoutAdapteractivityd3= workoutAdapterActivityD3.get(i);
        final String name = workoutAdapteractivityd3.getName();
        final int imgPath = workoutAdapteractivityd3.getImage1();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(workoutAdapteractivityd3.getImage1()));
        viewHolder.texttools.setText(workoutAdapteractivityd3.getName());
        viewHolder.adapterac3onclick3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ctx, ExerciseActivitiesAll6.class);
                intent1.putExtra("DRAWABLE_IMAGE", imgPath);
                intent1.putExtra("NAME_KEY", name);
                ctx.startActivity(intent1);
            }
        });
*/

    }

    @Override
    public int getItemCount() {
        return workoutAdapterActivityD3.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout adapterac3onclick3;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
/*

            imagetools = itemView.findViewById(R.id.exercise_adapter1_activity3_images);
            texttools = itemView.findViewById(R.id.exercise_adapter1_activity3_names);
            adapterac3onclick3 = itemView.findViewById(R.id.adapterac3onclick3);
*/
        }
    }
}
