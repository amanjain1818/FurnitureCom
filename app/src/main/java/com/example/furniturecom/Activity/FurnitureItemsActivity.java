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

import com.example.furniturecom.Adapter.CollectionTabAdapter;
import com.example.furniturecom.Adapter.ExploreItemsLeftAdapter;
import com.example.furniturecom.Adapter.FurnitureitemsAdapter;
import com.example.furniturecom.Adapter.FurnituretabAdapter;
import com.example.furniturecom.Model.Collectiontabitems;
import com.example.furniturecom.Model.ExploreItems;
import com.example.furniturecom.Model.FurnitureitemsList;
import com.example.furniturecom.Model.Furnituretabitems;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class FurnitureItemsActivity extends AppCompatActivity {
    RecyclerView recyclerView ,recyclerView1;
    List<Furnituretabitems> furnituretabitems;
    List<FurnitureitemsList> lists;
    ImageView furnitureprofile , furniturebeg , furnitureback;
    TextView userpopular ,product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_items);
        recyclerView=findViewById(R.id.furnicutreitemsre);
        recyclerView1=findViewById(R.id.furnicutreitemstab);
        userpopular=findViewById(R.id.userpopular);
        product=findViewById(R.id.user120);
        furniturebeg=findViewById(R.id.furnicutrebeg);
        furnitureprofile=findViewById(R.id.furnicutreprofilepage);
        furnitureback=findViewById(R.id.furnitureback);

        lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        for (int i = 0; i < 10; i++) {
            lists.add(new FurnitureitemsList("Kew Chair", "chair is a breakable","breakble","$200"));
        }
        recyclerView.setAdapter(new FurnitureitemsAdapter(this, lists));


        furnituretabitems=new ArrayList<>();
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 3; i++) {
            furnituretabitems.add(new Furnituretabitems("Chair"));
        }
        recyclerView1.setAdapter(new FurnituretabAdapter(this,furnituretabitems));



//        userpopular.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Intent intent=new Intent(FurnitureItemsActivity.this,KewChairsModern.class);
//        startActivity(intent);
//
//
//
//    }
//});

        furnitureprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FurnitureItemsActivity.this,ProfileActivity.class) ;
                startActivity(intent);
            }
        });
        furniturebeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FurnitureItemsActivity.this,MyBegActivity.class) ;
                startActivity(intent);
            }
        });
        furnitureback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(FurnitureItemsActivity.this,CollectionActivity.class) ;
                startActivity(intent);
            }
        });




    }
}
