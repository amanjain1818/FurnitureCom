package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.furniturecom.Adapter.ChairAdapter;
import com.example.furniturecom.Adapter.ColorAdapter;
import com.example.furniturecom.Adapter.ExploreCategoryAdapter;
import com.example.furniturecom.Model.Chairitems;
import com.example.furniturecom.Model.Colordots;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class ChairsActivity extends AppCompatActivity {
 RecyclerView recyclerView,recyclerView1;
 List<Colordots> colordots;
 List<Chairitems> chairitems;
 ImageView  chair , chairback,chairbeg,chairprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chairs);
        recyclerView=findViewById(R.id.colordotsrecycler);
        recyclerView1=findViewById(R.id.chairsrecyler);
        chair=findViewById(R.id.kew);
        chairback=findViewById(R.id.chairback);
        chairbeg=findViewById(R.id.chairbag);
        chairprofile=findViewById(R.id.chairprofile);

        colordots = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 4; i++) {
            colordots.add(new Colordots());
        }
        recyclerView.setAdapter(new ColorAdapter(this, colordots));



        chairitems = new ArrayList<>();
        recyclerView1.setHasFixedSize(true);

        recyclerView1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 4; i++) {
            chairitems.add(new Chairitems());
        }
        recyclerView1.setAdapter(new ChairAdapter(this, chairitems));


         chair.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(ChairsActivity.this,ChairsInfo.class);
                 startActivity(intent);
             }
         });

        chairback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChairsActivity.this,FurnitureItemsActivity.class);
                startActivity(intent);
            }
        });

        chairbeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChairsActivity.this,MyBegActivity.class);
                startActivity(intent);
            }
        });
        chairprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChairsActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
