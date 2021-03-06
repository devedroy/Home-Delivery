package com.example.homedelivery.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.homedelivery.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void createAccount(View view) {
        startActivity(new Intent(LoginActivity.this, CreateAccountActivity.class));
    }

    public void login(View view) {
        startActivity(new Intent(LoginActivity.this, RolePickerActivity.class));
    }

    public void forgotPassword(View view) {
        startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
    }
}