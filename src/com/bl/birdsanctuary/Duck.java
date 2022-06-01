package com.bl.birdsanctuary;

public class Duck extends Bird {

    @Override
    void eat() {
        System.out.println("Duck can eat.");
    }

    @Override
    void fly() {
        System.out.println("Duck can fly.");
    }


    @Override
    void swim() {
        System.out.println("Duck cannot swim.");
    }
}