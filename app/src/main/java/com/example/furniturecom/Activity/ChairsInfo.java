package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.furniturecom.Adapter.ColorAdapter;
import com.example.furniturecom.Model.Colordots;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class ChairsInfo extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Colordots> colordots;
    ImageView kew , kewback,kewbag,kewprofile , chairsadd,chairsremove;
    TextView chairscounts;
    Button chairinfobag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chairs_info);
        recyclerView=findViewById(R.id.colordotss);
        kew=findViewById(R.id.kew);
        kewback=findViewById(R.id.kewback);
        kewbag=findViewById(R.id.kewbeg);
        kewprofile=findViewById(R.id.kewprofile);
        chairinfobag=findViewById(R.id.chairinfobag);

        chairscounts=findViewById(R.id.chairscount);
        chairsadd=findViewById(R.id.chairsadd);
        chairsremove=findViewById(R.id.chairsromove);

        colordots = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 4; i++) {
            colordots.add(new Colordots());
        }
        recyclerView.setAdapter(new ColorAdapter(this, colordots));
        kew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChairsInfo.this,KewChairsModern.class);
                startActivity(intent);
            }
        });

        kewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChairsInfo.this,ChairsActivity.class);
                startActivity(intent);
            }
        });
        kewbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChairsInfo.this,MyBegActivity.class);
                startActivity(intent);
            }
        });
        kewprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChairsInfo.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

          chairsadd.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  chairscounts.setText(String.valueOf(Integer.parseInt(chairscounts.getText().toString()) + 1));
              }
          });
        chairsremove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!chairscounts.getText().toString().equals("0")){
                chairscounts.setText(String.valueOf(Integer.parseInt(chairscounts.getText().toString()) - 1));
            }}
        });

        chairinfobag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ChairsInfo.this,MyBegActivity.class);
                startActivity(intent);
            }
        });




    }
}
