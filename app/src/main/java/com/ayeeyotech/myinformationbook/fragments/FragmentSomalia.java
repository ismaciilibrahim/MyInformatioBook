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

public class FragmentSomalia extends Fragment {

    private ImageView imageViewSomalia;
    private ProgressBar progressBarSo;

    public static FragmentSomalia newInstance(){
        return  new FragmentSomalia();
    }

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override



    //oncreate view waxay wadata saddex paramter
    //infaltore class: waxu sheegya desginka kasoo muuqnya fragmentiga
    //viewgroub class waxay sheegya activyt uu kuxirmyo fragment classkeenu
    //
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =  inflater.inflate(R.layout.fragment_somalia,container,false);

         imageViewSomalia = view.findViewById(R.id.imageViewSomalia);
         progressBarSo = view.findViewById(R.id.progressBarSO);


        Picasso.get().load( "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Flag_of_Somalia.svg/1280px-Flag_of_Somalia.svg.png"
                ).into(imageViewSomalia, new Callback() {
            @Override
            public void onSuccess() {
                progressBarSo.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarSo.setVisibility(View.GONE);

            }
        });


         return view;
    }
}
