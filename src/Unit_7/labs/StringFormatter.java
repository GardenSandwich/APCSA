package Unit_7.labs;

import java.util.ArrayList;
import java.util.List;

public class StringFormatter {
    /** Returns the total number of letters in wordList.
     * Precondition: wordList contains at least two words, consisting of letters only.
     */

    public static int totalLetters(List<String> wordList) {
        int result = 0;
        for (String word : wordList) {
            result += word.length();
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> myWords = new ArrayList<String>();
        myWords.add("A");
        myWords.add("frog");
        myWords.add("is");

        System.out.println("Should print 7 and prints: " + totalLetters(myWords));

        List<String>words2 = new ArrayList<String>();
        words2.add("Hi");
        words2.add("Bye");
        System.out.println("Should print 5 and prints: " + totalLetters(words2));
    }
}
