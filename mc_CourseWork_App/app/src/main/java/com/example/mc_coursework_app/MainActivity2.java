package com.example.mc_coursework_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btnHalqiyah,btnLisaveyah,btnTarfiyah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btnHalqiyah=findViewById(R.id.buttonH);
        btnLisaveyah=findViewById(R.id.buttonL);
        btnTarfiyah=findViewById(R.id.buttonT);


        btnHalqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,LearnActivity.class);
                intent.putExtra("value",btnHalqiyah.getText().toString());
                startActivity(intent);
            }
        });
        btnLisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,LearnActivity.class);
                intent.putExtra("value",btnLisaveyah.getText().toString());
                startActivity(intent);
            }
        });
        btnTarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,LearnActivity.class);
                intent.putExtra("value",btnTarfiyah.getText().toString());
                startActivity(intent);
            }
        });
    }

}