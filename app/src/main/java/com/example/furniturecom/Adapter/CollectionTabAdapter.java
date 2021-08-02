package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.Collectiontabitems;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.R;

import java.util.List;

public class CollectionTabAdapter extends RecyclerView.Adapter<CollectionTabAdapter.ViewHolder> {
    Context context;
    List<Collectiontabitems> collectiontabitems;
 int slected=0;
    public CollectionTabAdapter(Context context, List<Collectiontabitems> collectiontabitems) {
        this.context = context;
        this.collectiontabitems = collectiontabitems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.collectiontab,parent,false);
        return new CollectionTabAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Collectiontabitems list=collectiontabitems.get(position);
        holder.tab.setText(list.getTab());
        if (slected==position){
            holder.itemView.setSelected(true);
        }else {
            holder.itemView.setSelected(false);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (slected==position){

                }else{
                    holder.itemView.setSelected(true);
                    slected=holder.getAdapterPosition();
                    notifyDataSetChanged();

                }


            }
        });


    }

    @Override
    public int getItemCount() {
        return collectiontabitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tab;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tab=itemView.findViewById(R.id.collectiontabs);
        }
    }
}
