package com.example.androidbasic.intent.sent_data_bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

public class SentDataBundleActivity_Page_1 extends fullscreen {

    ImageView btn;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sent_data_bundle_page1);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            intent = new Intent(SentDataBundleActivity_Page_1.this, SentDataBundleActivity_Page_2.class);
            String[] stringArr = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C"};

            PersionModelSentDataBundle persion = new PersionModelSentDataBundle("Nguyen Van A", 10, "CD FPT POLITECHNIC");

            Bundle bundle = new Bundle();

            bundle.putString("bunString", "Bundle String");
            bundle.putInt("bunInt", 2);
            bundle.putStringArray("bunStringArr", stringArr);
            bundle.putSerializable("bunObject", persion);

            intent.putExtra("data", bundle);

            startActivity(intent);
        });
    }
}