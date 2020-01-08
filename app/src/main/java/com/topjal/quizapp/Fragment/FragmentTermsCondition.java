package com.topjal.quizapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.topjal.quizapp.MainActivity;
import com.topjal.quizapp.R;


public class FragmentTermsCondition extends Fragment {




    public FragmentTermsCondition() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("Terms and Condition");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.termscondition_fragment, container, false);


        return v;
    }

}
