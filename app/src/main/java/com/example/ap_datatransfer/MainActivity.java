package com.example.ap_datatransfer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View view) {
        //创建一个意图
        Intent intent1=new Intent(MainActivity.this,SecondActivity.class);
        //此时intent1就变为寻求result的一个意图，同时这个意图的请求编码是666
        startActivityForResult(intent1,666);
    }

    @Override
    //requestCode:接受请求编码，resultCode：接受结果编码，data：接受回传的intent对象。此方法是在有回传数据产生时自动执行。
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==666&&resultCode==888){
            String msg=data.getStringExtra("username");
            Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG).show();


        }
    }
}