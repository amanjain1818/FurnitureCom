package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.furniturecom.R;

public class CongrtsActivity extends AppCompatActivity {
    TextView profilecongrts;
    Button continueshopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrts);
        profilecongrts=findViewById(R.id.profilecongrts);
        continueshopping=findViewById(R.id.continueshopping);

        profilecongrts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CongrtsActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        continueshopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CongrtsActivity.this,FurnitureItemsActivity.class);
                startActivity(intent);
            }
        });
    }
}
