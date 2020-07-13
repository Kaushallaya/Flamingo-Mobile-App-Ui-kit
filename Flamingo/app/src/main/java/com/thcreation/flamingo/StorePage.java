package com.thcreation.flamingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_page);
    }

    public void goHome(View v){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
}