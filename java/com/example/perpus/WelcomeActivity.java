package com.example.perpus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        Button addButton = findViewById(R.id.addBooks);
        Button showButton = findViewById(R.id.showBooks);
        Button Logout = findViewById(R.id.Logout);

        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this , AddBookActivity.class);
                startActivity(intent);
            }
        });
        showButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WelcomeActivity.this , ShowBooksActivity.class);
                startActivity(i);
            }
        });
        Logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WelcomeActivity.this , MainActivity.class);
                startActivity(i);
            }
        });


    }
}