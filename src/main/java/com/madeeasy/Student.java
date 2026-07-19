package com.madeeasy;

public class Student {
    String name;
    int age;
    String address;
    String email;
    String state;

    public Student() {
    }

    public Student(String name, int age, String address, String email, String state) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.state = state;
    }

    public String getName() {
        return name;
    }
}
