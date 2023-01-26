package Unit_7.arraylistexercises;
import java.util.ArrayList;
public class _4 {
    //Write a Java program to remove the third element from a array list.
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(7);
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Indigo");
        arr.add("Violet");

        System.out.println(arr);

        System.out.println("Removed the third element");
        arr.remove(2);

        System.out.println(arr);
    }
}
