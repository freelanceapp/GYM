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

class ExerciseAdapter2 extends RecyclerView.Adapter<ExerciseAdapter2.ViewHolder> {

    private List<StretcingModel> exerciseDataA1;
    Context ctx;

    public ExerciseAdapter2(List<StretcingModel> exerciseDataA1, Context ctx) {
        this.exerciseDataA1 = exerciseDataA1;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exercise_rclv2,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel execiseData2= exerciseDataA1.get(i);

        final String name = execiseData2.getName();
        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(execiseData2.getImage1()));
        viewHolder.texttools.setText(execiseData2.getName());
        viewHolder.exerciseonclick2.setOnClickListener(new View.OnClickListener() {
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
        return exerciseDataA1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout exerciseonclick2;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exercise_activity2_images);
            texttools = itemView.findViewById(R.id.exercise_activity2_names);
            exerciseonclick2 = itemView.findViewById(R.id.exercise_onclick2);
        }
    }
}
