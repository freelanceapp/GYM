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

class NutritionAdapter extends RecyclerView.Adapter<NutritionAdapter.ViewHolder> {

    List<StretcingModel> nutritionData;
    private Context ctx;

    public NutritionAdapter(List<StretcingModel> nutritionData, Context ctx) {
        this.nutritionData = nutritionData;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.nutritionrclv,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel nutritionData1 = nutritionData.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(nutritionData1.getImage1()));
        viewHolder.imgtext.setText(nutritionData1.getName());


    }

    @Override
    public int getItemCount() {
        return nutritionData.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout nutritionOnclick;
        ImageView image,logo;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.nutrition_images);
            imgtext = itemView.findViewById(R.id.nutrition_names);
            nutritionOnclick = itemView.findViewById(R.id.nutritionidOnclick);

            nutritionOnclick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (getAdapterPosition()){

                        case 0:
                            Intent intent = new Intent(ctx,NutritionActivit1.class);
                            ctx.startActivity(intent);
                            break;
                        case 1:
                            Intent intent1 = new Intent(ctx,NutritionActivit2.class);
                            ctx.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(ctx,NutritionActivity3.class);
                            ctx.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(ctx,NutritionActivity4.class);
                            ctx.startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(ctx,Tips.class);
                            ctx.startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(ctx,NutritionActivity6.class);
                            ctx.startActivity(intent5);
                            break;

                    }
                }
            });


        }
    }
}
