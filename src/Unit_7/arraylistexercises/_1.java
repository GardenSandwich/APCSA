package Unit_7.arraylistexercises;
import java.util.ArrayList;
public class _1 {
    //Write a Java program to create a new array list, add some elements (string) and print out the collection.
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(7);
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Indigo");
        arr.add("Violet");

        //Print out the collection
        System.out.println(arr);
    }
}
