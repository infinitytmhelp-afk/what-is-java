package com.madeeasy.topic02;

public class TwoTasks {

    static void main(String[] args) throws InterruptedException {
        Thread download = Thread.ofPlatform().start(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Downloading part " + i);
            }
        });
        Thread report = Thread.ofPlatform().start(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Preparing report " + i);
            }
        });
        download.join();
        report.join();
        System.out.println("Both tasks finished");
    }

}
