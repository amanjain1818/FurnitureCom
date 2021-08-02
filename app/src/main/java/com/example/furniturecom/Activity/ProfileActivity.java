package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.furniturecom.Adapter.ExploreCategoryAdapter;
import com.example.furniturecom.Adapter.UserInformationAdapter;
import com.example.furniturecom.Model.ExploreCategoryList;
import com.example.furniturecom.Model.UserInformation;
import com.example.furniturecom.R;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<UserInformation> lists;
    TextView shipping,payment,changepassword;
    ImageView profilebag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        recyclerView=findViewById(R.id.userinformation);
        shipping=findViewById(R.id.usershiping);
        payment=findViewById(R.id.userpayment);
        changepassword=findViewById(R.id.userchangepass);
        profilebag=findViewById(R.id.profilebag);


        lists = new ArrayList<>();
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        for (int i = 0; i < 1; i++) {
            lists.add(new UserInformation("Aman jain","jainaman113@gmail.com"));
        }
        recyclerView.setAdapter(new UserInformationAdapter(this, lists));

shipping.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(ProfileActivity.this,ShippingActivity.class);
        startActivity(intent);
    }
});
        changepassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProfileActivity.this,ChangePassword.class);
                startActivity(intent);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProfileActivity.this,AddCardActivity.class);
                startActivity(intent);
            }
        });
        profilebag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProfileActivity.this,MyBegActivity.class);
                startActivity(intent);
            }
        });



    }
}
