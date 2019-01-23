package del.gym;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class GeinersAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public GeinersAdapter(FragmentManager fm, int totalTabs) {
        super(fm);
        context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                WhatisItFragment whatisItFragment = new WhatisItFragment();
                return whatisItFragment;
            case 1:
                BenifitsFragment benifitsFragment = new BenifitsFragment();
                return benifitsFragment;
            case 2:
                DisavantageFragment disavantageFragment = new DisavantageFragment();
                return disavantageFragment;
            case 3:
                RecomentdationsFragment recomentdationsFragment = new RecomentdationsFragment();
                return recomentdationsFragment;

            default:
                return null;
        }
    }

    public  int getCount(){
        return totalTabs;
    }
}