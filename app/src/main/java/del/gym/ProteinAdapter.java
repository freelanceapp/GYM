package del.gym;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

 class ProteinAdapter extends FragmentPagerAdapter {
     private Context context;
    int totalTabs;

    public ProteinAdapter(FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
        context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new WhatisItFragment();
            case 1:
                return new RecomentdationsFragment();
            case 2:
                return new BenifitsFragment();
            default:
                return null;
        }
    }

    public  int getCount(){
        return totalTabs;
    }
}
