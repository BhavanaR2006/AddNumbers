package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        App obj = new App();

        int result = obj.add(10, 20);

        System.out.println("First Number: 10");
        System.out.println("Second Number: 20");
        System.out.println("Sum = " + result);
    }
}