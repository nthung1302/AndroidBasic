package com.example.androidbasic.intent.explicit_arr_data.i_nt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.animation;
import com.example.androidbasic.helpers.fullscreen;

public class ExplicitArrDataInt_ex_1 extends fullscreen {

    ImageView btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_arr_data_int_ex_1);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            animation.click(btn);

            Intent intent = new Intent(ExplicitArrDataInt_ex_1.this, ExplicitArrDataInt_ex_2.class);

            int[] arr = {
                    1, 2, 3
            };
            intent.putExtra("data", arr);
            startActivity(intent);
        });
    }
}