package com.example.androidbasic.MediaPlayers.ex_1;

public class MP3 {
    private int image;
    private String title;
    private String content;
    private String fileName;

    public MP3(int image, String title, String content, String fileName) {
        this.image = image;
        this.title = title;
        this.content = content;
        this.fileName = fileName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
