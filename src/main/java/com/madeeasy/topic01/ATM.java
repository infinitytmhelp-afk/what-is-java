package com.madeeasy.topic01;

import java.util.Scanner;

public class ATM {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String pin = "1234";

        System.out.println("Enter your pin");
        String userPin = sc.nextLine();

        // check if the pin is correct or not
        if (userPin.equals(pin)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong pin");
        }
    }
}
