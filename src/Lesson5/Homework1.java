package Lesson5;

import java.util.Scanner;

public class Homework1 {


    public static void main(String[] args) {
        /*
         * *****
         * ****
         * ***
         * **
         * *
         *
         * *****
         *  ****
         *   ***
         *    **
         *     *
         *
         * XX*XX
         * X***X
         * *****
         * X***X
         * XX*XX
         */

        /*
         * *****
         * ****
         * ***
         * **
         * *
         *
         */

        Scanner scanner = new Scanner(System.in);
        int starCount = scanner.nextInt();


        for (int i = 0; i < starCount; i++) {
            for(int j =0; j < starCount; j++) {
                if(j < starCount - i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        /*
         * *****
         *  ****
         *   ***
         *    **
         *     *
        */



        for (int i = 0; i < starCount; i++) {
            for(int j =0; j < starCount; j++) {
                if(j >= i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        /*
         * XX*XX
         * X***X
         * *****
         * X***X
         * XX*XX
        */

        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < starCount; j++) {
                if(j >= Math.abs((starCount-1)/2 - i) && j <= (starCount-1) - Math.abs(((starCount-1)/2 - i))) {
                    System.out.print("*");
                }
                else {
                    System.out.print("X");
                }
            }
            System.out.println();

        }

    }

}
