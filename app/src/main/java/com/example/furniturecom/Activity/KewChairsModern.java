package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.furniturecom.Adapter.FurnitureitemsAdapter;
import com.example.furniturecom.Adapter.KewModernAdapter;
import com.example.furniturecom.Model.FurnitureitemsList;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class KewChairsModern extends AppCompatActivity {
    RecyclerView recyclerView;
    List<FurnitureitemsList> lists;
    TextView moreinfo,moderncounts;
    Button kewchairbeg;
    ImageView kewchairmodernback,kewchairmodernbag,kewchairmodernprofile,modernremove,modernadd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kew_chairs_modern);
        recyclerView=findViewById(R.id.kewchairsmodernrecycler);
        moreinfo=findViewById(R.id.moreinfo);
        kewchairmodernback=findViewById(R.id.kewchairmodernback);
        kewchairmodernbag=findViewById(R.id.kewchairmodernbag);
        kewchairmodernprofile=findViewById(R.id.kewchairmodernprofile);
        kewchairbeg=findViewById(R.id.kewchairbeg);

        moderncounts=findViewById(R.id.moderncount);
        modernadd=findViewById(R.id.modermadd);
        modernremove=findViewById(R.id.modernremove);


        lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        for (int i = 0; i < 10; i++) {
            lists.add(new FurnitureitemsList("Kew Chairs", "chair is","breakble","2000"));
        }
        recyclerView.setAdapter(new KewModernAdapter(this, lists));

        moreinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KewChairsModern.this,KewChairInfo.class);
                startActivity(intent);
            }
        });

        kewchairmodernback .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KewChairsModern.this,ChairsInfo.class);
                startActivity(intent);
            }
        });

        kewchairmodernbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KewChairsModern.this,MyBegActivity.class);
                startActivity(intent);
            }
        });


        kewchairmodernprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KewChairsModern.this,ProfileActivity.class);
                startActivity(intent);
            }
        });


        modernadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moderncounts.setText(String.valueOf(Integer.parseInt( moderncounts.getText().toString()) + 1));
            }
        });
        modernremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(! moderncounts.getText().toString().equals("0")){
                    moderncounts.setText(String.valueOf(Integer.parseInt( moderncounts.getText().toString()) - 1));
                }}
        });


        kewchairbeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(KewChairsModern.this,MyBegActivity.class);
                startActivity(intent);
            }
        });

    }
}
