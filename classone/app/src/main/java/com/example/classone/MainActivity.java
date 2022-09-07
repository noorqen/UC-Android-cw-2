package com.example.classone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etfirstnumber = findViewById(R.id.editTextTextFirstNumber);
        EditText etsecondnumber = findViewById(R.id.editTextTextSecondNumber);
        TextView textresult = findViewById(R.id.textViewResult);
        Button addbutton = findViewById(R.id.addbutton);
        Button subbutton = findViewById(R.id.subbutton);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String no1 = etfirstnumber.getText().toString();
                int x = Integer.parseInt(no1);
                String no2 = etsecondnumber.getText().toString();
                int y = Integer.parseInt(no2);

                int z = sum(x , y);
                textresult.setText(String.valueOf(z));


            }
        });
        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String no1 = etfirstnumber.getText().toString();
                int x = Integer.parseInt(no1);
                String no2 = etsecondnumber.getText().toString();
                int y = Integer.parseInt(no2);

                int w = diff(x , y);
                textresult.setText(String.valueOf(w));
            }
        });
    }
    public int sum(int x, int y){
       int a = x + y;
        return a;
    }
    public int diff(int x, int y){
        int b = x - y;
        return b;
    }
}