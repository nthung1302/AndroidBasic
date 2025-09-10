package com.example.androidbasic.Dialogs;

public class Persion {
    private int avata;
    private String name;
    private String school;

    public Persion(int avata, String name, String school) {
        this.avata = avata;
        this.name = name;
        this.school = school;
    }

    public int getAvata() {
        return avata;
    }

    public void setAvata(int avata) {
        this.avata = avata;
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
