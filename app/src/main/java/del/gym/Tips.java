package del.gym;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.List;

import del.gym.modal.home_data.ArrayofContentsModel;

public class Tips extends AppCompatActivity {
    private List<ArrayofContentsModel> tipsData = new ArrayList<>();
    RecyclerView recyletips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        recyletips = findViewById(R.id.tipsitems);
        recyletips.setHasFixedSize(true);
        recyletips.setLayoutManager(new LinearLayoutManager(this));

        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.enviroment_improve_medicine
                        ,"How to accelerate your metabolism to lose weight fast"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips2
                        ,"Why protein or meat protein, which is better"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips3
                        ,"The 4 supplements that you should consume if you have low budget"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips4
                        ,"How to recognize a good supplement to optimize your profits"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips5
                        ,"Guide to choose your supplement"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips6
                        ,"Do not start a diet that end some day, start a lifestyle that lasts forever"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips7
                        ,"Take some time to take care of your diet"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips1
                        ,"Go to the market and buy fresh product"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips2
                        ,"Sign up to the method "
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips3
                        ,"Balanced diet and exercise, the perfect tandem"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips4
                        ,"Enjoy your food"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips4
                        ,"If you are on a diet, do not go self-demanding"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips13
                        ,"Improve your environment"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips6
                        ,"Eat consciously"
                ));
        tipsData.add(
                new ArrayofContentsModel(
                        R.drawable.tips7
                        ,"Get the chef you have inside"
                ));




        TipsAdapter tipsAdapter = new TipsAdapter(tipsData,this);
        LinearLayoutManager lm = new LinearLayoutManager(Tips.this,GridLayout.VERTICAL,false);
        recyletips.setLayoutManager(lm);
        recyletips.setItemAnimator(new DefaultItemAnimator());
        recyletips.setAdapter(tipsAdapter);

    }
}
