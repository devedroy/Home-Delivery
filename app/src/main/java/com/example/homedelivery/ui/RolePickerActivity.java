package com.example.homedelivery.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.homedelivery.R;

public class RolePickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_picker);
    }

    public void buyProducts(View view) {
        startActivity(new Intent(RolePickerActivity.this, ItemPickerActivity.class));
    }
}