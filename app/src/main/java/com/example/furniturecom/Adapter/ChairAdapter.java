package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.Chairitems;
import com.example.furniturecom.R;

import java.util.List;

public class ChairAdapter extends RecyclerView.Adapter<ChairAdapter.ViewHolder> {
    Context context;
    List<Chairitems> chairitems;

    public ChairAdapter(Context context, List<Chairitems> chairitems) {
        this.context = context;
        this.chairitems = chairitems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chairitems,parent,false);
        return new ChairAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return chairitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
