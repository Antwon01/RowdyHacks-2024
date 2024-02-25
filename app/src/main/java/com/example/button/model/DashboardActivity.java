package com.example.button.model;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.example.button.R;
import androidx.viewpager.widget.ViewPager;



public class DashboardActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);

        // Initialize views
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // Create and set up the adapter for ViewPager
        DashboardPagerAdapter pagerAdapter = new DashboardPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);



        // Connect ViewPager with TabLayout
        tabLayout.setupWithViewPager(viewPager);
    }
}

