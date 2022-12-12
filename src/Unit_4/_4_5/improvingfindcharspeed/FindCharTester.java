package Unit_4._4_5.improvingfindcharspeed;

public class FindCharTester {
    public static void main(String[] args) {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + findChar(word, key));
    }

    public static boolean findChar(String string, String key)
    {
        if(string.indexOf(key) != -1) return true;
        else return false;
    }
}
