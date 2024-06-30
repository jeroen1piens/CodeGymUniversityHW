package Lesson5;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        //    Write a program to check whether a number is perfect or not. Perfect = equal to the sum of all of its divisors.
        // Some perfect numbers: 28, 496, 8128

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        boolean isPerfect = false;
        int sum = 0;

        for (int i = 1; i <= number/2; i++) {
            if(number%i == 0) {
                sum += i;
            }
        }

        if (number == sum) {
            System.out.println(number + " is a perfect number");
        }
        else {
            System.out.println(number + " is not a perfect number");
        }






    }

}
