package com.ayeeyotech.myinformationbook.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.ayeeyotech.myinformationbook.R;
import com.ayeeyotech.myinformationbook.adapters.ViewPageAdapterCountires;
import com.ayeeyotech.myinformationbook.adapters.ViewPageAdapterWonders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WondersActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonders);

        tabLayout = findViewById(R.id.tabLayouWonder);
        viewPager = findViewById(R.id.viewPagerWonder);

        ViewPageAdapterWonders adapter = new ViewPageAdapterWonders(getSupportFragmentManager(),getLifecycle());

        viewPager.setAdapter(adapter);


        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, viewPager, true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("Taj mahal");
                        break;
                    case 1:
                        tab.setText("Ocean");
                        break;



                }

            }
        });

        //methodkan waxay iskuxirysa tab layoutka iyo viewpagerka
        mediator.attach();


    }
}