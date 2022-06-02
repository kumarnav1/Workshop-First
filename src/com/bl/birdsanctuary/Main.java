package com.bl.birdsanctuary;

public class Main {

    BirdRepository birdRepository = new BirdRepository();

    public static void main(String[] args) {

        System.out.println("Welcome to Bird Sanctuary Project");
        Main main = new Main();
        UserInterface userInterface = new UserInterface();

        while (true) {

            int choice = userInterface.showMainMenu();

            if (choice >= 5 || choice <= 0) {

                System.out.println("Program is terminated");
                return;
            }
            main.handleUserChoice(choice);
        }
    }

    private void handleUserChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("You have chosen to Add bird details");
                addBird();
                break;
            case 2:
                System.out.println("You have chosen to display bird details");
                printBird();
                break;
            case 3:
                System.out.println("You have chosen to Update bird details");
                break;
            case 4:
                System.out.println("You have chosen to remove bird ");
        }
    }


    private void printBird() {

        birdRepository.print();
    }

    void addBird() {

        Duck duck = new Duck();
        duck.name = "Duck";
        duck.id = "D001";
        duck.age = 4;
        duck.color = "White";
        System.out.println("Duck details added");

        Parrot parrot = new Parrot();
        parrot.name = "Parrot";
        parrot.id = "PA001";
        parrot.age = 2;
        parrot.color = "Green";
        System.out.println("Parrot details added");

        Peacock peacock = new Peacock();
        peacock.name = "Peacock";
        peacock.id = "PE001";
        peacock.age = 4;
        peacock.color = "Blue";
        System.out.println("Peacock details added");

        Penguin penguin = new Penguin();
        penguin.name = "Penguin";
        peacock.id = "PN001";
        peacock.age = 5;
        peacock.color = "Black and white";
        System.out.println("Penguin details added");

        Ostrich ostrich = new Ostrich();
        ostrich.name = "Ostrich";
        ostrich.id = "O001";
        ostrich.age = 4;
        ostrich.color = "Brown";
        System.out.println("Ostrich details added");

        birdRepository.add(duck);
        birdRepository.add(parrot);
        birdRepository.add(penguin);
        birdRepository.add(peacock);
        birdRepository.add(ostrich);
    }
}