package com.example.androidbasic.MediaPlayers;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import com.example.androidbasic.R;
import com.example.androidbasic.Helpers.fullscreen;

public class MediaPlayActivityBasic extends fullscreen {
    private MediaPlayer mediaPlayer;
    private TextView btnStart, btnStop, btnPause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_play_basic);

        mediaPlayer = MediaPlayer.create(MediaPlayActivityBasic.this, R.raw.audio_test);
        btnStart = findViewById(R.id.start);
        btnStop = findViewById(R.id.stop);
        btnPause = findViewById(R.id.pause);

        btnStart.setOnClickListener(v -> {
            mediaPlayer.start();
        });

        btnPause.setOnClickListener(v -> {
            mediaPlayer.pause();
        });

        btnStop.setOnClickListener(v -> {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(MediaPlayActivityBasic.this, R.raw.audio_test);
        });
    }
}