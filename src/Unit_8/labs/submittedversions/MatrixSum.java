package Unit_8.labs.submittedversions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
        File input = new File("src/Unit_8/labs/matrixsum/matsum.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            String currentLine = reader.readLine();

            while(currentLine != null) {
                //convert string to coordinates
                int[] coords = {Integer.parseInt(currentLine.split(" ")[0]), Integer.parseInt(currentLine.split(" ")[1])};
                System.out.println("The sum of " + coords[0] + "," + coords[1] + " is " + MatrixSum.getSum(matrix, coords[0], coords[1]));
                currentLine = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
