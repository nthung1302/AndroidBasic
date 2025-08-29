package com.example.androidbasic.Intents.sent_data_bundle;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class PersionModelSentDataBundle implements Serializable {
    private String name;
    private int age;
    private String school;

    public PersionModelSentDataBundle() {
    }

    public PersionModelSentDataBundle(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @NonNull
    @Override
    public String toString() {
        return name + " " + age + " " + school;
    }
}
