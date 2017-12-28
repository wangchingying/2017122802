package com.cyw.a2017122802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
    }
    public void click1(View v)
    {
        Intent it=new Intent();
        it.setAction("DD123123");
        it = Intent.createChooser(it, "請選擇一個App 來執行!");
        startActivity(it);

    }
}
