package com.example.mc_coursework_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LearnActivity extends AppCompatActivity {

    TextView textview;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        textview=findViewById(R.id.textView3);
        imageView=findViewById(R.id.imageView);

        Intent intent=getIntent();
        textview.setText(intent.getStringExtra("value"));


    }
}