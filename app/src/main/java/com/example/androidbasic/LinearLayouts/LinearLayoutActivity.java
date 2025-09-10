package com.example.androidbasic.LinearLayouts;

import android.os.Bundle;

import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.fullscreen;

public class LinearLayoutActivity extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);
    }
}