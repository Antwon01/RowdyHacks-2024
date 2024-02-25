package com.example.button.model;


// DashboardPagerAdapter.java
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class DashboardPagerAdapter extends FragmentPagerAdapter {

    public DashboardPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AccountFragment();
            case 1:
                return new MapsFragment();
            case 2:
                return new ContactsFragment();
            case 3:
                return new RidesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        // Number of tabs
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Title of each tab
        switch (position) {
            case 0:
                return "Account";
            case 1:
                return "Maps";
            case 2:
                return "Contacts";
            case 3:
                return "Ride";
            default:
                return null;
        }
    }
}
