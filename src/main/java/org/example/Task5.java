package org.example;

public class Task5 {
    public static void main(String[] args) {
        int number =30;

        for (int n = 1; n <= number; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (n % 3 == 0) {
                System.out.println("Fizz");

            } else if (n % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(n);
            }
        }
    }
}