package Unit_6._6_2.findindexofastring;

public class MatchingString {
    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};

    public static int findString(String myString) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(myString)) {
                return i;
            }
        }
        return -1;
    }
}
