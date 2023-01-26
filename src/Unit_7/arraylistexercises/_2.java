package Unit_7.arraylistexercises;
import java.util.ArrayList;
public class _2 {
    public static void main(String[] args) {
        //Write a Java program to iterate through all elements in a array list.
        ArrayList<String> arr = new ArrayList<>(7);
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Indigo");
        arr.add("Violet");

        for (String color: arr) System.out.println(color);
    }
}
