package com.example.androidbasic.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

public class IntentActionViewActivity extends fullscreen {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_action_view);

        img = findViewById(R.id.img);

        img.setOnClickListener(v -> {
            Uri data = Uri.parse("https://github.com");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(data);
            startActivity(intent);
        });
    }
}