package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.furniturecom.R;

public class ShippingActivity extends AppCompatActivity {
    Button continuepayment;
    TextView shippingback,shippingprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping);
        continuepayment=findViewById(R.id.continuepayment);
        shippingback=findViewById(R.id.shippingback);
        shippingprofile=findViewById(R.id.profileshpping);

        continuepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ShippingActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
        shippingback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ShippingActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        shippingprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ShippingActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });


    }
}
