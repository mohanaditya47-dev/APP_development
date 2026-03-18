package com.example.project_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        b1=(Button) findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(i);
                finish();
            }
        });
        b2 = (Button) findViewById(R.id.button13);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent a = new Intent(MainActivity4.this, MainActivity6.class);
                 startActivity(a);
                 finish();
            }
        });
        b3 = (Button) findViewById(R.id.button17);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity4.this, MainActivity7.class);
                startActivity(b);
                finish();
            }
        });
        b4 = (Button) findViewById(R.id.button21);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(MainActivity4.this, MainActivity8.class);
                startActivity(c);
                finish();
            }
        });
        b5 = (Button) findViewById(R.id.button24);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(MainActivity4.this, MainActivity9.class);
                startActivity(d);
                finish();
            }
        });
        b6 = (Button) findViewById(R.id.button27);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(MainActivity4.this, MainActivity10.class);
                startActivity(e);
                finish();
            }
        });
        b7=(Button) findViewById(R.id.button30);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(MainActivity4.this, MainActivity11.class);
                startActivity(f);
                finish();
            }
        });
        b8 = (Button) findViewById(R.id.button34);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity4.this, MainActivity12.class);
                startActivity(g);
                finish();
            }
        });
        b9 = (Button) findViewById(R.id.button35);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(MainActivity4.this, MainActivity13.class);
                startActivity(h);
                finish();
            }
        });
        b10 = (Button) findViewById(R.id.button36);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this, MainActivity14.class);
                startActivity(i);
                finish();
            }
        });
        b11 = (Button) findViewById(R.id.button43);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity4.this, MainActivity15.class);
                startActivity(j);
                finish();
            }
        });
        b12 = (Button) findViewById(R.id.button58);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(MainActivity4.this, MainActivity22.class);
                startActivity(k);
                finish();
            }
        });
    }
}
