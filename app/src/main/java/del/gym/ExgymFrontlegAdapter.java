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

class ExgymFrontlegAdapter extends RecyclerView.Adapter<ExgymFrontlegAdapter.ViewHolder> {

    private List<StretcingModel> exgymfrontlegData;
    Context ctx;

    public ExgymFrontlegAdapter(List<StretcingModel> exgymfrontlegData, Context ctx) {
        this.exgymfrontlegData = exgymfrontlegData;
        this.ctx = ctx;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exgym_frontleg_rclv, null);
        return new ViewHolder(viewt);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel exgymfrontlegata = exgymfrontlegData.get(i);
        final String name = exgymfrontlegata.getName();

        viewHolder.imagetools.getDrawingCache();
        final Bitmap imgPath = viewHolder.imagetools.getDrawingCache();

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(exgymfrontlegata.getImage1()));
        viewHolder.texttools.setText(exgymfrontlegata.getName());
        viewHolder.exgymfronglegonclick.setOnClickListener(new View.OnClickListener() {
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
        return exgymfrontlegData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout exgymfronglegonclick;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exegym_frongleg_images);
            texttools = itemView.findViewById(R.id.exegym_frongleg_names);
            exgymfronglegonclick = itemView.findViewById(R.id.exgym_frontlegonclick);


        }
    }

}
