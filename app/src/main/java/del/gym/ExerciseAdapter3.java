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

class ExerciseAdapter3 extends RecyclerView.Adapter<ExerciseAdapter3.ViewHolder> {

    private List<StretcingModel> exerciseDataA3;
    Context ctx;

    public ExerciseAdapter3(List<StretcingModel> exerciseDataA3, Context ctx) {
        this.exerciseDataA3 = exerciseDataA3;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exercise_rclv3,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel execiseData3= exerciseDataA3.get(i);
        final String name = execiseData3.getName();
        final int imgPath = execiseData3.getImage1();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(execiseData3.getImage1()));
        viewHolder.texttools.setText(execiseData3.getName());
        viewHolder.exerciseonclick3.setOnClickListener(new View.OnClickListener() {
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
        return exerciseDataA3.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout exerciseonclick3;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exercise_activity3_images);
            texttools = itemView.findViewById(R.id.exercise_activity3_text);
            exerciseonclick3 = itemView.findViewById(R.id.exercise_onclick3);
        }
    }
}
