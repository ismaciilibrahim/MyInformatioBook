package com.ayeeyotech.myinformationbook.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ayeeyotech.myinformationbook.fragments.FragmentItaly;
import com.ayeeyotech.myinformationbook.fragments.FragmentOcean;
import com.ayeeyotech.myinformationbook.fragments.FragmentSomalia;
import com.ayeeyotech.myinformationbook.fragments.FragmentTajMahal;
import com.ayeeyotech.myinformationbook.fragments.FragmentUk;

public class ViewPageAdapterWonders extends FragmentStateAdapter {
    public ViewPageAdapterWonders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch (position){

            //fragmentiga biblanysa cuase markii fragments activity
            //aykudhexjirna positon kodu waxu kabilbma zero

            case 0:
                fragment = FragmentTajMahal.newInstance();

                break;

            case 1:
                fragment = FragmentOcean.newInstance();

                break;



            default:{
                return null;
            }
        }

        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
