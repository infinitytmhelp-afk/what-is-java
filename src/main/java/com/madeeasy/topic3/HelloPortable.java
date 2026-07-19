package com.madeeasy.topic3;

public class HelloPortable {
    static void main() {
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Operating system: " + System.getProperty("os.name"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));
    }
}
