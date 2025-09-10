package com.example.androidbasic.Intents.sent_data_arr.s_tring;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.fullscreen;

public class ExplicitArrDataString_ex_2 extends fullscreen {

    ListView lvie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_data_string_page_2);

        lvie = findViewById(R.id.lview);

        Intent intent = getIntent();
        String[] arr = intent.getStringArrayExtra("data");
        ArrayAdapter arrayAdapter = new ArrayAdapter(ExplicitArrDataString_ex_2.this, android.R.layout.simple_list_item_1, arr);
        lvie.setAdapter(arrayAdapter);
    }
}