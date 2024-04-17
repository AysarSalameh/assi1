package com.example.assi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private ImageView imag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imag = findViewById(R.id.imageView2);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("data");
        if(msg.equals("Multiplication table 1")){
            imag.setImageResource(R.drawable.multiplicationtable1);
        } else if (msg.equals("Multiplication table 2")){
            imag.setImageResource(R.drawable.multiplicationtable2);

        }
        else if (msg.equals("Multiplication table 3")){
            imag.setImageResource(R.drawable.multiplicationtable3);

        }
        else if (msg.equals("Multiplication table 4")){
            imag.setImageResource(R.drawable.multiplicationtable4);

        }
        else if (msg.equals("Multiplication table 5")){
            imag.setImageResource(R.drawable.multiplicationtable5);

        }
        else if (msg.equals("Multiplication table 6")){
            imag.setImageResource(R.drawable.multiplicationtable6);

        }
        else if (msg.equals("Multiplication table 7")){
            imag.setImageResource(R.drawable.multiplicationtable7);

        }
        else if (msg.equals("Multiplication table 8")){
            imag.setImageResource(R.drawable.multiplicationtable8);

        }
        else if (msg.equals("Multiplication table 9")){
            imag.setImageResource(R.drawable.multiplicationtable9);

        }
        else if (msg.equals("Multiplication table 10")){
            imag.setImageResource(R.drawable.multiplicationtable10);

        }
    }
}
