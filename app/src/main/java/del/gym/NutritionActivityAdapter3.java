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
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class NutritionActivityAdapter3 extends RecyclerView.Adapter<NutritionActivityAdapter3.ViewHolder> {

    List<StretcingModel> nutritionDataA3;
    private View.OnClickListener onClickListener;
    private Context ctx;

    public NutritionActivityAdapter3(List<StretcingModel> nutritionDataA3, Context ctx ,View.OnClickListener onClickListener) {
        this.nutritionDataA3 = nutritionDataA3;
        this.ctx = ctx;
        this.onClickListener = onClickListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.nutrition_rclv3,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        StretcingModel workoutdata1 = nutritionDataA3.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(workoutdata1.getImage1()));
        viewHolder.imgtext.setText(workoutdata1.getName());
        viewHolder.onclickproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,CratinineActivity.class);
                intent.putExtra("StringData", nutritionDataA3.get(i).getName());
                intent.putExtra("StringImg", nutritionDataA3.get(i).getImage1());
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nutritionDataA3.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout onclickproduct;
        ImageView image;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.nutrition_activity3_images1);
            imgtext = itemView.findViewById(R.id.nutrition_activity3_text1);
            onclickproduct = itemView.findViewById(R.id.onclickproduct);
        }
    }
}
