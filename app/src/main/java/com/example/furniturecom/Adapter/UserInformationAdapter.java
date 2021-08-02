package com.example.furniturecom.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.furniturecom.Model.ExploreItems;
import com.example.furniturecom.Model.UserInformation;
import com.example.furniturecom.R;

import java.util.List;

public class UserInformationAdapter extends RecyclerView.Adapter<UserInformationAdapter.ViewHolder> {
    Context context;
    List<UserInformation> lists;

    public UserInformationAdapter(Context context, List<UserInformation> lists) {
        this.context = context;
        this.lists = lists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.userinformationitems,parent,false);
        return new UserInformationAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserInformation list=lists.get(position);

        holder.name.setText(list.getName());
        holder.email.setText(list.getEmail());
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView name,email;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.usernames);
            email=itemView.findViewById(R.id.useremails);
        }
    }
}
