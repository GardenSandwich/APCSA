package Unit_8.labs.matrixsum;

import java.io.*;

public class MatrixSummingRunner {
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
                System.out.println("The sum of " + coords[0] + "," + coords[1] + " is " + MatrixSumming.getSum(matrix, coords[0], coords[1]));
                currentLine = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
