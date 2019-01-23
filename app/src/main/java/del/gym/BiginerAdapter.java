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

import org.w3c.dom.Text;

import java.util.List;

class BiginerAdapter extends RecyclerView.Adapter<BiginerAdapter.ViewHolder> {

    private List<StretcingModel> begginermanList;
    private Context context;
    private View.OnClickListener onClickListener;

    public BiginerAdapter(List<StretcingModel> begginermanList, Context context,View.OnClickListener onClickListener) {
        this.begginermanList = begginermanList;
        this.context = context;
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.bigginer_rclv_layout,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {

        StretcingModel begginermanlist = begginermanList.get(i);
        viewHolder.images.setImageDrawable(context.getResources().getDrawable(begginermanlist.getImage1()));
        viewHolder.name.setText(begginermanlist.getName());
        viewHolder.biginnerrclvonclick.setTag(i);
        viewHolder.biginnerrclvonclick.setOnClickListener(onClickListener) ;
    }

    @Override
    public int getItemCount() {
        return begginermanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout biginnerrclvonclick;
        ImageView images;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            biginnerrclvonclick = itemView.findViewById(R.id.biginnerrclvonclick);
            images = itemView.findViewById(R.id.bigginer_images);
            name = itemView.findViewById(R.id.bigginer_names);

        }
    }
}
