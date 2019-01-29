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

class NutritionActivityAdapter1 extends RecyclerView.Adapter<NutritionActivityAdapter1.ViewHolder> {

   private List<StretcingModel> nutritionDataA1;
    private Context ctx;

    public NutritionActivityAdapter1(List<StretcingModel> nutritionDataA1,Context ctx) {
        this.nutritionDataA1 = nutritionDataA1;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1  = li.inflate(R.layout.nutrition_rclv1,null);
        return new ViewHolder(view1);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        final StretcingModel nutritionData1 = nutritionDataA1.get(i);

        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(nutritionData1.getImage1()));
        viewHolder.textView1.setText(nutritionData1.getName());
        viewHolder.dietOnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx, NutDietA1.class);
                intent.putExtra("Calories", nutritionData1.getName());
                ctx.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return nutritionDataA1.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout dietOnclick;
        ImageView image,logo;
        TextView textView1,textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.nutrition_activity1_images);
            textView1 = itemView.findViewById(R.id.nutrition_activity1_text1);
            textView2 = itemView.findViewById(R.id.nutrition_activity1_tex2);
            dietOnclick = itemView.findViewById(R.id.dietOnclick1);


                   /*     case 1:
                            Intent intent1 = new Intent(ctx,NutDietA2.class);
                            ctx.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(ctx,NutDietA3.class);
                            ctx.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(ctx,NutDietA4.class);
                            ctx.startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(ctx,NutDietA5.class);
                            ctx.startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(ctx,NutDietA16.class);
                            ctx.startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(ctx,NutDietA7.class);
                            ctx.startActivity(intent6);
                            break;

                    }
                }
            });
*/


        }
    }
}
