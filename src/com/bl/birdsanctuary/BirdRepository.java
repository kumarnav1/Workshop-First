package com.bl.birdsanctuary;

import java.util.ArrayList;

public class BirdRepository {

    private ArrayList<Bird> birds = new ArrayList<>();

    void add(Penguin penguin) {
        birds.add(penguin);
    }

    void add(Peacock peacock) {
        birds.add(peacock);
    }

    void add(Parrot parrot) {
        birds.add(parrot);
    }

    void add(Duck duck) {
        birds.add(duck);
    }

    void add(Ostrich ostrich) {
        birds.add(ostrich);
    }

    void print() {
        for (Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }

}

