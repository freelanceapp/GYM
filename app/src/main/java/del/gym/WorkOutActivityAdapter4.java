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

import java.util.List;

class WorkOutActivityAdapter4 extends RecyclerView.Adapter<WorkOutActivityAdapter4.ViewHolder> {

   private List<StretcingModel> functinaltrainingList;
    private Context context;

    public WorkOutActivityAdapter4(List<StretcingModel> functinaltrainingList, Context context) {
        this.functinaltrainingList = functinaltrainingList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.bigginer_rclv_layout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        StretcingModel functinaltraininglist = functinaltrainingList.get(i);
        viewHolder.images.setImageDrawable(context.getResources().getDrawable(functinaltraininglist.getImage1()));
        viewHolder.name.setText(functinaltraininglist.getName());
    }

    @Override
    public int getItemCount() {
        return functinaltrainingList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout functionallistonclick;
        ImageView images;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            images = itemView.findViewById(R.id.bigginer_images);
            name = itemView.findViewById(R.id.bigginer_names);
            functionallistonclick = itemView.findViewById(R.id.biginnerrclvonclick);

        /*
            functionallistonclick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()){

                        case 0:
                            Intent intent = new Intent(context,WorkFunFullBodyActiivty.class);
                            context.startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(context,WorkFunPushPullActivity.class);
                            context.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(context,WorkFatBurnerActivity.class);
                            context.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(context,NutritionActivity6.class);
                            context.startActivity(intent3);
                            break;
                    }

                }
            });
*/

        }
    }
}
