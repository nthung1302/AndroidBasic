package com.example.androidbasic.GridViews.CustomListView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class CustomGridViewActivity_ex_1 extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view_ex_1);

        GridView gridView = findViewById(R.id.GridViewBasic_gview);

        ArrayList<PersionModelGridView_ex_1> arr = new ArrayList<>();

        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van A", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van B", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Thi C", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van D", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van E", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van F", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Thi G", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Thi H", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van I", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van J", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van K", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Thi L", "DHCN DONG A"));
        arr.add(new PersionModelGridView_ex_1(R.drawable.ic_launcher, "Nguyen Van M", "DHCN DONG A"));


        PersionAdapterGridView_ex_1 adapter = new PersionAdapterGridView_ex_1(CustomGridViewActivity_ex_1.this, R.layout.custom_grid_view_row_ex_1, arr);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(CustomGridViewActivity_ex_1.this, "Index " + i, Toast.LENGTH_SHORT).show();
                Toast.makeText(CustomGridViewActivity_ex_1.this, "Name " + arr.get(i).getName(), Toast.LENGTH_SHORT).show();
                Toast.makeText(CustomGridViewActivity_ex_1.this, "School " + arr.get(i).getSchool(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}