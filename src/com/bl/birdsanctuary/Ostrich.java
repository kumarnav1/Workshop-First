package com.bl.birdsanctuary;

public class Ostrich extends Bird {

    @Override
    void eat() {
        System.out.println("Parrot can eat.");
    }

    @Override
    void fly() {
        System.out.println("Parrot can fly.");
    }

    @Override
    void swim() {
        System.out.println("Parrot cannot swim.");
    }

    @Override
    public String toString() {
        return "Ostrich{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}