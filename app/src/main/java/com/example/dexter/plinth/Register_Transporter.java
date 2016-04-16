package com.example.dexter.plinth;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by dexter on 12/7/15.
 */
public class Register_Transporter extends Fragment{
    Button register;
    ImageView imgleft;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource that'll be returned
        View rootView = inflater.inflate(R.layout.activity_register, container, false);
        register = (Button)rootView.findViewById(R.id.bRegister);
        imgleft = (ImageView)rootView.findViewById(R.id.ivleft);
        imgleft.setImageResource(R.drawable.ic_keyboard_arrow_left_black_24dp);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/forms/d/19OJ19k7xw64Vq5iZ5ee2lxLfKPRzNhtAq_VEF6K5U5M/viewform?embedded=true";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        // Get the arguments that was supplied when
        // the fragment was instantiated in the
        // CustomPagerAdapter

        return rootView;
    }

}
