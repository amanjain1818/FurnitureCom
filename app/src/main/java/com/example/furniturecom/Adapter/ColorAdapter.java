package com.example.furniturecom.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.Colordots;
import com.example.furniturecom.R;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {
    Context context;
    List<Colordots> colordots;
     int selected =0;
    public ColorAdapter(Context context, List<Colordots> colordots) {
        this.context = context;
        this.colordots = colordots;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.colorselectionitems, parent, false);
        return new ColorAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        if (selected==position){
            holder.itemView.setSelected(true);
        }else{
            holder.itemView.setSelected(false);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selected==position){

                }else{
                    holder.itemView.setSelected(true);
                  selected=holder.getAdapterPosition();
                  notifyDataSetChanged();

                }

            }
        });
    }



    @Override
    public int getItemCount() {
        return colordots.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
