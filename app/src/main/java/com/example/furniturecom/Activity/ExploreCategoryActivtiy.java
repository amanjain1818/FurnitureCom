package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.furniturecom.Adapter.ExploreCategoryAdapter;
import com.example.furniturecom.Adapter.ExploreItemsLeftAdapter;
import com.example.furniturecom.Adapter.ExplorePopularAdapter;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.Model.ExploreItems;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class ExploreCategoryActivtiy extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ExploreCategoryList> lists;
    RecyclerView recyclerView1;
    List<ExploreItems> item1;
    TextView filter, products;
    ImageView explorepopular , listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_category_activtiy);
        recyclerView = findViewById(R.id.explorecategoryitems);
        recyclerView1 = findViewById(R.id.popularitemsrecyler);
        filter = findViewById(R.id.filter);
        products = findViewById(R.id.products);
        explorepopular = findViewById(R.id.explorepopularprofile);
        listview=findViewById(R.id.listview);


        lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 5; i++) {
            lists.add(new ExploreCategoryList("Living rooms"));
        }
        recyclerView.setAdapter(new ExploreCategoryAdapter(this, lists));

        recyclerView1.setHasFixedSize(true);
        item1 = new ArrayList<>();

        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 0; i < 10; i++) {
            item1.add(new ExploreItems("Lazy coffe table", "$2000"));
        }
        recyclerView1.setAdapter(new ExplorePopularAdapter(this, item1));

//        filter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ExploreCategoryActivtiy.this, FurnitureItemsActivity.class);
//                startActivity(intent);
//            }
//        });


        explorepopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreCategoryActivtiy.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

//        products.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ExploreCategoryActivtiy.this, CollectionActivity.class);
//                startActivity(intent);
//            }
//        });

        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ExploreCategoryActivtiy.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
