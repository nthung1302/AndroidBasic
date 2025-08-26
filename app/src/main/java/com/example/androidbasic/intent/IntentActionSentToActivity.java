package com.example.androidbasic.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

public class IntentActionSentToActivity extends fullscreen {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_action_view);

        img = findViewById(R.id.img);

        img.setOnClickListener(v -> {

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SENDTO);
            intent.putExtra("sms_body", "Hello Word");
            intent.setData(Uri.parse("sms:191"));
            startActivity(intent);
        });
    }
}