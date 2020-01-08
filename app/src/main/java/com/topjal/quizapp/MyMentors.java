package com.topjal.quizapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;


public class MyMentors extends Fragment{

    private SearchView search;
    private ImageView imageView;

    public MyMentors() {
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
        View v = inflater.inflate(R.layout.my_mentors, container, false);

        search = (SearchView) v.findViewById(R.id.search);
        search.setQueryHint("Search Mentors");

        imageView=(ImageView)v.findViewById(R.id.message_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ChattingActivity.class);
                startActivity(intent);
            }
        });

        imageView=(ImageView)v.findViewById(R.id.profile_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MentorsProfile.class);
                startActivity(intent);
            }
        });

        return v;

    }


}
