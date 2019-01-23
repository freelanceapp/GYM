package del.gym;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import del.gym.modal.home_data.ArrayofContentsModel;

class ToolsAdapter extends RecyclerView.Adapter<ToolsAdapter.ViewHolder> {

    private List<ArrayofContentsModel> contentsMode1;
    Context ctx;

    public ToolsAdapter(List<ArrayofContentsModel> contentsMode1, Context ctx) {
        this.contentsMode1 = contentsMode1;
        this.ctx = ctx;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li = LayoutInflater.from(ctx);
        View viewt = li.inflate(R.layout.toosrecylerview,null);
        return new ViewHolder(viewt);
        }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ArrayofContentsModel contentsMode2 = contentsMode1.get(i);

        viewHolder.imagetools.setImageDrawable(ctx.getResources().getDrawable(contentsMode2.getImage()));
        viewHolder.texttools.setText(contentsMode2.getTitle());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagetools;
        TextView texttools;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagetools = itemView.findViewById(R.id.image_tools);
            texttools = itemView.findViewById(R.id.image_tools);
        }
    }
}
