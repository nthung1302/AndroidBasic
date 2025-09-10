package com.example.androidbasic.Dialogs.ex_1;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidbasic.Helpers.fullscreen;
import com.example.androidbasic.R;

public class DialogActivity_ex_1 extends fullscreen {

    private TextView btnLogin, btnFeedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_ex_1);
        init();
        handleEvents();
    }

    private void init() {
        btnLogin = findViewById(R.id.btnLogin);
        btnFeedback = findViewById(R.id.btnFeedback);
    }

    private void handleEvents() {
        btnLogin.setOnClickListener(v -> dialogLogin());
        btnFeedback.setOnClickListener(v -> dialogFeedBack());
    }

    private void dialogLogin() {
        android.view.View dialogView = getLayoutInflater().inflate(R.layout.custome_dialog_ex_1_view_1, null);

        TextView btnConfirm = dialogView.findViewById(R.id.btnConfirm);
        TextView btnExit = dialogView.findViewById(R.id.btnExit);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(dialogView)
                .create();

        dialog.show();

        btnConfirm.setOnClickListener(v -> {
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        btnExit.setOnClickListener(v -> dialog.dismiss());
    }

    private void dialogFeedBack() {
        android.view.View dialogView = getLayoutInflater().inflate(R.layout.custome_dialog_ex_1_view_2, null);

        TextView btnCancel = dialogView.findViewById(R.id.btnCancel);
        TextView btnSend = dialogView.findViewById(R.id.btnSend);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(dialogView)
                .create();

        dialog.show();


        btnSend.setOnClickListener(v -> {
            Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });

        btnCancel.setOnClickListener(v -> dialog.dismiss());
    }
}
