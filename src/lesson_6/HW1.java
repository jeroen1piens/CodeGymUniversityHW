package lesson_6;

public class HW1 {

    // Additional HW:
    // 1.
    // Write a program to find the number of even and odd integers in a given array of integers.




    public static void main(String[] args) {

        int[] intArray = {5, 7, 9, 10, 87, 20};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] %2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("The count of even numbers in the array is: " + evenCount);
        System.out.println("The count of odd numbers in the array is: " + oddCount);
    }


}
