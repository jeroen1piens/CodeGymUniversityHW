package Lesson_7;

public class HWLesson_7 {

    // Additional HW: In a 2D matrix of NxN (square)
    // Find the sum of all the numbers on the left (right) diagonal
    // 3 4 5
    // 4 5 1
    // 1 2 3

    public static void main(String[] args) {

        int[][] matrix2D = {{3,4}, {4,5}};

        int sumMainDiagonal = 0;
        int sumCounterDiagonal = 0;

        for (int i = 0; i < matrix2D.length; i++) {
            sumMainDiagonal += matrix2D[i][i];
            sumCounterDiagonal += matrix2D[i][matrix2D.length -1 -i];
        }

        System.out.println(sumMainDiagonal);
        System.out.println(sumCounterDiagonal);

    }

}
