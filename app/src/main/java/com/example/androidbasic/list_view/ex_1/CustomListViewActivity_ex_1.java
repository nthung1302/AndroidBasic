package com.example.androidbasic.list_view.ex_1;

import android.os.Bundle;
import android.widget.ListView;

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
        arr.add(new PersionModelCustomeView_ex_1(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));
        arr.add(new PersionModelCustomeView_ex_1(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));
        arr.add(new PersionModelCustomeView_ex_1(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));
        arr.add(new PersionModelCustomeView_ex_1(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));


        PersionAdapterView_ex_1 adapter = new PersionAdapterView_ex_1(CustomListViewActivity_ex_1.this, R.layout.custom_view_row_ex_1, arr);
        listView.setAdapter(adapter);
    }
}