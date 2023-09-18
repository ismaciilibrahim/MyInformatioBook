package com.ayeeyotech.myinformationbook.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ayeeyotech.myinformationbook.ModelClass;
import com.ayeeyotech.myinformationbook.R;
import com.ayeeyotech.myinformationbook.activities.CountriesActivity;
import com.ayeeyotech.myinformationbook.activities.LeadersActivity;
import com.ayeeyotech.myinformationbook.activities.MuseumsActivity;
import com.ayeeyotech.myinformationbook.activities.WondersActivity;

import java.util.ArrayList;

//adapter class waxu isku xirya reyclerviewga
//designkiisa
//waxa kasoo muuqnya design data kasoo muuqnysa designka
//iyo waxa dhacaya hadii lataabo mid kamida ama shaqooyinka dhacaya backround
//tusaale hadii click lasiiyo cardviewga


public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder>{

    //arraylist waxay data type ahaan uqadnysa model classska
    private ArrayList<ModelClass> modelClassList;

    //context object waxan awoodayn inaan category katusno users shashada sida sawirka iyo wax uu wato

    private Context context;

    //adapter construcotor waxan ku gudbnya data arraylistga iyo context class

    public AdapterClass(ArrayList<ModelClass> modelClassList, Context context) {
        this.modelClassList = modelClassList;
        this.context = context;
    }

    @NonNull
    @Override
    //methodka waxay go,aaminys designkee ayaa kasoo muuqnya reycler viewga

    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_desing,parent,false);

        return new CardViewHolder(view);
    }


    //methodkan waxay go,aaminysa maxa dhacay markii desingku kasoo muuqdo reyclerviewga

    //sidookale waxan data ka tusyna reyclerviewga
    @SuppressLint({"NewApi", "ResourceAsColor"})

    @Override

    public void onBindViewHolder(@NonNull CardViewHolder holder,@SuppressLint("RecyclerView")  int position) {

        //xogta waxan kasoo qaadyn model class waxan kuwereejinyna arraylist

        ModelClass model = modelClassList.get(position);

        holder.textViewSplash.setText(model.getCategoryName());

        holder.imageViewSplash.setImageResource(context.getResources().getIdentifier(model.getImageName(),"drawable",context.getPackageName()));



         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 if (position == 0){
                     Intent intent = new Intent(context, CountriesActivity.class);
                     context.startActivity(intent);

                 } else if (position == 1){
                     Intent intent = new Intent(context, LeadersActivity.class);
                     context.startActivity(intent);

                 }
                 else if (position == 2){
                     Intent intent = new Intent(context, MuseumsActivity.class);
                     context.startActivity(intent);

                 } else if (position == 3){
                     Intent intent = new Intent(context, WondersActivity.class);
                     context.startActivity(intent);

                 }

             }
         });

    }


    //methodka xadiga inta data kasoo muuqnysa reyclerviewga
    @Override
    public int getItemCount() {
        return modelClassList.size();
    }


    //classka cardviewga

    public class CardViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewSplash;
        private TextView textViewSplash;

        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);


            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textViewSplash = itemView.findViewById(R.id.textViewSplash);

            cardView = itemView.findViewById(R.id.cardView);


        }
    }


}
