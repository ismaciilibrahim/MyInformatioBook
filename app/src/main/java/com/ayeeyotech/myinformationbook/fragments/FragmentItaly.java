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

public class FragmentItaly extends Fragment {

    private ImageView imageViewUnitedKingDom;
    private ProgressBar progressBarUK;

    public static FragmentItaly newInstance(){
        return  new FragmentItaly();
    }

    @SuppressLint("MissingInflatedId")
    @Nullable
    @Override



    //oncreate view waxay wadata saddex paramter
    //infaltore class: waxu sheegya desginka kasoo muuqnya fragmentiga
    //viewgroub class waxay sheegya activyt uu kuxirmyo fragment classkeenu
    //
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view =  inflater.inflate(R.layout.fragment_italy,container,false);

         imageViewUnitedKingDom = view.findViewById(R.id.imageViewItaly);
         progressBarUK = view.findViewById(R.id.progressBarIT);


        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/" +
                "thumb/a/a5/Flag_of_the_United_Kingdom_%281-2%29.svg/1200px-Flag_of_the_United_Kingdom_%281-2%29.svg.png"
                ).into(imageViewUnitedKingDom, new Callback() {
            @Override
            public void onSuccess() {
                progressBarUK.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
                progressBarUK.setVisibility(View.GONE);

            }
        });


         return view;
    }
}
