package com.example.androidbasic.intent.sent_data_arr.i_nt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.animation;
import com.example.androidbasic.helpers.fullscreen;

public class ExplicitArrDataInt_ex_1 extends fullscreen {

    ImageView btn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_data_int_page_1);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            animation.click(btn);

            intent = new Intent(ExplicitArrDataInt_ex_1.this, ExplicitArrDataInt_ex_2.class);

            int[] arr = {
                    1, 2, 3
            };
            intent.putExtra("data", arr);
            startActivity(intent);
        });
    }
}