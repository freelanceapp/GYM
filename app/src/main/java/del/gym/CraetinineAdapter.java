package del.gym;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

class CraetinineAdapter extends FragmentPagerAdapter {
    private List<StretcingModel> nutritionDatalist;
    private Context context;
    int totalTabs;

    public CraetinineAdapter(FragmentManager fm, int totalTab) {
        super(fm);
        context = context;
        this.totalTabs = totalTabs;

    }

    @Override
    public Fragment getItem(int position) {
        String strTabName = "";
        if (strTabName.equalsIgnoreCase("protein")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    TypesFragment typesFragment = new TypesFragment();
                    return typesFragment;
                case 2:
                    RecomentdationsFragment recomentdationsFragment = new RecomentdationsFragment();
                    return recomentdationsFragment;
                default:
                    return null;
            }
        } else if (strTabName.equalsIgnoreCase("Creatine")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                case 2:
                    AdvantageFragment advantageFragment = new AdvantageFragment();
                    return advantageFragment;
                case 3:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return sideEffectsFragment;
                case 4:
                    TypesFragment typesFragment = new TypesFragment();
                    return typesFragment;
                case 5:
                    RecomentdationsFragment recomentdationsFragment = new RecomentdationsFragment();
                    return recomentdationsFragment;
                default:
                    return null;
            }
        } else if (strTabName.equalsIgnoreCase("Gainers")) {
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
            } } else if (strTabName.equalsIgnoreCase("Amino Acids / BCAAS")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    WhatistiforFragment whatistiforFragment = new WhatistiforFragment();
                    return whatistiforFragment;
                case 2:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return sideEffectsFragment;
                case 3:
                    WhentoUseFragment whentoUseFragment = new WhentoUseFragment();
                    return whentoUseFragment;
                default:
                    return null;

            } } else if (strTabName.equalsIgnoreCase("Natural anabolics")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    YouMustknowFragment youMustknowFragment = new YouMustknowFragment();
                    return youMustknowFragment;
                default:
                    return null;
            } } else if (strTabName.equalsIgnoreCase("ZMA")) {
            switch (position) {
                case 0:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                case 1:
                    AdvantageFragment advantageFragment = new AdvantageFragment();
                    return advantageFragment;

                default:
                    return null;
            } } else if (strTabName.equalsIgnoreCase("HMB")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;

                default:
                    return null;
            } } else if (strTabName.equalsIgnoreCase("Thermogenic")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    HowDoesItFragment howDoesItFragment = new HowDoesItFragment();
                    return howDoesItFragment;
                case 2:
                    DangersFragment dangersFragment = new DangersFragment();
                    return  dangersFragment;

                default:
                    return null;
            } } else if (strTabName.equalsIgnoreCase("L-Carnitin")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    HowDoesItFragment howDoesItFragment = new HowDoesItFragment();
                    return howDoesItFragment;
                case 2:
                    RecomentdationsFragment recomentdationsFragment = new RecomentdationsFragment();
                    return  recomentdationsFragment;
                case 3:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return  sideEffectsFragment;

                default:
                    return null;
            } } else if (strTabName.equalsIgnoreCase("Green Tea")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    RecomentdationsFragment recomentdationsFragment = new RecomentdationsFragment();
                    return recomentdationsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Chromium Picolinate")) {
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
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Nitric Oxide")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Ginseng")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                case 2:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return sideEffectsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Beta-Alanine")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return sideEffectsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Caffeine")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    HowDoesItFragment howDoesItFragment = new HowDoesItFragment();
                    return howDoesItFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Coenzyme Q-10")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    HowDoesItFragment howDoesItFragment = new HowDoesItFragment();
                    return howDoesItFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Arginine")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    WhatisitForFragment whatisitForFragment = new WhatisitForFragment();
                    return whatisitForFragment;
                case 2:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return  benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Multivitamins")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    TypesFragment typesFragment = new TypesFragment();
                    return typesFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Glutamine")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    HowDoesItFragment howDoesItFragment = new HowDoesItFragment();
                    return howDoesItFragment;
                case 3:
                    BenifitsFragment benifitsFragments = new BenifitsFragment();
                    return  benifitsFragments;
                case 4:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return sideEffectsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Spirulina")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Reserveratrol")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Omega 3")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                case 2:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return  sideEffectsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Glucomine/ Chondroitin")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return  sideEffectsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Ginkgo Biloba")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Ginkgo Biloba")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Acai")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Alpha lipoic Acid")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    BenifitsFragment benifitsFragment = new BenifitsFragment();
                    return benifitsFragment;
                case 2:
                    SideEffectsFragment sideEffectsFragment = new SideEffectsFragment();
                    return  sideEffectsFragment;
                default:
                    return null;
            }} else if (strTabName.equalsIgnoreCase("Melatenin")) {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;
                case 1:
                    WhatistiforFragment whatistiforFragment = new WhatistiforFragment();
                    return whatistiforFragment;
                default:
                    return null;
            }
        } else  {
            switch (position) {
                case 0:
                    WhatisItFragment whatisItFragment = new WhatisItFragment();
                    return whatisItFragment;

                default:
                    return null;
            }
        }
    }
    public  int getCount(){ return totalTabs;}
}