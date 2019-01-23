package del.gym;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

class BeginnerMediumAdapter extends FragmentPagerAdapter {
    private List<StretcingModel> begginerfragmentList;
    int totalTabs;

    public BeginnerMediumAdapter(FragmentManager fm, int totalTabs,List<StretcingModel> begginerfragmentList) {
        super(fm);
        this.totalTabs = totalTabs;
        this.begginerfragmentList = begginerfragmentList;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BeginnerFragment beginnerFragment = new BeginnerFragment(begginerfragmentList);
                return beginnerFragment;
            case 1:
                IntermediumFragment intermediumFragment = new IntermediumFragment(begginerfragmentList);
                return intermediumFragment;
            case 2:
                AdvancedFragment advancedFragment = new AdvancedFragment(begginerfragmentList);
                return advancedFragment;

            default:
                return null;
        }
    }

    public  int getCount(){
        return totalTabs;
    }
}

