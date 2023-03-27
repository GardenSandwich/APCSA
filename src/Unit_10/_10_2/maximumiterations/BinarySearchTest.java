package Unit_10._10_2.maximumiterations;

import java.util.Arrays;

public class BinarySearchTest {

    static int count;

    public static void main(String[] args) {
        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        compareIterations(100);
        compareIterations(1000);
        compareIterations(10000);
        compareIterations(100000);
    }

    public static void compareIterations(int length)
    {
        int[] array = generateArrayOfLength(length);
        int target = (int)(Math.random() * 100);
        int max = binaryMax(length);
        int actual = binaryRec(array, target, 0, array.length - 1);
        System.out.println("Array Size: " + length + "\nMax iterations: " + max + "\nActual iterations: " + count);
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
            int mid = (begin + end) / 2;
            count ++;
            // Base Case
            if (target == array[mid]) {
                return mid;
            }

            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1);
            }

            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end);
            }
        }
        return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length) {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}

