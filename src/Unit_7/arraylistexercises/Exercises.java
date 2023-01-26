package Unit_7.arraylistexercises;
import java.util.ArrayList;

public class Exercises {
    //Each exercise is a method
    public static void main(String[] args) {
        System.out.println("Exercise 1\n" + "--------------------------------");
        _1();
        System.out.println("\nExercise 2\n" + "--------------------------------");
        _2();
        System.out.println("\nExercise 3\n" + "--------------------------------");
        _3();
        System.out.println("\nExercise 4\n" + "--------------------------------");
        _4();
        System.out.println("\nExercise 5\n" + "--------------------------------");
        _5();
        System.out.println("\nExercise 6\n" + "--------------------------------");
        _6();
    }

    static void _1() {
        //Write a Java program to create a new array list, add some elements (string) and print out the collection.
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

    static void _2() {
        //Write a Java program to iterate through all elements in an array list.
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

    static void _3() {
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

    static void _4(){
        //Write a Java program to remove the third element from an array list.
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

    static void _5() {
        //Write a Java program to compare two array lists.
        ArrayList<String> arr = new ArrayList<>(7);
        arr.add("Red");
        arr.add("Orange");
        arr.add("Yellow");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Indigo");
        arr.add("Violet");

        ArrayList<String> arr2 = new ArrayList<>(7);
        arr2.add("Red");
        arr2.add("Orange");
        arr2.add("Purple");
        arr2.add("Green");
        arr2.add("Blue");
        arr2.add("Maroon");
        arr2.add("Violet");

        System.out.print("[");
        for (int i = 0; i < arr.size(); i++) {
            if (arr2.contains(arr.get(i))) {
                System.out.print("yes, ");
            } else {
                System.out.print("no, ");
            }
        }
        System.out.println("]");
    }

    static void _6(){
        //Write a Java program to swap two elements in an array list.
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
