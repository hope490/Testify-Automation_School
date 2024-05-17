package org.example;

public class Task10 {
    public static void main(String[] args) {
        verifyVisitors("Testify");
    }

    public static void verifyVisitors(String userInput) {
        if (userInput.equalsIgnoreCase("Testify")) {
            System.out.println("Welcome to Testify Trainings!");
        } else {
            System.out.println("Sorry, you are not authorized to access Testify Trainings.");
        }

    }
}
