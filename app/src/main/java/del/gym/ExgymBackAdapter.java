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

class ExgymBackAdapter extends RecyclerView.Adapter<ExgymBackAdapter.ViewHolder> {

    private List<StretcingModel> exgymbackData;
    Context ctx;

    public ExgymBackAdapter(List<StretcingModel> exgymbackData, Context ctx) {
        this.exgymbackData = exgymbackData;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exgym_back_rclv, null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel exgymbackdata = exgymbackData.get(i);
        final String name = exgymbackdata.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(exgymbackdata.getImage1()));
        viewHolder.texttools.setText(exgymbackdata.getName());
        viewHolder.exgymbackonclick.setOnClickListener(new View.OnClickListener() {
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
        return exgymbackData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout exgymbackonclick;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exegym_back_images);
            texttools = itemView.findViewById(R.id.exegym_back_names);
            exgymbackonclick = itemView.findViewById(R.id.exgym_backonclick);
            
        }
    }

}
