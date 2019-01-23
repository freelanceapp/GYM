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

class ExgymBacklegAdaper extends RecyclerView.Adapter<ExgymBacklegAdaper.ViewHolder> {

    private List<StretcingModel> exgymbacklegData;
    Context ctx;

    public ExgymBacklegAdaper(List<StretcingModel> exgymbacklegData, Context ctx) {
        this.exgymbacklegData = exgymbacklegData;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exgym_backleg_rclv, null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel exgymbacklegdata = exgymbacklegData.get(i);
        final String name = exgymbacklegdata.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(exgymbacklegdata.getImage1()));
        viewHolder.texttools.setText(exgymbacklegdata.getName());
        viewHolder.backleggonclick.setOnClickListener(new View.OnClickListener() {
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
        return exgymbacklegData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout backleggonclick;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exegym_backleg_images);
            texttools = itemView.findViewById(R.id.exegym_backleg_names);
            backleggonclick = itemView.findViewById(R.id.exgym_backlegonclick);


        }
    }

}
