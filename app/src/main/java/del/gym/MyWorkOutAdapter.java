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

class MyWorkOutAdapter extends RecyclerView.Adapter<MyWorkOutAdapter.ViewHolder> {

    List<StretcingModel> myworkoutData;
    private Context ctx;

    public MyWorkOutAdapter(List<StretcingModel> myworkoutData, Context ctx) {
        this.myworkoutData = myworkoutData;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.myworkrclv,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel myworkoutdata1 = myworkoutData.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(myworkoutdata1.getImage1()));
        viewHolder.imgtext.setText(myworkoutdata1.getName());


    }

    @Override
    public int getItemCount() {
        return myworkoutData.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        RelativeLayout myworkoutsOnclick;
        ImageView image,logo;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.my_workout_images);
            imgtext = itemView.findViewById(R.id.my_workout_names);
            myworkoutsOnclick = itemView.findViewById(R.id.myworkoutsOnclick);

            myworkoutsOnclick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (getAdapterPosition()){

                        case 0:
                            Intent intent = new Intent(ctx,MyWorkoutsDay1.class);
                            ctx.startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(ctx,MyWorkoutsDay2.class);
                            ctx.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(ctx,MyWorkoutsDay3.class);
                            ctx.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(ctx,MyWorkoutsDay4.class);
                            ctx.startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(ctx,MyWorkoutsDay5.class);
                            ctx.startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(ctx,MyWorkoutsDay6.class);
                            ctx.startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(ctx,MyWorkoutsDay7.class);
                            ctx.startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(ctx,MyWorkoutsDay6.class);
                            ctx.startActivity(intent7);
                            break;

                    }

                }
            });

        }
    }
}
