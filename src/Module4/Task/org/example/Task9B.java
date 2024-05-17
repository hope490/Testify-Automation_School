package org.example;

import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.println("Enter a word: ");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("testify")) {
                System.out.println("Try Again");
            } else {
                System.out.println("Testify");
                break;
            }
        }

    }
}