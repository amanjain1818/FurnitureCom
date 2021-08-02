package com.example.furniturecom.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Activity.CollectionActivity;
import com.example.furniturecom.Activity.FurnitureItemsActivity;
import com.example.furniturecom.Model.BestSellerModel;
import com.example.furniturecom.R;

import java.util.List;

public class BestsellerAdapter extends RecyclerView.Adapter<BestsellerAdapter.ViewHolder> {
Context context;
List<BestSellerModel> bestSellerModels;

    public BestsellerAdapter(Context context, List<BestSellerModel> bestSellerModels) {
        this.context = context;
        this.bestSellerModels = bestSellerModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bestselleritems,parent,false);
        return new BestsellerAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, FurnitureItemsActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return bestSellerModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

