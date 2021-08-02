package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.furniturecom.Adapter.BestsellerAdapter;
import com.example.furniturecom.Adapter.CollectionTabAdapter;
import com.example.furniturecom.Adapter.ExploreCategoryAdapter;
import com.example.furniturecom.Adapter.FeatureitemAdapter;
import com.example.furniturecom.Adapter.HandPickAdapter;
import com.example.furniturecom.Model.BestSellerModel;
import com.example.furniturecom.Model.Collectiontabitems;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.Model.FeaturedItems;
import com.example.furniturecom.Model.HandpickModel;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class CollectionActivity extends AppCompatActivity {
    RecyclerView recyclerView,recyclerView1 ,recyclerView2, recyclerView3;
    List<FeaturedItems> featuredItems;
    List<BestSellerModel> bestSellerModels;
    List<Collectiontabitems> collectiontabitems;
    List<HandpickModel> handpickModels;

    ImageView collectionprofile,collectionbeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        recyclerView = findViewById(R.id.featuedbestrecycler);
        recyclerView1=findViewById(R.id.handpick);
        recyclerView2=findViewById(R.id.collectiontab);
        recyclerView3=findViewById(R.id.featuredrecycler);
        collectionbeg=findViewById(R.id.collectionbag);
        collectionprofile=findViewById(R.id.collectionprofile);


        recyclerView.setHasFixedSize(true);
        bestSellerModels = new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 5; i++) {
            bestSellerModels.add(new BestSellerModel());
        }
        recyclerView.setAdapter(new BestsellerAdapter(this,bestSellerModels));



        collectiontabitems = new ArrayList<>();
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 6; i++) {
            collectiontabitems.add(new Collectiontabitems("Featured"));
        }
        recyclerView2.setAdapter(new CollectionTabAdapter(this,collectiontabitems));

        recyclerView1.setHasFixedSize(true);
        handpickModels = new ArrayList<>();
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 5; i++) {
            handpickModels.add(new HandpickModel());
        }
        recyclerView1.setAdapter(new HandPickAdapter(this,handpickModels));

        recyclerView3.setHasFixedSize(true);
        featuredItems = new ArrayList<>();
        recyclerView3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 5; i++) {
            featuredItems.add(new FeaturedItems());
        }
        recyclerView3.setAdapter(new FeatureitemAdapter(this,featuredItems));

     collectionprofile.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(CollectionActivity.this,ProfileActivity.class);
             startActivity(intent);
         }
     });
        collectionbeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CollectionActivity.this,MyBegActivity.class);
                startActivity(intent);
            }
        });

    }
}
