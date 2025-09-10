package com.example.androidbasic.Dialogs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.example.androidbasic.GridViews.CustomListView.Persion;
import com.example.androidbasic.Helpers.fullscreen;
import com.example.androidbasic.R;

import java.util.ArrayList;

public class DialogActivityBasic extends fullscreen {

    private ArrayList<Persion> arr;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_basic);

        ListView listView = findViewById(R.id.lview);

        arr = new ArrayList<>();
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thanh Hung", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van A", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van B", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thi C", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van D", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van E", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van F", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thi G", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thi H", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van I", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van J", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van K", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Thi L", "DHCN DONG A"));
        arr.add(new Persion(R.drawable.ic_launcher, "Nguyen Van M", "DHCN DONG A"));

        adapter = new ArrayAdapter(this, R.layout.custom_list_view_row_ex_2, arr);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                XacNhan(i);
            }
        });
    }
    private void XacNhan(int i){
        AlertDialog.Builder dialog = new AlertDialog.Builder(DialogActivityBasic.this);
        dialog.setIcon(R.drawable.ic_launcher);
        dialog.setTitle("Thong bao");
        dialog.setMessage("MAy muon xoa khong?");

        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                arr.remove(i);
                adapter.notifyDataSetChanged();
            }
        });
        dialog.setPositiveButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        dialog.show();
    }
}