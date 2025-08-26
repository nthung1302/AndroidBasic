package com.example.androidbasic.encode;

import android.os.Bundle;

import com.example.androidbasic.R;
import com.example.androidbasic.helpers.console;
import com.example.androidbasic.helpers.fullscreen;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA_256 extends fullscreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encode_sha256);
        String text = "admin";
        String ketqua = encode(text);
        console.log(ketqua);
    }

    public static String encode(String code){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(code.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }catch (Exception ex){
            console.log(ex.toString());
            return null;
        }
    }
}