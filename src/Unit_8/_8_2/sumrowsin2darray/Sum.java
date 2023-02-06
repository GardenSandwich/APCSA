package Unit_8._8_2.sumrowsin2darray;

public class Sum {
    public static void main(String[] args)
    {
        int[][] array = {{4, 4, 5, 6, 3, 1},
                {14, 2, 5, 4, 8, 2},
                {45, 12, 13, 5, 2, 1}};
        System.out.println(sumArray(array));
    }

    // Returns the sum of row row in 2D array array
    public static int sumRow(int[][] array, int row)
    {
        int output = 0;

        for(int i = 0; i < array[row].length; i++) {
            output += array[row][i];
        }
        return output;
    }

    // Returns the sum of all elements in array
    public static int sumArray(int[][] array)
    {
        int output = 0;
        for (int i = 0; i < array.length; i++) {
            output += sumRow(array, i);
        }
        return output;
    }
}
