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

class WorkOutActivityAdapter5 extends RecyclerView.Adapter<WorkOutActivityAdapter5.ViewHolder> {

    List<StretcingModel> workoutDataA5;
    private Context ctx;

    public WorkOutActivityAdapter5(List<StretcingModel> workoutDataA5, Context ctx) {
        this.workoutDataA5 = workoutDataA5;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.worout_activity_rclv5,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel workoutdata5 = workoutDataA5.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(workoutdata5.getImage1()));
        viewHolder.imgtext.setText(workoutdata5.getName());


    }

    @Override
    public int getItemCount() {
        return workoutDataA5.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout workac5onclick5;
        ImageView image;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.workout_activity5_images);
            imgtext = itemView.findViewById(R.id.workout_activity5_names);
            workac5onclick5 = itemView.findViewById(R.id.workac5onclick5);
            workac5onclick5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()){

                        case 0:
                            Intent intent = new Intent(ctx,WorkSusFullBodyActiivty.class);
                            ctx.startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(ctx,WorkSusPushPullActivity.class);
                            ctx.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(ctx,WorkFatBurnerActivity.class);
                            ctx.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(ctx,NutritionActivity6.class);
                            ctx.startActivity(intent3);
                            break;
                    }

                }
            });

        }
    }
}
