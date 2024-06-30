package Lesson4;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        // Additional HW: Write a program to check whether a number is prime or not.
        // Prime number: has no dividers other than 1 and itself

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a whole number: ");
        int number = scanner.nextInt();
        boolean primeNumber = true;

        if(number == 1) {
            primeNumber= false;
        } else if (number == 2) {
            primeNumber = false;
        } else {
            for (int i = 2; i < number; i++) {
                if(number%i == 0) {
                    primeNumber = false;
                    break;
                }
            }
        }

        if (primeNumber == true) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

}
