package com.example.furniturecom.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.furniturecom.R;

public class LoginActivity extends AppCompatActivity {
    TextView sigup;
    EditText email,password;
    Button login;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=findViewById(R.id.login);
        sigup=findViewById(R.id.signup);
        password=findViewById(R.id.userpassword);
        email=findViewById(R.id.useremail);
        sharedPreferences = getSharedPreferences("save", Context.MODE_PRIVATE);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (email.length() == 0 ) {
//                    email.setError("Don't blank");
//                    password.setError("Don't blank");
//                } else if (!sharedPreferences.getString("email", "").isEmpty()
//                        && (!sharedPreferences.getString("password", "").isEmpty())) {
//                    Toast.makeText(LoginActivity.this, "login", Toast.LENGTH_LONG).show();
//
//
//                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
//                  i.putExtra("set data", email.getText().toString());
//                    startActivity(i);
//                } else {
//                    Toast.makeText(LoginActivity.this, "Please Create account first", Toast.LENGTH_LONG).show();
//                }
//            }
//        });


                Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent am=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(am);
            }
        });

    }
}
