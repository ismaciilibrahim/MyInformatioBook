package com.ayeeyotech.myinformationbook.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ayeeyotech.myinformationbook.adapters.AdapterClass;
import com.ayeeyotech.myinformationbook.ModelClass;
import com.ayeeyotech.myinformationbook.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    //arraylist waxay data type ahaan uqadanysa model classka
    private ArrayList<ModelClass> arrayList;

    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reyclerView);

        //data waxan usek ugu muujiny from top to bottom lkn waxan kudaryn number of columns
        //oo ah intay coloumn ayeey noqnysa datadu

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        //arraylist waxan xogta ugu gudbniyna model class


        arrayList = new ArrayList<>();


        //model class objects

        //modelclass image name waa inuu lamid ahaad real image nameka hadii kale manaqonyo mid soo
        //muuqda

        //waxan samyn afar object kuwasoo xogta kasoo qadaya model class kasoo noohaya
        //image iyo magaca ku dulqormya
        ModelClass modelClass1 = new ModelClass("countries2","The Countries");
        ModelClass modelClass2 = new ModelClass("leader2","The Leaders");
        ModelClass modelClass3 = new ModelClass("museums","The Museums");
        ModelClass modelClass4 = new ModelClass("wonder","Seven Wonders of the world ");



        //anago addeegsny hal field oo array ah ayaan waxan galnyn afarti object kuwaso nohaya
        //sawrdii iyo categoryn nameka

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);



        adapter = new AdapterClass(arrayList,this);

        recyclerView.setAdapter(adapter);







    }
}