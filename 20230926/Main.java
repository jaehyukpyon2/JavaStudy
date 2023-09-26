package com.mystudy.learn;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Computer com = new Computer();
        Computer com1 = new Computer();
        person.action(com::instanceMethod);
        System.out.println("----------");
        System.out.println(com.instanceX);
        System.out.println(com1.instanceX);
    }
}
