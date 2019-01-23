package del.gym;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import del.gym.modal.home_data.ArrayofContentsModel;

public class HomeContentAdapter extends RecyclerView.Adapter<HomeContentAdapter.ViewHolder> {

    private List<ArrayofContentsModel> arraData;
    private Context ctx;

    public HomeContentAdapter(List<ArrayofContentsModel> arraData, Context ctx) {
        this.arraData = arraData;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li = LayoutInflater.from(ctx);
        View view1 = li.inflate(R.layout.row_main_menu, null);
        return new ViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ArrayofContentsModel arrayData1 = arraData.get(i);
        viewHolder.image.setImageDrawable(ctx.getResources().getDrawable(arrayData1.getImage()));
        viewHolder.imgtext.setText(arrayData1.getTitle());
    }

    @Override
    public int getItemCount() {
        return arraData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView next;
        ImageView image;
        TextView imgtext;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.img);
            imgtext = itemView.findViewById(R.id.imgtext);
            next = itemView.findViewById(R.id.nextClikc);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (getAdapterPosition()) {
                        case 0:

                            break;
                        case 1:
                            Intent intent1 = new Intent(ctx, WorkoutActivity.class);
                            ctx.startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(ctx, MyWorkoutActivity.class);
                            ctx.startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(ctx, NutritionActivity.class);
                            ctx.startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(ctx, StretchingActivity.class);
                            ctx.startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(ctx, Tips.class);
                            ctx.startActivity(intent5);
                            break;

                    }
                }
            });
        }
    }
}
