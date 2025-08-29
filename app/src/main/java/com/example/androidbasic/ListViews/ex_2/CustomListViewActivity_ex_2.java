package com.example.androidbasic.ListViews.ex_2;

import android.os.Bundle;
import android.widget.ListView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class CustomListViewActivity_ex_2 extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_ex_2);

        ListView listView = findViewById(R.id.lview);

        ArrayList arr = new ArrayList<>();
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A",  R.drawable.ic_launcher));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A",  R.drawable.ic_launcher));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A",  R.drawable.ic_launcher));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A",  R.drawable.ic_launcher));


        PersionAdapter adapter = new PersionAdapter(CustomListViewActivity_ex_2.this, R.layout.custom_list_view_row_ex_2, arr);
        listView.setAdapter(adapter);
    }
}