package com.example.dexter.plinth;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dexter on 12/7/15.
 */
public class ProblemStatement extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource that'll be returned
        View rootView = inflater.inflate(R.layout.activity_problemstatement, container, false);


        // Get the arguments that was supplied when
        // the fragment was instantiated in the
        // CustomPagerAdapter

        return rootView;
    }
}
