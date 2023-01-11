package Unit_7._7_2.arraylistofevennumbers;

import java.util.ArrayList;

public class Evens {
    public static void main(String[] args) {
        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 100; i <= 300 ; i+= 2) {
            evens.add(i);
        }

        printArray(evens);
    }
    public static void printArray(ArrayList<Integer> array)
    {
        System.out.println("Array:");
        for(int name: array)
        {
            System.out.print(name + " ");
        }
    }
}
