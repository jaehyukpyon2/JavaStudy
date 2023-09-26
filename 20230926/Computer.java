package com.mystudy.learn;

public class Computer {

    public double instanceX;

    public static double staticMetod(double x, double y) {
        return x + y;
    }

    public double instanceMethod(double x, double y) {
        this.instanceX = x;
        return x * y;
    }
}
