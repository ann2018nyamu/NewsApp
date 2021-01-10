package com.example.bitcoinapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername,etPassword;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername =  findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btLogin = findViewById(R.id.bt_login);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("Admin") &&
                etPassword.getText().toString().equals("Admin")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            LoginActivity.this
                    );
                    builder.setIcon(R.drawable.ic_check);
                    builder.setTitle("Login Successful!!!");
                    builder.setMessage("Welcome to Bitcoin Mobile Wallet...");

                    startActivity(new Intent(LoginActivity.this,DashboardActivity.class));



                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }else {
                    Toast.makeText(getApplicationContext(), "Invalid username $ Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}