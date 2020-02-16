package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.TypeEvaluator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }
    public void back (View view){
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);

        startActivity(intent);
    }
}
