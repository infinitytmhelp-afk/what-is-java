package com.madeeasy.topic01;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        /**
         * Login System
         */
        Scanner sc = new Scanner(System.in);


        // userName and pass store
        String correctUserName = "admin";
        String correctUserPassword = "1234";
        // user input , validate
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        if (name.equals(correctUserName) && password.equals(correctUserPassword)) {
            System.out.println("Welcome " + name);
        } else {
            System.out.println("Wrong username or password");
        }


        /**
         *
         */

    }
}
