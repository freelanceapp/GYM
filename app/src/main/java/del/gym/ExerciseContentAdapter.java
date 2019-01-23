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

class ExerciseContentAdapter extends RecyclerView.Adapter<ExerciseContentAdapter.ViewHolder> {

    private List<StretcingModel> exercisecontents;
    Context ctx;

    public ExerciseContentAdapter(List<StretcingModel> exercisecontents, Context ctx) {
        this.exercisecontents = exercisecontents;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exercise_content_layout,null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel exercisecontent= exercisecontents.get(i);

        final String name = exercisecontent.getName();
        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(exercisecontent.getImage1()));
        viewHolder.texttools.setText(exercisecontent.getName());
        viewHolder.contentsonclick.setOnClickListener(new View.OnClickListener() {
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
        return exercisecontents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout contentsonclick;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.contents_image);
            texttools = itemView.findViewById(R.id.contents_image);
            contentsonclick = itemView.findViewById(R.id.contentsonclick);
        }
    }
}
