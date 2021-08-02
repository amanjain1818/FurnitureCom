package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.furniturecom.R;

public class KewChairInfo extends AppCompatActivity {
    Button beg;
    TextView chairinfocounts;
ImageView kewchairinfoback,kewchairinfobag,kewchairinfoprofile,chairinforemove,chairinfoadd;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kew_chair_info);
        beg=findViewById(R.id.addtobeg);
        kewchairinfobag=findViewById(R.id.kewchairinfobag);
        kewchairinfoback=findViewById(R.id.kewchairinfoback);
        chairinforemove=findViewById(R.id.chairinforemove);
        chairinfoadd=findViewById(R.id.chairinfoadd);
        chairinfocounts=findViewById(R.id.chairinfocounts);


        kewchairinfoprofile=findViewById(R.id.kewchairinfoprofile);
        beg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(KewChairInfo.this,MyBegActivity.class);
                startActivity(intent);
            }
        });
        kewchairinfoprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(KewChairInfo.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        kewchairinfoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(KewChairInfo.this,KewChairsModern.class);
                startActivity(intent);
            }
        });

        kewchairinfobag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(KewChairInfo.this,MyBegActivity.class);
                startActivity(intent);
            }
        });
        chairinfoadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chairinfocounts.setText(String.valueOf(Integer.parseInt( chairinfocounts.getText().toString()) + 1));
            }
        });
        chairinforemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(! chairinfocounts.getText().toString().equals("0")){
                    chairinfocounts.setText(String.valueOf(Integer.parseInt( chairinfocounts.getText().toString()) - 1));
                }}
        });




    }
}
