package com.ayeeyotech.myinformationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ayeeyotech.myinformationbook.fragments.FragmentItaly;
import com.ayeeyotech.myinformationbook.fragments.FragmentSomalia;
import com.ayeeyotech.myinformationbook.fragments.FragmentUk;

public class ViewPageAdapterCountires  extends FragmentStateAdapter {
    public ViewPageAdapterCountires(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    //methodkan waa method  waxay go,aminysa
    //fragments siday ugu kala horeenyan markii swipe left ama iyo swiper right lasmenyo
    //
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){

            //fragmentiga biblanysa cuase markii fragments activity
            //aykudhexjirna positon kodu waxu kabilbma zero

            case 0:
                fragment = FragmentUk.newInstance();

                break;

            case 1:
                fragment = FragmentSomalia.newInstance();

                break;
            case 2:
                fragment = FragmentItaly.newInstance();

                break;

            default:{
                return null;
            }
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
