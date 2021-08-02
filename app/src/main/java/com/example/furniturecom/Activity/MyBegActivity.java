package com.example.furniturecom.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.example.furniturecom.Adapter.BegitemsAdapter;
import com.example.furniturecom.Adapter.ExplorePopularAdapter;
import com.example.furniturecom.Adapter.KewModernAdapter;
import com.example.furniturecom.Model.Begitems;
import com.example.furniturecom.Model.ExploreItems;
import com.example.furniturecom.Model.FurnitureitemsList;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class MyBegActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Begitems> lists;
    TextView removefurn,contine ;
    Button thanku;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_beg);
          recyclerView=findViewById(R.id.begitemsrecycler);
          removefurn=findViewById(R.id.removefur);
          thanku=findViewById(R.id.thanku);
          contine=findViewById(R.id.contine);

                  lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        for (int i = 0; i < 3; i++) {
            lists.add(new Begitems("Coffe table", "$200"));
        }
        recyclerView.setAdapter(new BegitemsAdapter(this, lists));

       removefurn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MyBegActivity.this,FurnitureItemsActivity.class);
               startActivity(intent);
           }
       });
        thanku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyBegActivity.this, "Thank u for shopping", Toast.LENGTH_SHORT).show();
            }
        });
        contine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MyBegActivity.this,FurnitureItemsActivity.class);
                startActivity(intent);
            }
        });

    }

}

