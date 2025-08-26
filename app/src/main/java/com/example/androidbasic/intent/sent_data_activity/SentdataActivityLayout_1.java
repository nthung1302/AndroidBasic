package com.example.androidbasic.intent.sent_data_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.animation;
import com.example.androidbasic.helpers.fullscreen;

public class SentdataActivityLayout_1 extends fullscreen {

    TextView textView, btn;
    int REQUEST_CODE_EDIT = 123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sentdata_layout_1);

        textView = findViewById(R.id.text);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            animation.click(btn);
            Intent intent = new Intent(SentdataActivityLayout_1.this, SentdataActivityLayout_2.class);
            startActivityForResult(intent, REQUEST_CODE_EDIT);
        });

    }
    public void onActivityResult(int requetCode, int resultCode, Intent intent){
        if (requetCode == REQUEST_CODE_EDIT && resultCode == RESULT_OK && intent != null){
            String data = intent.getStringExtra("sent");
            textView.setText(data);
        }
        super.onActivityResult(requetCode, resultCode, intent);
    }
}