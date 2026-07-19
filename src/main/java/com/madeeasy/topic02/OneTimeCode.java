package com.madeeasy.topic02;

import java.security.SecureRandom;

public class OneTimeCode {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int code = 100000 + random.nextInt(900000);
        System.out.println("code = " + code);
    }
}
