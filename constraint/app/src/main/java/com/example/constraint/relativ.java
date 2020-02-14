package com.example.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class relativ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativ);
    }
    public void hmm(View view) {
        Intent i = new Intent(relativ.this, MainActivity.class);
        startActivity(i);
    }
}
