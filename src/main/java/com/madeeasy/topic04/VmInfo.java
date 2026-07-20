package com.madeeasy.topic04;

public class VmInfo {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("java.vm.vendor"));
        System.out.println(System.getProperty("java.vm.version"));
    }
}
