package com.example.ap_datatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void click1(View view) {
        //数据的回传
        //创建回传用的意图
        Intent intent2=new Intent();
        intent2.putExtra("username","tom123");
        //将intent2意图作为回传数据的载体，将它设置为result，结果编码是888
        setResult(888,intent2);
        //关闭当前activity，当前页面。
        finish();



    }
}