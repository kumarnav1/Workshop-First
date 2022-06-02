package com.bl.birdsanctuary;

public class Peacock extends Bird {

    @Override
    void eat() {
        System.out.println("Peacock can eat.");
    }

    void fly() {
        System.out.println("Peacock can fly.");
    }

    @Override
    void swim() {
        System.out.println("Peacock can fly.");
    }

    @Override
    public String toString() {
        return "Peacock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}