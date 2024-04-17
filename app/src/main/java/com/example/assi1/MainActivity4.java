package com.example.assi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.color.utilities.Score;

public class MainActivity4 extends AppCompatActivity {
private TextView txtscore;
public static final String scor = "";
private TextView txtqus;
private RadioGroup radioGroup;
private Button done;
private Button next;
private RadioButton radio1;
    private RadioButton radio2;
    private RadioButton radio3;
    private RadioButton radioButton;

    int ans;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        set();

        loadData();
        saveData();
        ramdom();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                if (id != -1) {
                    radioButton = findViewById(id);
                    String str=radioButton.getText().toString();
                    if(Integer.parseInt(str)==ans){
                        score++;
                        txtscore.setText("Score:"+score);
                    }

                }
                ramdom();

            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
                finish();
            }
        });

    }

    public void set (){
        txtscore=findViewById(R.id.txtscore);
        txtqus=findViewById(R.id.txtqus);
        radioGroup=findViewById(R.id.radioGroup);
        done=findViewById(R.id.done);
        next=findViewById(R.id.next);
        radio1=findViewById(R.id.radio1);
        radio2=findViewById(R.id.radio2);
        radio3=findViewById(R.id.radio3);

    }
    public void ramdom(){
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rand = (int) (Math.random() * 11);
        int rand2 = (int) (Math.random() * 11);
        int rand3 = (int) (Math.random() * 3) + 1;
        int number1=array[rand];
        int number2=array[rand2];
         ans=number1*number2;
        String qus=number1+"*"+number2;
        txtqus.setText(qus);
        if(rand3==1){
            int randomNumber = (int) (Math.random() * 90) + 1;
            int randomNumber2 = (int) (Math.random() * 90) + 1;
            if(randomNumber==ans||randomNumber2==ans){
                 randomNumber = (int) (Math.random() * 90) + 1;
                 randomNumber2 = (int) (Math.random() * 90) + 1;
            }
            radio1.setText(ans+"");
            radio2.setText(randomNumber+"");
            radio3.setText(randomNumber2+"");
        } else if (rand3==2){
            int randomNumber = (int) (Math.random() * 90) + 1;
            int randomNumber2 = (int) (Math.random() * 90) + 1;
            if(randomNumber==ans||randomNumber2==ans){
                randomNumber = (int) (Math.random() * 90) + 1;
                randomNumber2 = (int) (Math.random() * 90) + 1;
            }
            radio2.setText(ans+"");
            radio1.setText(randomNumber+"");
            radio3.setText(randomNumber2+"");

        }
        else if (rand3==3){
            int randomNumber = (int) (Math.random() * 90) + 1;
            int randomNumber2 = (int) (Math.random() * 90) + 1;
            if(randomNumber==ans||randomNumber2==ans){
                randomNumber = (int) (Math.random() * 90) + 1;
                randomNumber2 = (int) (Math.random() * 90) + 1;
            }
            radio3.setText(ans+"");
            radio1.setText(randomNumber+"");
            radio2.setText(randomNumber2+"");

        }
        radio1.setChecked(false);
        radio2.setChecked(false);
        radio3.setChecked(false);
    }



    private void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(scor, String.valueOf(score));
        editor.commit();

    }


    private void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences("shared preferences", MODE_PRIVATE);
     txtscore.setText("Old Score"+txtscore.getText()+sharedPreferences.getString(scor, ""));

    }
}