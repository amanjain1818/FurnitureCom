package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.Model.Zenlivingitems;
import com.example.furniturecom.R;

import java.util.List;

public class ZenitemsAdapter extends RecyclerView.Adapter<ZenitemsAdapter.ViewHolder> {
    Context context;
    List<Zenlivingitems> lists;

    public ZenitemsAdapter(Context context, List<Zenlivingitems> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.zenlivingitems,parent,false);
        return new ZenitemsAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Zenlivingitems list=lists.get(position);
        holder.name.setText(list.getName());
        holder.price.setText(list.getPrice());

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.zenname);
            price=itemView.findViewById(R.id.zenprice);
        }
    }
}
