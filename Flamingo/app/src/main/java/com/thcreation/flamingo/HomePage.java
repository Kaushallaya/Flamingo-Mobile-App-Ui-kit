package com.thcreation.flamingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void goTrend(View v){
        Intent intent = new Intent(this,StorePage.class);
        startActivity(intent);
    }

    public void readBook(View v){
        Intent intent = new Intent(this,BookPage.class);
        startActivity(intent);
    }

    public void goCategory(View v){
        Intent intent = new Intent(this,Categories.class);
        startActivity(intent);
    }

    public void goAuthor(View v){
        Intent intent = new Intent(this,Authors.class);
        startActivity(intent);
    }

    public void goProfile(View v){
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
    }
}