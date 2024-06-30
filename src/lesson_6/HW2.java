package lesson_6;

// 2.
// Write a program to reverse an array of integer values.
public class HW2 {

    public static void main(String[] args) {
        int[] intArray = {2, 4, 5, 7, 9};

        int[] reversedArray = new int[intArray.length];

        for (int i = 0; i < intArray.length ; i++) {
            reversedArray[reversedArray.length - 1 -i] = intArray[i];
        }
        System.out.println("Please find hereunder the content of the reversed array: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }

}
