package com.example.androidbasic.GridViews;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.fullscreen;

public class GridViewActivityBasic extends fullscreen {

    GridView gridView;
    String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M" , "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M" , "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M" , "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M" , "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M"};
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_basic);

        gridView = findViewById(R.id.GridViewBasic_gview);

        arrayAdapter = new ArrayAdapter(GridViewActivityBasic.this, android.R.layout.simple_list_item_1, arr);

        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivityBasic.this, "Index " + position, Toast.LENGTH_SHORT).show();
                Toast.makeText(GridViewActivityBasic.this, "Content " + arr[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}