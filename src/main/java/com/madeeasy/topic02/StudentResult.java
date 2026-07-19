package com.madeeasy.topic02;

class Student {
    private final String name;
    private final int marks;
    Student(String name, int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be 0 to 100");
        }
        this.name = name;
        this.marks = marks;
    }
    String result() {
        return marks >= 40 ? "PASS" : "FAIL";
    }
    void printReport() {
        System.out.println(name + " - " + marks + " - " + result());
    }
}
public class StudentResult {
    public static void main(String[] args) {
        Student student = new Student("Riya", 0);
        student.printReport();
    }
}
