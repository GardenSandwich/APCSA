package Unit_7.arraylistexercises;
import java.util.ArrayList;
public class _6 {
    //Write a Java program of swap two elements in an array list
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(7);
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Indigo");
        arr.add("Violet");

        System.out.println("ArrayList before swap:");
        arr.forEach(System.out::println);

        String temp = arr.get(2);
        arr.set(2, arr.get(4));
        arr.set(4, temp);

        System.out.println("ArrayList after swap:");
        arr.forEach(System.out::println);
    }
}
