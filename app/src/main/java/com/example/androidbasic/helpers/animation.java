package com.example.androidbasic.helpers;

import android.view.View;

public class animation {
    public static void click(View view){
        view.animate()
                .scaleX(0.95f)
                .scaleY(0.95f)
                .setDuration(150)
                .withEndAction(() -> {
                    view.animate()
                            .scaleX(1f)
                            .scaleY(1f)
                            .setDuration(150)
                            .start();
                })
                .start();
    }
}
