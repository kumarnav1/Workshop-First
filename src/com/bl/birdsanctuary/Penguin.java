package com.bl.birdsanctuary;

public class Penguin extends Bird {

    @Override
    void eat() {
        System.out.println("Penguin can eat.");
    }

    @Override
    void fly() {
        System.out.println("Penguin can fly.");
    }

    @Override
    void swim() {
        System.out.println("Penguin can swim.");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}