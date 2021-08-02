package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.furniturecom.R;

public class AddCardActivity extends AppCompatActivity {
    Button add;
    TextView removecard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);
        removecard=findViewById(R.id.removecard);
        add=findViewById(R.id.addcard);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AddCardActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
        removecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AddCardActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
