package Unit_4.Labs;

public class CountingVowels {
    public static void main(String[] args) {
        String string = "Mango is the best";
        int vowelCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if ((Character.toLowerCase(string.charAt(i))) == 'a'
            || (Character.toLowerCase(string.charAt(i))) == 'e'
            || (Character.toLowerCase(string.charAt(i))) == 'i'
            || (Character.toLowerCase(string.charAt(i))) == 'o'
            || (Character.toLowerCase(string.charAt(i))) == 'u'){
                vowelCount++;
            }
        }
        System.out.println("There are " + vowelCount + " vowels in \"" + string + "\"");
    }
}
