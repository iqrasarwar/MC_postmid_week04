package com.example.postmidweek04;

public class StudentModel {
    public String Name;
    public int Class_;
    public boolean isEnrolled;

    public StudentModel(String name, int aClass, boolean isEnrolled) {
        Name = name;
        Class_ = aClass;
        this.isEnrolled = isEnrolled;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getClass_s() {
        return Class_;
    }

    public void setClass(int aClass) {
        Class_ = aClass;
    }

    public boolean isEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(boolean enrolled) {
        isEnrolled = enrolled;
    }
}
