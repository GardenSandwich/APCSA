package Unit_10.recursionprogramming;

public class Q3 {
    public static void main(String[] args) {
        String[] words = {"HelloWorld", "WakeUp", "Band"};
        for (String word : words) {
            System.out.println("original : " + word + ", reversed: " + ReverseString.reverse(word));
        }
    }
}

class ReverseString{
    public static String reverse(String str){
        if(str.length() == 1) return str;
        else return reverse(str.substring(1)) + str.charAt(0);
    }
}
