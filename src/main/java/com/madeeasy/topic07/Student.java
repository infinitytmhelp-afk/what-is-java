package com.madeeasy.topic07;

public class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    static void main() {
        // dataType variableName = value/content;
        Student admin = new Student("admin", 5);
        admin = null;
    }
}
