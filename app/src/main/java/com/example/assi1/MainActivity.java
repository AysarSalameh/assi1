package com.example.assi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnmul;
private Button btnquiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set();
    }

    public void btnmul(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void set (){
        btnmul=findViewById(R.id.btnmul);
        btnquiz=findViewById(R.id.btnquiz);
    }

    public void btnquiz(View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}
