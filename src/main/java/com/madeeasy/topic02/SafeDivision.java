package com.madeeasy.topic02;

public class SafeDivision {
    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b must not be zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divide(20, 0));
        } catch (IllegalArgumentException ex) {
            System.out.println("Problem: " + ex.getMessage());
        }
    }

}
