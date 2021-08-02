package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.R;

import java.util.List;

public class ExploreCategoryAdapter extends RecyclerView.Adapter<ExploreCategoryAdapter.ViewHolder> {

    Context context;
    List<ExploreCategoryList> lists;
    int selected=0;

    public ExploreCategoryAdapter(Context context, List<ExploreCategoryList> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.explorecategoryitems,parent,false);
        return new ExploreCategoryAdapter.ViewHolder(view);
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


        ExploreCategoryList list=lists.get(position);
        holder.categoryname.setText(list.getName());


    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryname=itemView.findViewById(R.id.categoryname);
        }
    }
}
