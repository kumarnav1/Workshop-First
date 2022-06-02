package com.bl.birdsanctuary;

import java.util.Scanner;

public class UserInterface {

    int showMainMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter: \n 1. Add Bird. \n 2. Remove Bird. \n 3. Update Bird. \n 4. Display Bird : ");
        return scanner.nextInt();
    }

    int showToAddBird() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter: \n 1. Add Bird. \n 2. Remove Bird. \n 3. Update Bird. \n 4. Display Bird : ");
        return scanner.nextInt();
    }
}