package del.gym;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ProductsAdapter extends FragmentPagerAdapter {

    int totalTabs;

    public ProductsAdapter(FragmentManager fm, int totalTabst) {
        super(fm);
        this.totalTabs = totalTabs;


    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                WhatisItFragment whatisItFragment = new WhatisItFragment();
                return whatisItFragment;
            case 1:
                RecomentdationsFragment recomentdationsFragment = new RecomentdationsFragment();
                return recomentdationsFragment;

            case 2:
                BenifitsFragment benifitsFragment = new BenifitsFragment();
                return benifitsFragment;
            case 3:
                AdvantageFragment advantageFragment= new AdvantageFragment();
                return advantageFragment;
            case 4:
                SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                return sideEffectsFragment;
            case 5:
                TypesFragment typesFragment = new TypesFragment();
                return typesFragment;
            case 6:
                DisavantageFragment disavantageFragment = new DisavantageFragment();
                return disavantageFragment;
            case 7: HowItWorksFragment howItWorksFragment = new HowItWorksFragment();
                return howItWorksFragment;
            default:
                return null;
        }
    }

    public  int getCount(){
        return totalTabs;
    }
}


