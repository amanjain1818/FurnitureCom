package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.FeaturedItems;
import com.example.furniturecom.R;

import java.util.List;

public class FeatureitemAdapter extends RecyclerView.Adapter<FeatureitemAdapter.ViewHolder> {

    Context context;
    List<FeaturedItems> featuredItems;

    public FeatureitemAdapter(Context context, List<FeaturedItems> featuredItems) {
        this.context = context;
        this.featuredItems = featuredItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.featureditems,parent,false);
        return new FeatureitemAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return featuredItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
