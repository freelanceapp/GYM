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

import del.gym.modal.home_data.ArrayofContentsModel;

class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ViewHolder> {
    List<ArrayofContentsModel> tipsData;
    Context context;

    public TipsAdapter(List<ArrayofContentsModel> tipsData, Context context) {
        this.tipsData = tipsData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(context);
        View viewti = li.inflate(R.layout.tipsrecylerlayout,null);
        return new ViewHolder(viewti);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ArrayofContentsModel tipsData1 = tipsData.get(i);

        viewHolder.tipsimage.setImageDrawable(context.getResources().getDrawable(tipsData1.getImage()));
        viewHolder.tipstext.setText(tipsData1.getTitle());
    }

    @Override
    public int getItemCount() {
        return tipsData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tipstext;
        ImageView tipsimage;
        RelativeLayout clickontipsitem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tipsimage = itemView.findViewById(R.id.img_tips);
            tipstext = itemView.findViewById(R.id.imgtext_tips);
            clickontipsitem = itemView.findViewById(R.id.clickonitem);

            clickontipsitem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context,TipsItemActivity1.class);
                    context.startActivity(intent);

                }
            });


        }
    }


}
