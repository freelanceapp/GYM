package del.gym;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

class ExerciseAdapter6 extends RecyclerView.Adapter<ExerciseAdapter6.ViewHolder> {

    private List<StretcingModel> exerciseDataA6;
    Context ctx;

    public ExerciseAdapter6(List<StretcingModel> exerciseDataA6, Context ctx) {
        this.exerciseDataA6 = exerciseDataA6;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exercise_rclv6,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel execiseData6= exerciseDataA6.get(i);

        final String name = execiseData6.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(execiseData6.getImage1()));
        viewHolder.texttools.setText(execiseData6.getName());
        viewHolder.exerciseonclick6.setOnClickListener(new View.OnClickListener() {
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
        return exerciseDataA6.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout exerciseonclick6;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exercise_activity6_images);
            texttools = itemView.findViewById(R.id.exercise_activity6_names);
            exerciseonclick6 = itemView.findViewById(R.id.exercise_onclick6);
        }
    }
}
