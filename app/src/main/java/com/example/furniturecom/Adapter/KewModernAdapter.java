package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.FurnitureitemsList;
import com.example.furniturecom.R;

import java.util.List;

public class KewModernAdapter extends RecyclerView.Adapter<KewModernAdapter.ViewHolder> {
   Context context;
   List<FurnitureitemsList> lists;

    public KewModernAdapter(Context context, List<FurnitureitemsList> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.kewchairmodernitems,parent,false);
        return new KewModernAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        FurnitureitemsList list=lists.get(position);

        holder.name.setText(list.getName());
        holder.info.setText(list.getInfo());
        holder.des.setText(list.getDes());
        holder.price.setText(list.getPrice());

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,info,des,price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.kewname);
            info=itemView.findViewById(R.id.kewinfo);
            des=itemView.findViewById(R.id.kewdes);
            price=itemView.findViewById(R.id.kewdes);

        }
    }
}
