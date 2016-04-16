package com.example.dexter.plinth;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Synopsis extends Fragment {

    ImageView imgtran;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource that'll be returned
        View rootView = inflater.inflate(R.layout.activity_synopsis, container, false);
       // imgtran = (ImageView)rootView.findViewById(R.id.ivtransporter);
       // imgtran.setImageResource(R.drawable.ic_transporter);


        // Get the arguments that was supplied when
        // the fragment was instantiated in the
        // CustomPagerAdapter

        return rootView;
    }
}
