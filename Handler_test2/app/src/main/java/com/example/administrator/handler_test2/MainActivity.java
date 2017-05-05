package com.example.administrator.handler_test2;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar bar = null;
    Button startButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        bar = (ProgressBar)findViewById(R.id.bar);
        startButton = (Button)findViewById(R.id.stButton);
        startButton.setOnClickListener(new ButtonListener());
    }
    Handler updateBarHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            bar.setProgress(msg.arg1);
            updateBarHandler.post(updateThread);
        }

    };
    class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            bar.setVisibility(View.VISIBLE);
            updateBarHandler.post(updateThread);
        }
    }

    Runnable updateThread = new Runnable(){
        int i = 0 ;
        @Override
        public void run() {
            System.out.println("Begin Thread");
            i = i + 10 ;
            //得到一个消息对象，Message类是有Android操作系统提供
            Message msg = updateBarHandler.obtainMessage();
            //将msg对象的arg1参数的值设置为i,用arg1和arg2这两个成员变量传递消息，优点是系统性能消耗较少
            msg.arg1 = i ;
            try {
                //设置当前显示睡眠1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //将msg对象加入到消息队列当中
            updateBarHandler.sendMessage(msg);
            if( i == 100){
                //如果当i的值为100时，就将线程对象从handler当中移除
                updateBarHandler.removeCallbacks(updateThread);
            }
        }
    };
}
