package com.example.b00686396.clearthoughtfinalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
 This is just a very basic activity which simply tells the user a little bit about the app
 and how it should be used to the make the most out of it.
 */
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    // This method simply returns to the previous activity which is the Main Menu
    public void backButtonClick(View view) {
        finish();
    }

}
