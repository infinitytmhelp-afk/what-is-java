package com.madeeasy.topic06;

public class Hello {
    public String getName() {
        return "Hello World";
    }
    static void main() {
        System.out.println("Hello World");
        System.out.println("Hello It-World");
        for (int i = 0; i <= 100; i++) {
            System.out.println("inside for loop");
        }
        Hello hello = new Hello();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            hello.getName();
        }
    }
}
