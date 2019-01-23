package del.gym;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class NutDietAdapter1 extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public NutDietAdapter1(FragmentManager fm, int totalTabs) {
        super(fm);
        context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MondayFragment mondayFragment = new MondayFragment();
                return mondayFragment;
            case 1:
                TuesdayFragment tuesdayFragment = new TuesdayFragment();
                return tuesdayFragment;
            case 2:
                WednesdatFragment wednesdatFragment = new WednesdatFragment();
                return wednesdatFragment;
            case 3:
                ThursdayFragment thursdayFragment = new ThursdayFragment();
                return thursdayFragment ;
            case 4:
                FridayFragment fridayFragment = new FridayFragment();
                return fridayFragment;
            case 5:
                SaturdayFragment saturdayFragment = new SaturdayFragment();
                return saturdayFragment;
            case 6:
                SundayFragment sundayFragment = new SundayFragment();
                return sundayFragment;

            default:
                return null;
        }
    }

        public  int getCount(){
        return totalTabs;
    }
}