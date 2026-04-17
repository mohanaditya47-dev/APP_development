package com.example.project_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity5 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    EditText e1,e2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        e1 = (EditText) findViewById(R.id.editTextText8);
        e2 = (EditText) findViewById(R.id.editTextText9);
        t1 = (TextView) findViewById(R.id.textView5);
        b1 = (Button)findViewById(R.id.button8);
        b2 = (Button)findViewById(R.id.button10);
        b3 = (Button)findViewById(R.id.button9);
        b4 = (Button)findViewById(R.id.button11);
        b5 = (Button)findViewById(R.id.button12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = e1.getText().toString().trim();
                String num2Str = e2.getText().toString().trim();
                if (!num1Str.isEmpty() && !num2Str.isEmpty())
                {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = num1 + num2;
                    t1.setText(String.valueOf(result));
                }
                else
                {
                    Toast.makeText(MainActivity5.this, "Invalid entry", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = e1.getText().toString().trim();
                String num2Str = e2.getText().toString().trim();
                if (!num1Str.isEmpty() && !num2Str.isEmpty())
                {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = num1 - num2;
                    t1.setText(String.valueOf(result));
                }
                else
                {
                    Toast.makeText(MainActivity5.this, "Invalid entry", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = e1.getText().toString().trim();
                String num2Str = e2.getText().toString().trim();
                if (!num1Str.isEmpty() && !num2Str.isEmpty())
                {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    double result = num1 * num2;
                    t1.setText(String.valueOf(result));
                }
                else
                {
                    Toast.makeText(MainActivity5.this, "Invalid entry", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1Str = e1.getText().toString().trim();
                String num2Str = e2.getText().toString().trim();
                if (!num1Str.isEmpty() && !num2Str.isEmpty())
                {
                    double num1 = Double.parseDouble(num1Str);
                    double num2 = Double.parseDouble(num2Str);
                    if (num2 == 0) {
                        Toast.makeText(MainActivity5.this, "division not possible", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        double result = num1 / num2;
                        t1.setText(String.valueOf(result));
                    }
                }
                else
                {
                    Toast.makeText(MainActivity5.this, "Invalid entry", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(i);
                finish();
            }
        });
    }
}