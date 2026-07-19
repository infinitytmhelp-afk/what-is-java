package com.madeeasy.topic02;

public class Greeting {
    private String greeting = "Welcome to IT-World"; // state

    // behavior or action
    public String getGreeting() {
        return greeting;
    }

    static void main() {
        String studentName = "Asha";
        int lessonNumber = 2;
        System.out.println("Hello " + studentName);
        System.out.println("Lesson: " + lessonNumber);

        Greeting greeting = new Greeting();
        String message = greeting.getGreeting();
        System.out.println(message);
    }
}
