package com.example.androidbasic.Intents.sent_data_arr.f_loat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.animation;
import com.example.androidbasic.Helpers.fullscreen;

public class ExplicitArrDataFloat_ex_1 extends fullscreen {

    ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_data_float_page_1);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            animation.click(btn);

            Intent intent = new Intent(ExplicitArrDataFloat_ex_1.this, ExplicitArrDataFloat_ex_2.class);

            float[] arr = {
                    1.152f , 2.142f, 3.2424f
            };
            intent.putExtra("data", arr);
            startActivity(intent);
        });
    }
}