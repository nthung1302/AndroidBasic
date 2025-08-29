package com.example.androidbasic.ListViews.ex_1;

import android.os.Bundle;
import android.widget.ListView;

import com.example.androidbasic.GridViews.CustomListView.PersionModelGridView_ex_1;
import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class CustomListViewActivity_ex_1 extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_ex_1);

        ListView listView = findViewById(R.id.lview);

        ArrayList arr = new ArrayList<>();
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van A", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van B", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Thi C", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van D", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van E", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van F", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Thi G", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Thi H", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van I", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van J", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van K", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Thi L", "DHCN DONG A"));
        arr.add(new PersionModelListView_ex_1(R.drawable.ic_launcher, "Nguyen Van M", "DHCN DONG A"));


        PersionAdapterListView_ex_1 adapter = new PersionAdapterListView_ex_1(CustomListViewActivity_ex_1.this, R.layout.custom_list_view_row_ex_1, arr);
        listView.setAdapter(adapter);
    }
}