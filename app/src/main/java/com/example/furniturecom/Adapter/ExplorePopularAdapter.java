package com.example.furniturecom.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Activity.CollectionActivity;
import com.example.furniturecom.Model.ExploreItems;
import com.example.furniturecom.R;

import java.util.List;

public class ExplorePopularAdapter extends RecyclerView.Adapter<ExplorePopularAdapter.ViewHolder> {
    Context context;
    List<ExploreItems> item1;

    public ExplorePopularAdapter(Context context, List<ExploreItems> item1) {
        this.context = context;
        this.item1 = item1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.explorecategorryitems,parent,false);
        return new ExplorePopularAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExploreItems list=item1.get(position);

        holder.name.setText(list.getName());
        holder.price.setText(list.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, CollectionActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return item1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.itemsname);
            price=itemView.findViewById(R.id.itemsprice);

        }
    }
}
