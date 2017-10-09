package com.example.hyejin.study;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hyejin on 2017-09-28.
 * Desc : spalsh 화면
 */

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler(){
            public void handleMessage(Message msg){
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 2000); // 2초 후 넘어가도록 설정.
    }
}