package com.bl.birdsanctuary;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Bird Sanctuary Project");

        UserInterface userInterface = new UserInterface();
        Main main = new Main();

        main.handleUserChoice(userInterface.showMainMenu());
    }

    private void handleUserChoice(int choice) {

        CommonClass commonClass = new CommonClass();

        switch (choice) {
            case 1:
                System.out.println("You have chosen to Add bird");
                commonClass.addBird();
            case 2:
                System.out.println("You have chosen to Remove bird");
            case 3:
                System.out.println("You have chosen to Update bird ");
            case 4:
                System.out.println("You have chosen to Display bird ");
        }
    }
}