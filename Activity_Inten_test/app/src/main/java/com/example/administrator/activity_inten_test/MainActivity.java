package com.example.administrator.activity_inten_test;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup radioGroup = null;
    RadioButton currentRadioButton = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        //radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        // 获得单选按钮
        r1 = (RadioButton) findViewById(R.id.a);
        r2 = (RadioButton) findViewById(R.id.b);
        r3 = (RadioButton) findViewById(R.id.c);
        r4 = (RadioButton) findViewById(R.id.d);
        r1.setClickable(true);
        // 监听单选按钮
       // radioGroup.setOnCheckedChangeListener(mChangeRadio);
        Button botton1 = (Button) findViewById(R.id.sure);
        Button botton2 = (Button) findViewById(R.id.cancel);
        botton1.setOnClickListener(new botton1());
        botton2.setOnClickListener(new botton2());
    }

    class botton1 implements OnClickListener {
        @Override
        public void onClick(View v) {
            String a = "";
            if (r1.isChecked()) {
                a = "on";
            } else if (r2.isChecked()) {
                a = "at";
            } else if (r3.isChecked()) {
                a = "of";
            } else if (r4.isChecked()) {
                a = "in";
            }
              /* new 一个Intent 对象，并指定class */
            Intent intent = new Intent();
            //设置Intent对象要启动的Activity
            intent.setClass(MainActivity.this, OtherActivity.class);
            /* new 一个Bundle对象，并将要传递的数据传入 */
            Bundle bundle = new Bundle();
            bundle.putString("ans", a);
			/* 将Bundle 对象assign 给Intent */
            intent.putExtras(bundle);
            //启动指定Activity并等待返回的结果，其中0是请求码，用于标识该请求
            startActivityForResult(intent, 0);
        }
    }

    class botton2 implements View.OnClickListener {
        /*
        (API中查找，android.widget public class RadioGroup
        void clearCheck()
        Clears the selection.
         */
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            radioGroup.clearCheck();
            setTitle("");
        }

    }

/*
    private RadioGroup.OnCheckedChangeListener mChangeRadio = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == r1.getId()) {
                currentRadioButton = r1;
            } else if (checkedId == r2.getId()) {
                currentRadioButton = r2;
            } else if (checkedId == r3.getId()) {
                currentRadioButton = r3;
            } else if (checkedId == r4.getId()) {
                currentRadioButton = r4;
            }
        }
    };
*/
protected void onActivityResult(int requestCode, int resultCode,
                                Intent data) {
// TODO Auto-generated method stub
    super.onActivityResult(requestCode, resultCode, data);
//当requestCode、resultCode同时为0，也就是处理特定的结果
    if (requestCode == 0
            && resultCode == 0) {


/* 取得来自Activity2 的数据，并显示于画面上 */
        Bundle bunde = data.getExtras();
        String a = bunde.getString("ans");


    }
}
}
