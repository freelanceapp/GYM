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

class BegginerFragmentAdapter extends RecyclerView.Adapter<BegginerFragmentAdapter.ViewHolder> {
    private List<StretcingModel> begginerfragmentList;
    private Context context;

    public BegginerFragmentAdapter(List<StretcingModel> begginerfragmentList, Context context) {
        this.begginerfragmentList = begginerfragmentList;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.begginer_data_rclv, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        StretcingModel begginerfragmentlist = begginerfragmentList.get(i);
        final String name = begginerfragmentlist.getName();
        viewHolder.begginerdatarclv_names.getDrawingCache();
        final Bitmap imgPath = viewHolder.begginerdatarclv_image.getDrawingCache();


        viewHolder.begginerdatarclv_image.setImageDrawable(context.getResources().getDrawable(begginerfragmentlist.getImage1()));
        viewHolder.begginerdatarclv_names.setText(begginerfragmentlist.getName());
        viewHolder.begginerdataonclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context, ExerciseActivitiesAll6.class);
                intent1.putExtra("DRAWABLE_IMAGE", imgPath);
                intent1.putExtra("NAME_KEY", name);
                context.startActivity(intent1);
            }
        });

    }

    @Override
    public int getItemCount() {
        return begginerfragmentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout begginerdataonclick;
        ImageView begginerdatarclv_image;
        TextView begginerdatarclv_names;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            begginerdatarclv_image = itemView.findViewById(R.id.begginerdatarclv_image);
            begginerdatarclv_names = itemView.findViewById(R.id.begginerdatarclv_names);
            begginerdataonclick = itemView.findViewById(R.id.begginerdataonclick);
        }
    }
}
