package com.example.administrator.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

import android.widget.TextView;


public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle bunde = this.getIntent().getExtras();
        String sex = bunde.getString("sex");
        double height = bunde.getDouble("height");
        String sexText = "";
        if (sex.equals("M")) {
            sexText = "男性";
        }
        else
        {
        sexText="女性";
        }
String weight=this.get(sex,height);


    }
}
