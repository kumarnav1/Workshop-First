package com.bl.birdsanctuary;

import java.util.Scanner;

public class UserInterface {

    int showMainMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter: \n 1. Add Bird. \n 2. display Bird. \n 3. Update Bird. \n 4. remove Bird. \n 5. Terminate Program ");
        return scanner.nextInt();
    }

}