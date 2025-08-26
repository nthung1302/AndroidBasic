package com.example.androidbasic.intent.explicit_arr_data.i_nt;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class ExplicitArrDataInt_ex_2 extends fullscreen {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_explicit_arr_data_int_ex_2);

        listView = findViewById(R.id.lview);
        Intent intent = getIntent();
        int[] arr = intent.getIntArrayExtra("data");

        ArrayList<String> arrayList = new ArrayList<>();

        for (int value : arr){
            arrayList.add(String.valueOf(value));
        }
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
    }
}