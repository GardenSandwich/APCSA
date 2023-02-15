package Unit_8.labs.submittedversions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PascalsTriangle {
    public static void printPascalsTriangle(int rows) {
        int[][] pascal = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class PascalsTriangleRunner {
    public static void main(String[] args) {
        File input = new File("src/Unit_8/labs/matrixpascal/triangle.txt");
        String currentLine;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            currentLine = reader.readLine();
            int dataLength = Integer.valueOf(currentLine);

            for (int i = 0; i < dataLength; i++) {
                currentLine = reader.readLine();
                Unit_8.labs.matrixpascal.PascalsTriangle.printPascalsTriangle(Integer.valueOf(currentLine));
                System.out.println("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
