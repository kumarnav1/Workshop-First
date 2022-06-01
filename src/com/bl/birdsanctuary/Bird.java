package com.bl.birdsanctuary;

abstract public class Bird {

    String id;
    String name;
    String color;
    int age;

    abstract void eat();

    abstract void fly();

    abstract void swim();
}