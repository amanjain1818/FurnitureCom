package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.furniturecom.Adapter.FurnitureitemsAdapter;
import com.example.furniturecom.Adapter.ZenitemsAdapter;
import com.example.furniturecom.Model.FurnitureitemsList;
import com.example.furniturecom.Model.Zenlivingitems;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class ZenLiving extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Zenlivingitems> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zen_living);
        recyclerView=findViewById(R.id.zenlivingrecycler);
        lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        for (int i = 0; i < 10; i++) {
            lists.add(new Zenlivingitems("Kew Chairs","2000"));
        }
        recyclerView.setAdapter(new ZenitemsAdapter(this, lists));


    }
}
