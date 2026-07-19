package com.madeeasy.topic02;

import com.madeeasy.topic01.Student;

public class ExceptionDemo {
    static void main() {
        Student student = new Student();
        int a = 10;
        int b = 0;
        try {
            try {
                throw new ArithmeticException("b cannot be zero");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
