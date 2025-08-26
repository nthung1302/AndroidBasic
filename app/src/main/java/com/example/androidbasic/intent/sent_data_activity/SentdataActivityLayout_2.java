package com.example.androidbasic.intent.sent_data_activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.animation;
import com.example.androidbasic.helpers.fullscreen;

public class SentdataActivityLayout_2 extends fullscreen {

    EditText text;
    TextView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sentdata_layout_2);

        text = findViewById(R.id.text);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            animation.click(btn);

            String inputText = text.getText().toString().trim();
            Intent intent = new Intent(SentdataActivityLayout_2.this, SentdataActivityLayout_1.class);
            intent.putExtra("sent", inputText);
            setResult(RESULT_OK, intent);
            finish();

        });
    }
}