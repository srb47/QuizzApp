package com.topjal.quizapp.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.topjal.quizapp.MainActivity;
import com.topjal.quizapp.R;


public class FragmentHt extends Fragment {



    public FragmentHt() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("History");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.ht_fragment, container, false);



        return v;
    }
}
