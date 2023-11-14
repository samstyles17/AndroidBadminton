package com.example.badminton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private Switch b1,b2,b3;
    private Button b4,b5,b6,b7,b8,b9;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6;
    private int score11=0,score12=0,score21=0,score22=0,score31=0,score32=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.set1);
        b2 = findViewById(R.id.set2);
        b3 = findViewById(R.id.set3);

        b4 = findViewById(R.id.set11);
        b5 = findViewById(R.id.set12);
        b6 = findViewById(R.id.set21);
        b7 = findViewById(R.id.set22);
        b8 = findViewById(R.id.set31);
        b9 = findViewById(R.id.set32);

        tv1 = findViewById(R.id.score11);
        tv2 = findViewById(R.id.score12);
        tv3 = findViewById(R.id.score21);
        tv4 = findViewById(R.id.score22);
        tv5 = findViewById(R.id.score31);
        tv6 = findViewById(R.id.score32);

       b1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               b4.setEnabled(true);
               b5.setEnabled(true);
               b6.setEnabled(false);
               b7.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);
           }
       });

       b2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               b6.setEnabled(true);
               b7.setEnabled(true);
               b4.setEnabled(false);
               b5.setEnabled(false);
               b8.setEnabled(false);
               b9.setEnabled(false);

           }
       });

       b3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               b8.setEnabled(true);
               b9.setEnabled(true);
               b4.setEnabled(false);
               b5.setEnabled(false);
               b6.setEnabled(false);
               b7.setEnabled(false);
           }
       });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score11++;
                tv1.setText(String.valueOf(score11));

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score12++;
                tv2.setText(String.valueOf(score12));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score21++;
                tv3.setText(String.valueOf(score21));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score22++;
                tv4.setText(String.valueOf(score22));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score31++;
                tv5.setText(String.valueOf(score31));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score32++;
                tv6.setText(String.valueOf(score32));
            }
        });
    }
}