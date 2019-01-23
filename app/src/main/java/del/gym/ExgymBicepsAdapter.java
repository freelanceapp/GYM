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

class ExgymBicepsAdapter extends RecyclerView.Adapter<ExgymBicepsAdapter.ViewHolder> {

    private List<StretcingModel> exgymbicepsData;
    Context ctx;

    public ExgymBicepsAdapter(List<StretcingModel> exgymbicepsData, Context ctx) {
        this.exgymbicepsData = exgymbicepsData;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exgym_biceps_rclv, null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel exgymbicepsdata = exgymbicepsData.get(i);
        final String name = exgymbicepsdata.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(exgymbicepsdata.getImage1()));
        viewHolder.texttools.setText(exgymbicepsdata.getName());
        viewHolder.exgymbicepsonclick.setOnClickListener(new View.OnClickListener() {
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
        return exgymbicepsData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout exgymbicepsonclick;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exegym_biceps_images);
            texttools = itemView.findViewById(R.id.exegym_biceps_names);
            exgymbicepsonclick = itemView.findViewById(R.id.exgym_bicepsonclick);


        }
    }

}
