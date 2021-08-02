package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.furniturecom.R;
import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {
    TextView loginpage;
    Button facebook,signup;
    TextInputEditText email,password;
    SharedPreferences sp;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        loginpage=findViewById(R.id.loginpage);
        facebook=findViewById(R.id.facebook);
        email=findViewById(R.id.userem);
        password=findViewById(R.id.userpass);
        signup=findViewById(R.id.signup);

        sp = getSharedPreferences("save", Context.MODE_PRIVATE);
        editor=sp.edit();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("email",email.getText().toString());
                editor.putString("password",password.getText().toString());
                editor.commit();

                Intent i=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(i);


            }
        });



        loginpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.facebbok.com"));
                startActivity(intent);
            }
        });

    }
}
