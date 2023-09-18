package com.ayeeyotech.myinformationbook.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ayeeyotech.myinformationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentTajMahal extends Fragment {

    private ImageView imageViewTajMahal;
    private ProgressBar progressBarTJ;

    public static FragmentTajMahal newInstance(){
        return  new FragmentTajMahal();
    }

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override



    //oncreate view waxay wadata saddex paramter
    //infaltore class: waxu sheegya desginka kasoo muuqnya fragmentiga
    //viewgroub class waxay sheegya activyt uu kuxirmyo fragment classkeenu
    //
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =  inflater.inflate(R.layout.fragment_taj_mahal,container,false);

        imageViewTajMahal = view.findViewById(R.id.imageViewOcean);
         progressBarTJ = view.findViewById(R.id.progressBarOC);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bd/Taj_Mahal%2C_Agra%2C_India_edit3.jpg/1280px-Taj_Mahal%2C_Agra%2C_India_edit3.jpg"
                ).into( imageViewTajMahal, new Callback() {
            @Override
            public void onSuccess() {
                 progressBarTJ.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarTJ.setVisibility(View.GONE);

            }
        });


         return view;
    }
}
