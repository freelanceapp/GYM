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

public class ExerciseGuideActivityAdapter extends RecyclerView.Adapter<ExerciseGuideActivityAdapter.ViewHolder> {

    List<StretcingModel> exerciseData;
    private Context ctx;

    public ExerciseGuideActivityAdapter(List<StretcingModel> exerciseData, Context ctx) {
        this.exerciseData = exerciseData;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.exerciseactivityrecyler,null);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel exercisedata1 = exerciseData.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(exercisedata1.getImage1()));
        viewHolder.imgtext.setText(exercisedata1.getName());
    }

    @Override
    public int getItemCount() {
        return exerciseData.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image,logo;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.meditation_image);
            imgtext = itemView.findViewById(R.id.meditation_name);
        }
    }
}
