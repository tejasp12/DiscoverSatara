package com.example.android.discoversatara;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
        //Context of the App.
        private Context mcontext;
        public SimpleFragmentPagerAdapter(Context context,FragmentManager fm){
            super(fm);
            mcontext = context;
        }

        @Override
        public Fragment getItem(int position) {
            if(position==0){
                return new HotelsFragment();
            }else if(position==1){
                return new HillResortsFragment();
            }else if(position==2){
                return new RestaurantsFragment();
            }else {
                return new PicnicSpotsFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position==0){
                return mcontext.getString(R.string.cat_hotels);
            }else if(position==1){
                return mcontext.getString(R.string.cat_hill_resorts);
            }else if(position==2){
                return mcontext.getString(R.string.cat_restos);
            }else {
                return mcontext.getString(R.string.cat_picnic_spots);
            }
        }
    }
