package com.example.androidbasic.Intents.sent_data_obj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.util.ArrayList;

public class SentDataObjectActivity_Page_1 extends fullscreen {

    ImageView btn;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_sent_data_object_page_1);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            Persion persion1 = new Persion();
            persion1.setName("Nguyen Minh Hung");
            persion1.setAge(10);
            persion1.setSchool("DHCN DONG A");

            Persion persion2 = new Persion("Nguyen Van A", 10, "CD FPT POLITECHNIC");

            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(persion1.toString());
            arrayList.add(persion2.toString());

            intent = new Intent(SentDataObjectActivity_Page_1.this, SentDataObjectActivity_Page_2.class);
            intent.putExtra("data", arrayList);
            startActivity(intent);
        });
    }
}