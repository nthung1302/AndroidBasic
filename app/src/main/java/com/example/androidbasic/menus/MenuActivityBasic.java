package com.example.androidbasic.menus;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.fullscreen;

public class MenuActivityBasic extends fullscreen {
    private Toolbar toolbar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_basic);
        toolbar = findViewById(R.id.toolbar);
        textView = findViewById(R.id.text);
        setSupportActionBar(toolbar);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menutaet, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){

        textView.setText(item.getTitle());
        return super.onOptionsItemSelected(item);
    }
}