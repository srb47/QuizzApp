package com.topjal.quizapp.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.topjal.quizapp.ClassOne;
import com.topjal.quizapp.MainActivity;
import com.topjal.quizapp.R;


public class FragmentQc extends Fragment {

    public FragmentQc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Quiz by Class");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.qc_fragment, container, false);

        CardView cardView = (CardView) v.findViewById(R.id.classone);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ClassOne.class);
                startActivity(intent);
            }
        });

        return v;
    }
}
