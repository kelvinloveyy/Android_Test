package com.example.administrator.logcat_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   // private  Button buttton;
    static final String LIFT_TAG="LogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.LIFT_TAG,"FirstActivity ---> onCreate");
        Button button = (Button)findViewById(R.id.button);
        button.setText("FuckActivity");
        button.setOnClickListener(new ButtonOnClickListener());
    }
    class ButtonOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,SecondActivity.class);
            MainActivity.this.startActivity(intent);
        }
    }
    @Override
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
