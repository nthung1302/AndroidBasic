package com.example.androidbasic.Intents.sent_data_obj;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class SentDataObjectActivity_Page_2 extends fullscreen {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sent_data_object_page_2);

        listView = findViewById(R.id.lview);

        ArrayList persion = getIntent().getStringArrayListExtra("data");

        assert persion != null;
        ArrayAdapter adapter = new ArrayAdapter(SentDataObjectActivity_Page_2.this, android.R.layout.simple_list_item_1, persion);
        listView.setAdapter(adapter);
    }
}