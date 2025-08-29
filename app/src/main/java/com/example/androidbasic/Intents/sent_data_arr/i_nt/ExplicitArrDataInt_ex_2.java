package com.example.androidbasic.Intents.sent_data_arr.i_nt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class ExplicitArrDataInt_ex_2 extends fullscreen {

    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_data_int_page_2);

        listView = findViewById(R.id.lview);
        Intent intent = getIntent();
        int[] arr = intent.getIntArrayExtra("data");

        ArrayList<String> arrayList = new ArrayList<>();

        assert arr != null;
        for (int value : arr){
            arrayList.add(String.valueOf(value));
        }
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}