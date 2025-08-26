package com.example.androidbasic.linear_layout;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.fullscreen;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LinearLayoutActivity_ex extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout_ex);

        TextView text = findViewById(R.id.text);
        TextView ketqua = findViewById(R.id.tv_result);
        TextView btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            String ipInput = text.getText().toString().trim();

            try {
                InetAddress inetAddress = InetAddress.getByName(ipInput);
                byte[] address = inetAddress.getAddress();

                int firstByte = Byte.toUnsignedInt(address[0]);
                int secondByte = Byte.toUnsignedInt(address[1]);

                boolean isPrivate = false;

                if (firstByte == 10) {
                    isPrivate = true; // 10.x.x.x
                } else if (firstByte == 172 && (secondByte >= 16 && secondByte <= 31)) {
                    isPrivate = true; // 172.16.x.x - 172.31.x.x
                } else if (firstByte == 192 && secondByte == 168) {
                    isPrivate = true; // 192.168.x.x
                } else if (firstByte == 127) {
                    isPrivate = true; // loopback
                }

                if (isPrivate) {
                    ketqua.setText(R.string.private_ip);
                } else {
                    ketqua.setText(R.string.public_ip);
                }

            } catch (UnknownHostException e) {
                ketqua.setText(R.string.ip_kh_ng_h_p_l);
            }
        });
    }
}
