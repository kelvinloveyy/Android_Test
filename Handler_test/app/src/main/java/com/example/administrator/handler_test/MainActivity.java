package com.example.administrator.handler_test;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private Button st_button = null;
    private Button ed_button =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        st_button = (Button)findViewById(R.id.button_st);
        st_button.setOnClickListener(new St_Button_listener());
        ed_button=(Button)findViewById(R.id.button_end);
        ed_button.setOnClickListener(new Ed_Button_Listener());

    }
    Handler handler =new Handler();
    class St_Button_listener implements OnClickListener{

        @Override
        public void onClick(View v) {
            //2、调用Handler的post方法，将要执行的线程对象添加到队列当中，同样下面也有停止按钮
            handler.post(updateThread);
        }

    }
    class Ed_Button_Listener implements OnClickListener {

        @Override
        public void onClick(View v) {
            handler.removeCallbacks(updateThread);
        }
    }
    Runnable updateThread =  new Runnable(){
        @Override
        public void run() {
            System.out.println("UpdateThread");
            Log.v("tag", "UpdateThread");
            //在run方法内部，执行postDelayed或者是post方法
            handler.postDelayed(updateThread, 2000);
        }

    };
}
