package com.example.androidbasic.ListViews.ex_1;

import java.io.Serializable;

public class Persion implements Serializable {
    private int image;
    private String name;
    private String school;

    public Persion() {

    }

    public Persion(int image, String name, String school) {
        this.image = image;
        this.name = name;
        this.school = school;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
