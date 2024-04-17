package com.example.assi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
private  ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        set();
        String[] tabels = new String[] {"Multiplication table 1", "Multiplication table 2", "Multiplication table 3" ,
                "Multiplication table 4", "Multiplication table 5", "Multiplication table 6", "Multiplication table 7",
                "Multiplication table 8", "Multiplication table 9", "Multiplication table 10"};
        List<String> tabelss_list = new ArrayList<>(Arrays.asList(tabels));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, tabelss_list);
        lst.setAdapter(arrayAdapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = (String) parent.getItemAtPosition(position);
                String message = "" + selectedItem;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("data", message);
                startActivity(intent);

            }
        });
    }
    public void set(){
        lst=findViewById(R.id.lstview);
    }
}