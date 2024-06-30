package Lesson5;

import java.util.Scanner;

public class Homework2 {

    //    Write a program to find the last prime number that occurs before the entered number.
    // E.g. input: 100 -> 97 (97 being the last prime number before 100)
    // input: 49 -> 49, 15 -> 13 and so on

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        boolean primeNumber = false;

        for (int i = number; i > 1 ; i--) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i%j != 0) {
                    primeNumber = true;
                    continue;
                }
                else {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber == true) {
                System.out.println("The closest prime number before " + number + " is: " + i);
                break;
            }
        }

    }


}
