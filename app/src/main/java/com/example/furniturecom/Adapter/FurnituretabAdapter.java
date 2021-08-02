package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.Collectiontabitems;
import com.example.furniturecom.Model.Furnituretabitems;
import com.example.furniturecom.R;

import java.util.List;

public class FurnituretabAdapter extends RecyclerView.Adapter<FurnituretabAdapter.ViewHolder> {
    Context context;
    List<Furnituretabitems> furnituretabitems;
    int selected =0;

    public FurnituretabAdapter(Context context, List<Furnituretabitems> furnituretabitems) {
        this.context = context;
        this.furnituretabitems = furnituretabitems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.furnituretab,parent,false);
        return new FurnituretabAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Furnituretabitems list=furnituretabitems.get(position);
        holder.tab.setText(list.getTab());
        if(selected==position)
        {
            holder.itemView.setSelected(true);
        }
        else{
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
        return furnituretabitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tab;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tab=itemView.findViewById(R.id.furnituretabs);
        }
    }
}
