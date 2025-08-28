package com.example.androidbasic.list_view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class ListViewActivityBasic extends fullscreen {
    ListView listView;
    private ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_basic);

        listView = findViewById(R.id.lview);

        arrayList = new ArrayList<>();
        arrayList.add("Nguyen Van A");
        arrayList.add("Nguyen Van B");
        arrayList.add("Nguyen Van C");

        ArrayAdapter adapter = new ArrayAdapter(ListViewActivityBasic.this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(ListViewActivityBasic.this, arrayList.get(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}