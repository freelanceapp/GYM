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

class WorkOutActiivtyAdapters1 extends RecyclerView.Adapter<WorkOutActiivtyAdapters1.ViewHolder> {

private List<StretcingModel> workoutact4model;
private Context context;

public WorkOutActiivtyAdapters1(List<StretcingModel> workoutact4model, Context context) {
        this.workoutact4model = workoutact4model;
        this.context = context;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater li =  LayoutInflater.from(context);
        View view = li.inflate(R.layout.work_functional_rclv,null);
        return new ViewHolder(view);
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        StretcingModel workoutsact4model= workoutact4model.get(i);
        final String name = workoutsact4model.getName();
        final int imgPath = workoutsact4model.getImage1();

        viewHolder.imagetools.setImageDrawable(context.getResources().getDrawable(workoutsact4model.getImage1()));
        viewHolder.texttools.setText(workoutsact4model.getName());
        viewHolder.work_onclick.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent intent1 = new Intent(context, ExerciseActivitiesAll6.class);
        intent1.putExtra("DRAWABLE_IMAGE", imgPath);
        intent1.putExtra("NAME_KEY", name);
        context.startActivity(intent1);
        }
        });
        }

@Override
public int getItemCount() {
        return 0;
        }

public class ViewHolder extends RecyclerView.ViewHolder{
    RelativeLayout work_onclick;
    ImageView imagetools;
    TextView texttools;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imagetools = itemView.findViewById(R.id.work_functional_imagegs);
        texttools = itemView.findViewById(R.id.work_functional_names);
        work_onclick = itemView.findViewById(R.id.work_onclick);
    }
}
}
