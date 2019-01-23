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

import java.util.ArrayList;
import java.util.List;

public class StretchingAdapter extends RecyclerView.Adapter<StretchingAdapter.ViewHolder> {

     List<StretcingModel> stretcingData;
    private Context ctx;

    public StretchingAdapter(List<StretcingModel> stretcingData, Context ctx) {
        this.stretcingData = stretcingData;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.stretchingrcv,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel stretcingModel = stretcingData.get(i);
        viewHolder.image.getDrawingCache();
        final Bitmap imgPath = viewHolder.image.getDrawingCache();

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(stretcingModel.getImage1()));
        viewHolder.imgtext.setText(stretcingModel.getName());

        viewHolder.strechingonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ctx, StretchingActivityAllData.class);
                intent1.putExtra("DRAWABLE_IMAGE", imgPath);
                ctx.startActivity(intent1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return stretcingData.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout strechingonclick;
        ImageView image,logo;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.meditation_image);
            imgtext = itemView.findViewById(R.id.meditation_name);
            logo = itemView.findViewById(R.id.applogo);
            strechingonclick = itemView.findViewById(R.id.stretchingclick);

        }
    }
}
