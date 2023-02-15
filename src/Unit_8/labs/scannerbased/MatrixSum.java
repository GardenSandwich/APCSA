package Unit_8.labs.scannerbased;

import java.util.Scanner;

public class MatrixSum {
    static int getSum(int[][] matrix, int x, int y) {
        int sum = 0;

        sum += matrix[x][y];

        //add all adjacent values, if they are in bounds
        if (x > 0) {
            sum += matrix[x - 1][y];
        }
        if (x < matrix.length - 1) {
            sum += matrix[x + 1][y];
        }
        if (y > 0) {
            sum += matrix[x][y - 1];
        }
        if (y < matrix[0].length - 1) {
            sum += matrix[x][y + 1];
        }

        //add diagonals, if they are in bounds
        if (x > 0 && y > 0) {
            sum += matrix[x - 1][y - 1];
        }
        if (x > 0 && y < matrix[0].length - 1) {
            sum += matrix[x - 1][y + 1];
        }
        if (x < matrix.length - 1 && y > 0) {
            sum += matrix[x + 1][y - 1];
        }
        if (x < matrix.length - 1 && y < matrix[0].length - 1) {
            sum += matrix[x + 1][y + 1];
        }

        return sum;
    }
}

class MatrixSummingRunner {
    static int[][] matrix = {{1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {6, 7, 1, 2, 5},
            {6, 7, 8, 9, 0},
            {5, 4, 3, 2, 1}
    };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("enter coordinates to sum (x y) or \"quit\" to exit: ");
            String line = input.nextLine();
            if (line.equals("quit")) {
                break;
            }
            String[] coordinates = line.split(" ");
            int x = Integer.valueOf(coordinates[0]);
            int y = Integer.valueOf(coordinates[1]);
            System.out.println(MatrixSum.getSum(matrix, x, y));
        }
    }
}
