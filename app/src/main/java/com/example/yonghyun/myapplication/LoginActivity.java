package com.example.yonghyun.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yonghyun on 2017-01-10.
 */

public class LoginActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        Intent intent=getIntent();
    }

}
