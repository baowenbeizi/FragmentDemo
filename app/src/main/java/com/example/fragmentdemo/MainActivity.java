
/*
 *  MainActivity.java, 2021-10-07
 *
 *  Copyright 2021 rongjielin, All rights reserved.
 *
 */

package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final String tag = "TheMainActivity";
    private Button mBtnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "onCreate");
        mBtnSwitch = findViewById(R.id.btn_main_switch);
        // 首次进入程序时展示FirstFragment
        repalceFrgment(new FirstFragment());
        mBtnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                repalceFrgment(new SecondFragment());
                Log.d(tag, "Switch to second fragment");
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }

    /**
     * 将Fragment控件所展示的视图切换为传入的fragment视图
     */
    private void repalceFrgment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.framelayout_main, fragment);
        // 将当前fragment添加到返回栈中
        transaction.addToBackStack(null);
        transaction.commit();
    }
}