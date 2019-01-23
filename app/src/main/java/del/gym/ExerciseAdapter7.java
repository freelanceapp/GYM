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

class ExerciseAdapter7 extends RecyclerView.Adapter<ExerciseAdapter7.ViewHolder> {

    private List<StretcingModel> excerciserclv7;
    Context ctx;

    public ExerciseAdapter7(List<StretcingModel> excerciserclv7, Context ctx) {
        this.excerciserclv7 = excerciserclv7;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exercise_rclv7,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel execiseData7= excerciserclv7.get(i);

        final String name = execiseData7.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(execiseData7.getImage1()));
        viewHolder.texttools.setText(execiseData7.getName());
        viewHolder.exerciseonclick7.setOnClickListener(new View.OnClickListener() {
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
        return excerciserclv7.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout exerciseonclick7;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exercise_activity7_images);
            texttools = itemView.findViewById(R.id.exercise_activity7_names);
            exerciseonclick7 = itemView.findViewById(R.id.exercise_onclick7);
        }
    }
}
