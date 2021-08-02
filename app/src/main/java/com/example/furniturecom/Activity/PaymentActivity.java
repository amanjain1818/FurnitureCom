package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.furniturecom.R;

public class PaymentActivity extends AppCompatActivity {
Button confrompayment;
TextView paymentback, paymentprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        paymentback=findViewById(R.id.paymentback);
        paymentprofile=findViewById(R.id.paymentprofile);

        confrompayment=findViewById(R.id.conformpayment);
        confrompayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentActivity.this,CongrtsActivity.class);
                startActivity(intent);
            }
        });
        paymentprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });
        paymentback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentActivity.this,ShippingActivity.class);
                startActivity(intent);
            }
        });




    }
}
