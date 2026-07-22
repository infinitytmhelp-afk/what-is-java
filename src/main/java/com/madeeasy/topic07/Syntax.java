package com.madeeasy.topic07;

public class Syntax {
    public static void main(String[] args) {
        /**
         * datatype variableName = value;
         */
        int age = 20;
        double price = 149.99;
        boolean active = true;
        char gender = 'M';

        // declaration
        int marks;
        // initialization
        marks = 75;
        // declaration + initialization
        int mark = 75;
        mark = 100; // reassignment

        /**
         * variable naming rule:
         */
        // a. A name may use letters, digits, underscore and dollar sign.
        int ages = 20;
        String name841 = "it-world";
        String welcome_to_it_world;
        String $hello = "hello";

        // name cannot start with digit
//        String 8hello = "hello";

        // Java keywords such as int, class and public cannot be variable names.
//        int int = 10;
//        String int ="hi";
        //  Names are case-sensitive: age and Age are different.
        int Age = 85;

        System.out.println("age: " + age);
        System.out.println("Age: " + Age);

        // Use meaningful camelCase names: totalPrice, studentName, isActive
        int[] ageArr = {80, 75, 92, 75};

        String address = "universe";
//        address = 10;

//        long invalid = 3_000_000_000;

        int maximum = Integer.MAX_VALUE;
        System.out.println(maximum); // 2147483647
        int overflowed = maximum + 1;
        System.out.println(overflowed); // -2147483648

        byte a = 10;
        byte b = 20;
// Arithmetic is promoted to int:
// byte sum = a + b; // compile-time error
        int sum = a + b; // correct
        byte smallSum = (byte) (a + b); // explicit narrowing

        char singleQuote = 'A';
        String doubleQuote = "A";
        char letter = 'A';
        int code = letter;
        System.out.println(code); // 65
        boolean isLoggedIn = true;
        boolean hasPermission = false;
        if (isLoggedIn && hasPermission) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }


        int[] first = {10, 20};
        int[] second = first;
        second[0] = 99;
        System.out.println(first[0]); // 99

        System.out.println("Hello\nJava");


        // widening
        int quantity = 50;
        long largeQuantity = quantity;
        double decimalQuantity = largeQuantity;
        System.out.println(decimalQuantity); // 50.0

        // narrowing
        double uPrice = 99.99;
        int wholePrice = (int) uPrice;
        System.out.println(wholePrice); // 99


//        Local variable type inference with var

        var nAge = 20; // inferred as int
        var name = "Riya"; // inferred as String
        var nMarks = new int[]{80, 90}; // inferred as int[]
        System.out.println(nAge + " " + name + " " + nMarks[0] + " " + nMarks[1]);

        final double GST_RATE = 0.18;
        final int MAX_LOGIN_ATTEMPTS = 3;
//        GST_RATE = 5;
    }
}
