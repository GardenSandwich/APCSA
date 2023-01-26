package Unit_7.arraylistexercises;
import java.util.ArrayList;

public class _5 {
    public static void main(String[] args) {
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
            if (arr.get(i).equals(arr2.get(i))) {
                System.out.print("yes, ");
            } else {
                System.out.print("no, ");
            }
        }
        System.out.println("]");
    }
}
