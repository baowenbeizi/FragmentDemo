
/*
 *  SecondFragment.java, 2021-10-07
 *
 *  Copyright 2021 rongjielin, All rights reserved.
 *
 */

package com.example.fragmentdemo;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    private final String tag = "TheSecondFragment";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(tag, "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "onCreate");
    }

    /**
     * 重写onCreateView方法，返回自定义视图
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(tag, "onCreateView");
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(tag, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(tag, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(tag, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(tag, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(tag, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(tag, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(tag, "onDetach");
    }
}
