package org.example;

class Red extends Thread {
    @Override
    public void run() {
        System.out.println("Red light");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Yellow extends Thread {
    @Override
    public void run() {
        System.out.println("Yellow light");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Green extends Thread {
    @Override
    public void run() {
        System.out.println("Green light");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Red red = new Red();
        Yellow yellow = new Yellow();
        Green green = new Green();

        while (true) {
            red.run();
            yellow.run();
            green.run();
            yellow.run();
        }
    }
}