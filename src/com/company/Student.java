package com.company;

public class Student {

    private String name = "John";
    private String classes = "CO2";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Ten: " + name+ ", Lop: "+classes;
    }
}
