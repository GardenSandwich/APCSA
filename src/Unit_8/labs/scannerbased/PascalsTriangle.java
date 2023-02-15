package Unit_8.labs.scannerbased;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the number of rows or \"quit\" to exit: ");
            String word = input.nextLine();
            if (word.equals("quit")) {
                break;
            }
            PascalsTriangle.printPascalsTriangle(Integer.valueOf(word));
            System.out.println("\n");
        }
    }
}
