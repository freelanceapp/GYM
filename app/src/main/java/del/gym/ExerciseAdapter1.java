package del.gym;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class ExerciseAdapter1 extends RecyclerView.Adapter<ExerciseAdapter1.ViewHolder> {
    private View.OnClickListener onClickListener;
    private List<StretcingModel> exerciseData1;
    Context ctx;

    public ExerciseAdapter1(List<StretcingModel> exerciseData1, Context ctx,View.OnClickListener onClickListener) {
        this.exerciseData1 = exerciseData1;
        this.ctx = ctx;
        this.onClickListener = onClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.exercise_avtivity1_rclv,null);
        return new ViewHolder(viewt);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel execiseData1= exerciseData1.get(i);

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(execiseData1.getImage1()));
        viewHolder.texttools.setText(execiseData1.getName());
        viewHolder.exerciseactivity1.setTag(i);
        viewHolder.exerciseactivity1.setOnClickListener(onClickListener) ;

        viewHolder.exerciseactivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 switch (i){
                     case 0:
                     Intent intent1 = new Intent(ctx,ExgymChestActivity.class);
                     ctx.startActivity(intent1);
                     break;
                     case 1:
                         Intent intent2 = new Intent(ctx,ExgymabdomenActivity.class);
                         ctx.startActivity(intent2);
                         break;
                     case 2:
                         Intent intent3 = new Intent(ctx,ExgymBackActivity.class);
                         ctx.startActivity(intent3);
                         break;
                     case 3:
                         Intent intent4 = new Intent(ctx,ExgymShouldersActivity.class);
                         ctx.startActivity(intent4);
                         break;
                     case 4:
                         Intent intent5 = new Intent(ctx,ExgymFrontLegActiviy.class);
                         ctx.startActivity(intent5);
                         break;
                     case 5:
                         Intent intent6 = new Intent(ctx,ExgymTricepsActivity.class);
                         ctx.startActivity(intent6);
                         break;
                     case 6:
                         Intent intent7 = new Intent(ctx,ExgymBacklegActivty.class);
                         ctx.startActivity(intent7);
                         break;
                     case 7:
                         Intent intent8 = new Intent(ctx,ExgymBicepsActivitity.class);
                         ctx.startActivity(intent8);
                         break;
                     case 8:
                         Intent intent9 = new Intent(ctx,ExgymButtoocksActivity.class);
                         ctx.startActivity(intent9);
                         break;
                     case 9:
                         Intent intent10 = new Intent(ctx,ExgymForearmActivity.class);
                         ctx.startActivity(intent10);
                         break;
                 }
            }
        });

    }

    @Override
    public int getItemCount() {
        return exerciseData1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout exerciseactivity1;
        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.exercise_activity1_images);
            texttools = itemView.findViewById(R.id.exercise_activity1_names);
            exerciseactivity1 = itemView.findViewById(R.id.exerciseactivity1);



        }
    }
}
