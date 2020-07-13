package com.thcreation.flamingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BookPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);
    }

    public void readNow(View v){
        Intent intent = new Intent(this,ReadingPage.class);
        startActivity(intent);
    }

    public void goStore(View v){
        Intent intent = new Intent(this,StorePage.class);
        startActivity(intent);
    }

    public void goHome(View v){
        Intent intent = new Intent(this,HomePage.class);
        startActivity(intent);
    }
}