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

class WorkOutActivityAdapter2 extends RecyclerView.Adapter<WorkOutActivityAdapter2.ViewHolder> {

    private List<StretcingModel> workoutDataA2;
    private Context ctx;

    public WorkOutActivityAdapter2(List<StretcingModel> workoutDataA2, Context ctx) {
        this.workoutDataA2 = workoutDataA2;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.workout_activity_rclv2,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        StretcingModel workoutDataa2 = workoutDataA2.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(workoutDataa2.getImage1()));
        viewHolder.imgtext.setText(workoutDataa2.getName());
    }

    @Override
    public int getItemCount() {
        return workoutDataA2.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
      RelativeLayout workhomeonclick1;
        ImageView image;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.workout_activity2_images);
            imgtext = itemView.findViewById(R.id.workout_activity2_names);
            workhomeonclick1 = itemView.findViewById(R.id.work_home_onclick1);
            workhomeonclick1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()){

                        case 0:
                            Intent intent = new Intent(ctx,WorkEightMinutesActivity1.class);
                            ctx.startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(ctx,WorkFifteenMinutesActiivty.class);
                            ctx.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(ctx,WorkTwoFiveMinutesActivity.class);
                            ctx.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(ctx,ExerciseActivity1.class);
                            ctx.startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(ctx,NutritionActivity6.class);
                            ctx.startActivity(intent4);
                            break;

                    }

                }
            });

        }
    }
}
