package Unit_7.arraylistexercises;
import java.util.ArrayList;
public class _3 {
    public static void main(String[] args) {
        //Write a Java program to copy one array list into another
        ArrayList<String> arr = new ArrayList<>(7);
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Indigo");
        arr.add("Violet");

        ArrayList<String> arr2 = new ArrayList<>(7);
        arr2.add("A");
        arr2.add("B");
        arr2.add("C");
        arr2.add("D");
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");

        System.out.println("List 1: " + arr);
        System.out.println("List 2: " + arr2);
        System.out.println("Copy arr to arr2");
        System.out.println("after copy:");

        for (int i = 0; i < arr.size(); i++) {
            arr2.set(i, arr.get(i));
        }

        System.out.println("List 1: " + arr);
        System.out.println("List 2: " + arr2);
    }
}
