package Unit_4._4_3.findingpalindromes;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = input.nextLine();
        if(isPalindrome(text)) {
            System.out.println("Your word is a palindrome!");
        } else {
            System.out.println("Not a palindrome :(");
        }
    }

    /**
     * This method reverses a String.
     *
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text) {
        StringBuilder stringBuilder = new StringBuilder(text.length());
        return stringBuilder.reverse().toString();
    }

    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     *
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether it was a palindrome.
     */
    public static boolean isPalindrome(String text) {
        String reversed = reverse(text);
        if (text.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
