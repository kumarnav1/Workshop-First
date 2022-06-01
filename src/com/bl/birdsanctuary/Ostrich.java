package com.bl.birdsanctuary;

public class Ostrich extends Bird {

    public Ostrich(String id, String name, String color, int age) {

        this.id = id;
        this.age = age;
        this.color = color;
        this.name = name;
    }

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
}