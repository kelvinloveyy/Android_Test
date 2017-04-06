package com.example.administrator.logcat_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    private static final String LIFT_TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(MainActivity.LIFT_TAG,"SecondActivity--->onCreate");
        setContentView(R.layout.activity_second);
    }
    protected void onDestroy() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG,"FirstActivity --->onDestory");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstActivity --->onPause");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstActivity --->onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstActivity --->onResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstActivity --->onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Log.v(MainActivity.LIFT_TAG, "FirstActivity --->onStop");
        super.onStop();
    }
}
