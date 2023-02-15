package Unit_8.labs.matrixsum;

public class MatrixSumming {
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
