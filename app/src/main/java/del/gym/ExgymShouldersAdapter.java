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

class ExgymShouldersAdapter extends RecyclerView.Adapter<ExgymShouldersAdapter.ViewHolder> {

    private List<StretcingModel> exgymshouldersData;
    Context ctx;

    public ExgymShouldersAdapter(List<StretcingModel> exgymshouldersData, Context ctx) {
        this.exgymshouldersData = exgymshouldersData;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exgym_shoulders_rclv, null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel exgymshouldersdata = exgymshouldersData.get(i);
        final String name = exgymshouldersdata.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(exgymshouldersdata.getImage1()));
        viewHolder.texttools.setText(exgymshouldersdata.getName());
        viewHolder.exgymshouldersonclick.setOnClickListener(new View.OnClickListener() {
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
        return exgymshouldersData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout exgymshouldersonclick;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exegym_shoulders_images);
            texttools = itemView.findViewById(R.id.exegym_shoulders_names);
            exgymshouldersonclick = itemView.findViewById(R.id.exgym_shouldersonclick);


        }
    }

}
