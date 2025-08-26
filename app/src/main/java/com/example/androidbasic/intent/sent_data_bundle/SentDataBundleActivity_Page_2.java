package com.example.androidbasic.intent.sent_data_bundle;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.androidbasic.R;
import com.example.androidbasic.domain.Persion;
import com.example.androidbasic.helpers.fullscreen;
import com.example.androidbasic.intent.sent_data_obj.SentDataObjectActivity_Page_2;

import java.util.ArrayList;
import java.util.Arrays;

public class SentDataBundleActivity_Page_2 extends fullscreen {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sent_data_bundle_page2);

        listView = findViewById(R.id.lview);

        Bundle bundle = getIntent().getBundleExtra("data");
        if (bundle != null) {
            String strings = bundle.getString("bunString");
            int ints = bundle.getInt("bunInt");
            String[] strings_arr = bundle.getStringArray("bunStringArr");
            Persion persion = (Persion) bundle.getSerializable("bunObject");

            ArrayList<String> arr = new ArrayList<>();
            arr.add(strings);
            arr.add(String.valueOf(ints));
            arr.add(Arrays.toString(strings_arr));
            arr.add(String.valueOf(persion));

            ArrayAdapter adapter = new ArrayAdapter(SentDataBundleActivity_Page_2.this, android.R.layout.simple_list_item_1, arr);
            listView.setAdapter(adapter);
        }
    }
}