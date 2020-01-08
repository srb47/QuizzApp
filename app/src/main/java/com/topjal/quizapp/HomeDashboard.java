package com.topjal.quizapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;
import com.topjal.quizapp.Fragment.FragmentQc;

public class HomeDashboard extends Fragment{

    public HomeDashboard() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.home_dashboard, container, false);


        ImageView imageView = (ImageView) v.findViewById(R.id.my_bundle);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyBundle.class);
                startActivity(intent);
            }
        });

        CardView cardView = (CardView) v.findViewById(R.id.class1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ClassOne.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = (ImageView) v.findViewById(R.id.aq);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AvailableQuizzes.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = (ImageView) v.findViewById(R.id.recent);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), RecentAcitivity.class);
                startActivity(intent);
            }
        });

        return v;

    }


}
