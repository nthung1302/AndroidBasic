package com.example.androidbasic.MediaPlayers.ex_1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.fullscreen;

import java.util.ArrayList;
import java.util.HashMap;

public class MediaPlayActivity_ex_1 extends fullscreen {

    ArrayList<MP3> arrayList;
    private MediaPlayer mediaPlayer;
    private TextView btnPlay, btnPause, btnStop, header;
    private ImageView imgPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_media_play_ex_1);

        ListView listView = findViewById(R.id.lview);
        imgPlay = findViewById(R.id.imgPlay);
        btnPause = findViewById(R.id.pause);
        btnPlay = findViewById(R.id.play);
        btnStop = findViewById(R.id.stop);
        header = findViewById(R.id.headerPlay);

        arrayList = new ArrayList<>();

        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong", "SontungMTP", "nhacsontung"));
        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong v1", "SontungMTP", "nhacsontungv1"));
        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong v2", "SontungMTP", "nhacsontungv2"));
        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong v3", "SontungMTP", "nhacsontungv3"));
        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong v4", "SontungMTP", "nhacsontungv4"));
        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong", "SontungMTP", "nhacsontrung"));
        arrayList.add(new MP3(R.drawable.ic_launcher, "Nhac thinh phong", "SontungMTP", "nhacsontrung"));

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("nhacsontung", R.raw.audio_test);
        hashMap.put("nhacsontungv1", R.raw.audio_test);
        hashMap.put("nhacsontungv2", R.raw.audio_test);
        hashMap.put("nhacsontungv3", R.raw.audio_test);
        hashMap.put("nhacsontungv4", R.raw.audio_test);

        MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(this, R.layout.item_list_view_media_play_ex_1, arrayList);
        listView.setAdapter(mediaPlayerAdapter);

        listView.setOnItemClickListener((parent, view, i, id) -> {
            imgPlay.setImageResource(arrayList.get(i).getImage());
            header.setText(arrayList.get(i).getTitle());

            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }

            String key = arrayList.get(i).getFileName();
            Integer resId = hashMap.get(key);

            if (resId != null) {
                mediaPlayer = MediaPlayer.create(MediaPlayActivity_ex_1.this, resId);
                mediaPlayer.start();
            }
        });

        btnPlay.setOnClickListener(v -> {
            if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
        });

        btnPause.setOnClickListener(v -> {
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
        });

        btnStop.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;
            }
        });

    }

}















