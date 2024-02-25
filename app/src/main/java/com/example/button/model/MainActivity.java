package com.example.button.model;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.button.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method called when the "Sign Up" button is clicked
    public void onSignupClicked(View view) {
        // Start the SignupActivity
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    // Method called when the "Login" button is clicked
    public void onLoginClicked(View view) {
        // Start the LoginActivity
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}


