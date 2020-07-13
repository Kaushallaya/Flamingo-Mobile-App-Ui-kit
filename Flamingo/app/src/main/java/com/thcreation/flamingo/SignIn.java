package com.thcreation.flamingo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void submit(View v){
        Intent intent = new Intent(this,UserPage.class);
        startActivity(intent);
    }

    public void goSignup(View v){
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }
}