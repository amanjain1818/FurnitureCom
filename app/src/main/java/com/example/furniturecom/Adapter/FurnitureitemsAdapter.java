package com.example.furniturecom.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Activity.ChairsActivity;
import com.example.furniturecom.Activity.ExploreCategoryActivtiy;
import com.example.furniturecom.Activity.KewChairsModern;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.Model.FurnitureitemsList;
import com.example.furniturecom.R;

import java.util.List;


public class FurnitureitemsAdapter extends RecyclerView.Adapter<FurnitureitemsAdapter.ViewHolder> {
    Context context;
    List<FurnitureitemsList> lists;

    public FurnitureitemsAdapter(Context context, List<FurnitureitemsList> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.furnitureitems,parent,false);
        return new FurnitureitemsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FurnitureitemsList list=lists.get(position);

        holder.name.setText(list.getName());
        holder.info.setText(list.getInfo());
        holder.des.setText(list.getDes());
        holder.price.setText(list.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ChairsActivity.class));
            }
        });



    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,info,des,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.itemsname);
            info=itemView.findViewById(R.id.iteminfo);
            des=itemView.findViewById(R.id.itemdes);
            price=itemView.findViewById(R.id.itemssprice);
        }
    }
}
