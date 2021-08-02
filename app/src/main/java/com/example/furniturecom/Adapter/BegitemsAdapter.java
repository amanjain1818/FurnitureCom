package com.example.furniturecom.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.ViewBinderHelper;
import com.example.furniturecom.Model.Begitems;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class BegitemsAdapter extends RecyclerView.Adapter<BegitemsAdapter.ViewHolder> {
    private static ViewBinderHelper viewBinderHelper = new ViewBinderHelper();
    Context context;
    List<Begitems> lists;

    public BegitemsAdapter(Context context, List<Begitems> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.begitems, parent, false);
        return new BegitemsAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Begitems list = lists.get(position);
        holder.name.setText(list.getName());
        holder.price.setText(list.getPrice());

        Begitems dataObject = lists.get(position);
        viewBinderHelper.bind(holder.swipe, String.valueOf(position));
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.itemcount.setText(String.valueOf(Integer.parseInt(holder.itemcount.getText().toString()) + 1));
            }
        });
        holder.remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!holder.itemcount.getText().toString().equals("0")) {
                    holder.itemcount.setText(String.valueOf(Integer.parseInt(holder.itemcount.getText().toString()) - 1));
                }
            }
        });
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lists.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {

        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, price, itemcount;
        SwipeRevealLayout swipe;
        ImageView add, remove;
        FrameLayout delete;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.begname);
            price = itemView.findViewById(R.id.begprice);
            swipe = itemView.findViewById(R.id.swipe);
            add = itemView.findViewById(R.id.add);
            remove = itemView.findViewById(R.id.remove);
            delete=itemView.findViewById(R.id.delte);
            itemcount = itemView.findViewById(R.id.itemcount);
            itemcount.setText("0");


        }
    }
}
