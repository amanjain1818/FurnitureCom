package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.BestSellerModel;
import com.example.furniturecom.Model.HandpickModel;
import com.example.furniturecom.R;

import java.util.List;

public class HandPickAdapter extends RecyclerView.Adapter<HandPickAdapter.ViewHolder> {
    Context context;
    List<HandpickModel> handpickModels;

    public HandPickAdapter(Context context, List<HandpickModel> handpickModels) {
        this.context = context;
        this.handpickModels = handpickModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.handpicks,parent,false);
        return new HandPickAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return handpickModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
