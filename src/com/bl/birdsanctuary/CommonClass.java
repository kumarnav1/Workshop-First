/*
package com.bl.birdsanctuary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonClass {

    Scanner scanner = new Scanner(System.in);

    List<Parrot> parrotList = new ArrayList<>();
    List<Peacock> peacockList = new ArrayList<>();
    List<Duck> ducksList = new ArrayList<>();
    List<Penguin> penguinsList = new ArrayList<>();
    List<Ostrich> ostrichesList = new ArrayList<>();

    public void addBird() {

        UserInterface userInterface = new UserInterface();
        System.out.println("Enter the choices to add birds details. 1,2,3,4");
        switch (userInterface.showToAddBird()) {

            case 1:
                addParrot();
            case 2:
                addPeacock();
            case 3:
                addParrot();
            case 4:
                addDuck();
            case 5:
                addPenguin();
            case 6:
                addOstrich();
        }
    }

    private void addOstrich() {

        Ostrich ostrich;
        String id = scanner.next();
        String name = scanner.next();
        String color = scanner.next();
        int age = scanner.nextInt();
        ostrich = new Ostrich(id, name, color, age);
        ostrichesList.add(ostrich);
    }

    private void addPenguin() {

        Parrot parrot;
        String id = scanner.next();
        String name = scanner.next();
        String color = scanner.next();
        int age = scanner.nextInt();
        parrot = new Parrot(id, name, color, age);
        parrotList.add(parrot);
    }

    private void addDuck() {

        Parrot parrot;
        String id = scanner.next();
        String name = scanner.next();
        String color = scanner.next();
        int age = scanner.nextInt();
        parrot = new Parrot(id, name, color, age);
        parrotList.add(parrot);
    }

    private void addPeacock() {

        Parrot parrot;
        String id = scanner.next();
        String name = scanner.next();
        String color = scanner.next();
        int age = scanner.nextInt();
        parrot = new Parrot(id, name, color, age);
        parrotList.add(parrot);
    }

    private void addParrot() {

        Parrot parrot;
        String id = scanner.next();
        String name = scanner.next();
        String color = scanner.next();
        int age = scanner.nextInt();
        parrot = new Parrot(id, name, color, age);
        parrotList.add(parrot);
    }
}
*/
