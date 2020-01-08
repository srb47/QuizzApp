package com.topjal.quizapp.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.topjal.quizapp.ClassOne;
import com.topjal.quizapp.ExamMode;
import com.topjal.quizapp.MainActivity;
import com.topjal.quizapp.R;


public class FragmentQp extends Fragment {

    private SearchView search;

    public FragmentQp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Quiz by Class");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.qp_fragment, container, false);

        search = (SearchView) v.findViewById(R.id.search);
        search.setQueryHint("Search Quizzes");

        ImageView imageView = (ImageView)v.findViewById(R.id.exam_mode);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(getActivity(), ExamMode.class);
                startActivity(intent);
            }
        });


        return v;
    }
}
