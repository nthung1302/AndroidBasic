package com.example.androidbasic.ListViews.ex_2;

import java.io.Serializable;

public class PersionModelListView_ex_2 implements Serializable {
    private int imgAvata;
    private String name;
    private String school;
    private int imgNation;

    public PersionModelListView_ex_2() {
    }

    public PersionModelListView_ex_2(int imgAvata, String name, String school, int imgNation) {
        this.imgAvata = imgAvata;
        this.name = name;
        this.school = school;
        this.imgNation = imgNation;
    }

    public int getImgAvata() {
        return imgAvata;
    }

    public void setImgAvata(int imgAvata) {
        this.imgAvata = imgAvata;
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

    public int getImgNation() {
        return imgNation;
    }

    public void setImgNation(int imgNation) {
        this.imgNation = imgNation;
    }
}
