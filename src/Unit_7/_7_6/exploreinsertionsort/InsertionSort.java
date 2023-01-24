package Unit_7._7_6.exploreinsertionsort;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        insertionSort(array1);
        // sort second array
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static void insertionSort(int[] arr)
    {
        //loop through elements
        for (int i = 1; i < arr.length; i++) {
            //assign element and its index
            int val = arr[i];
            int index = i-1;
            //compare until the element to the left is greater than current element
            while (index != -1 && val >= arr[index]) {
                arr[index + 1] = arr[index];
                index--;
            }
            //assign value at correct position
            arr[index + 1] = val;
        }
    }
}
