package com.ayeeyotech.myinformationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.ayeeyotech.myinformationbook.R;
import com.ayeeyotech.myinformationbook.adapters.ViewPageAdapterCountires;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class CountriesActivity extends AppCompatActivity {

    private TabLayout tabLayoutUK;
    private ViewPager2  viewPagerUk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        tabLayoutUK = findViewById(R.id.tabLayouUk);
        viewPagerUk = findViewById(R.id.viewPagerUK);


        ViewPageAdapterCountires adapter = new ViewPageAdapterCountires(getSupportFragmentManager(),getLifecycle());

        viewPagerUk.setAdapter(adapter);



        TabLayoutMediator mediator = new TabLayoutMediator(tabLayoutUK, viewPagerUk, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("UnitedKingDom");
                        break;
                    case 1:
                        tab.setText("Somalia");
                        break;
                    case 2:
                        tab.setText("Italy");
                        break;


                }

            }
        });

        //methodkan waxay iskuxirysa tab layoutka iyo viewpagerka
        mediator.attach();
    }
}