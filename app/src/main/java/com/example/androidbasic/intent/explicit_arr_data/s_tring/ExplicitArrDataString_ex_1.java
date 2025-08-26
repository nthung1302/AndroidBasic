package com.example.androidbasic.intent.explicit_arr_data.s_tring;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.animation;
import com.example.androidbasic.helpers.fullscreen;

public class ExplicitArrDataString_ex_1 extends fullscreen {

    ImageView button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_arr_data_string_ex_1);

        button = findViewById(R.id.btn);

        button.setOnClickListener(v -> {
            animation.click(button);
            Intent intent = new Intent(ExplicitArrDataString_ex_1. this, ExplicitArrDataString_ex_2.class);
            String[] arr = {
                    "banana",
                    "blue"
            };
            intent.putExtra("data", arr);
            startActivity(intent);
        });

    }
}