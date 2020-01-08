package com.topjal.quizapp.Fragment;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.topjal.quizapp.MainActivity;
import com.topjal.quizapp.R;


public class FragmentMgq extends Fragment {

    Dialog myDialog;
    Context mContext;
    Button button;


    public FragmentMgq() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity)getActivity()).setActionBarTitle("My Generated Quiz");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.mgq_fragment, container, false);

        myDialog = new Dialog(getActivity());
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myDialog.setContentView(R.layout.activity_new_gen_quiz);

        button=(Button) v.findViewById(R.id.gen_quiz);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myDialog.show();

            }
        });



        return v;
    }
}
