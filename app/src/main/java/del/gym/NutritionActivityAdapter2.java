package del.gym;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

class NutritionActivityAdapter2 extends RecyclerView.Adapter<NutritionActivityAdapter2.ViewHolder> {

    private List<NutritionModel2> nutritionDataA2;
    private Context ctx;

    public NutritionActivityAdapter2(List<NutritionModel2> nutritionDataA2,Context ctx) {
        this.nutritionDataA2 = nutritionDataA2;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.nutrition_rclv2,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        NutritionModel2 nutritionData2 = nutritionDataA2.get(i);

        viewHolder.textView1.setText(nutritionData2.getText1());

    }

    @Override
    public int getItemCount() {
        return nutritionDataA2.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout nutritionOnclick;
        ImageView image,image2,logo;
        TextView textView1,textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.nutrition_activity2_images1);
            image2 = itemView.findViewById(R.id.nutrition_activity2_images2);
            textView1 = itemView.findViewById(R.id.nutrition_activity2_text1);
            textView2 = itemView.findViewById(R.id.nutrition_activity2_tex2);
            /**    nutritionOnclick = itemView.findViewById(R.id.nutritionOnclick);

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
            Intent intent4 = new Intent(ctx,NutritionActivity5.class);
            ctx.startActivity(intent4);
            break;
            case 5:
            Intent intent5 = new Intent(ctx,NutritionActivity6.class);
            ctx.startActivity(intent5);
            break;

            }
            }
            });
             */

        }
    }
}
