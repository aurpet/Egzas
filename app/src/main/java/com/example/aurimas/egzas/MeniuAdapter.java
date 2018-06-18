package com.example.aurimas.egzas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collections;
import java.util.List;

public class MeniuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private LayoutInflater inflater;
    private List<Meniu> menius = Collections.emptyList();


    public MeniuAdapter(Context context, List<Meniu> menius) {
        this.context = context;
        this.menius = menius;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.container_meniu, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    //bind data
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyHolder myHolder = (MyHolder) holder;
        Meniu currentMeniu = menius.get(position);
        myHolder.foodName.setText(currentMeniu.getMeniu());
        myHolder.group.setText("Grupe: " + currentMeniu.getGroup());
        myHolder.calories.setText("Kalorijos " + currentMeniu.getCalories());
        myHolder.price.setText("Kaina " + currentMeniu.getPrice());
    }

    @Override
    public int getItemCount() {
        return menius.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView foodName, group, calories, price;

        public MyHolder(View itemView) {
            super(itemView);
            foodName = (TextView) itemView.findViewById(R.id.pavadinimas);
            price = (TextView) itemView.findViewById(R.id.kaina);
            calories = (TextView) itemView.findViewById(R.id.kalorijos);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            int itemPosition = getAdapterPosition();
            int meniuID = menius.get(itemPosition).getId();

        }
    }
}