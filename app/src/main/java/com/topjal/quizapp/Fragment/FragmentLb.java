package com.topjal.quizapp.Fragment;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.topjal.quizapp.CountryLeaderboard;
import com.topjal.quizapp.GlobalLeaderboard;
import com.topjal.quizapp.HomeDashboard;
import com.topjal.quizapp.HomeTimeline;
import com.topjal.quizapp.InstituteLeaderboard;
import com.topjal.quizapp.MainActivity;
import com.topjal.quizapp.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentLb extends Fragment {


    public FragmentLb() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Leaderboard");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.lb_fragment, container, false);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.viewpager1);
        setupViewPager(viewPager);
        // Set Tabs inside Toolbar
        TabLayout tabs = (TabLayout) view.findViewById(R.id.result_tabs1);
        tabs.setupWithViewPager(viewPager);
        return view;

    }




    // Add Fragments to Tabs
    private void setupViewPager(ViewPager viewPager) {
        //Drawable drawable = ResourcesCompat.getDrawable(res,R.drawable.ic_graduation_hat,null);

        FragmentHome.Adapter adapter = new FragmentHome.Adapter(getChildFragmentManager());
        adapter.addFragment(new InstituteLeaderboard(),"Institute");
        adapter.addFragment(new CountryLeaderboard(), "Country");
        adapter.addFragment(new GlobalLeaderboard(), "Global");
        viewPager.setAdapter(adapter);

    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }




}
