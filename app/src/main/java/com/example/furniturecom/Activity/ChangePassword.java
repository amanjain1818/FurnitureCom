package com.example.furniturecom.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.furniturecom.R;

import javax.security.auth.callback.PasswordCallback;

public class ChangePassword extends AppCompatActivity {
    TextView passwordprofile,passwordback;
         Button  finalchngepassword;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        passwordprofile=findViewById(R.id.passwordprofile);
        passwordback=findViewById(R.id.passwordback);
        finalchngepassword=findViewById(R.id.finalchngepassword);
        builder = new AlertDialog.Builder(this);

        passwordprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChangePassword.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        passwordback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChangePassword.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        finalchngepassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ChangePassword.this, "Password change successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
