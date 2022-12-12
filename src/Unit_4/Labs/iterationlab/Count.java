package Unit_4.Labs.iterationlab;
import java.util.Scanner;

public class Count {
    public static void main (String[] args) {

        String phrase; // a string of characters
        int length; // the length of the phrase

        //characters to look for and their counts
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;
        int blank = 0;
        Scanner scan = new Scanner(System.in);

        while (true){
            // Print a program header
            System.out.println ("\nCharacter Counter\n");

            // Read in a string and find its length
            System.out.print ("Enter a sentence or phrase: ");
            phrase = scan.nextLine().toLowerCase(); //force to lowercase
            length = phrase.length();

            //check for exit condition
            if(phrase.equals("quit")) break;

            // a for loop to go through the string character by character and count the blank spaces
            for (int i = 0; i < length; i++) {
                if ( phrase.charAt(i) == ' '){
                    blank++;

                } else if (phrase.charAt(i) == 'a') {
                    countA++;

                } else if (phrase.charAt(i) == 'e') {
                    countE++;

                } else if (phrase.charAt(i) == 'i'){
                    countI++;

                } else if (phrase.charAt(i) == 'o'){
                    countO++;

                } else if (phrase.charAt(i) == 'u'){
                    countU++;

                }
            }

            // Print the results
            System.out.println ();
            System.out.println ("Number of blank spaces: " + blank);
            System.out.println ("Number of a's: " + countA);
            System.out.println ("Number of e's: " + countE);
            System.out.println ("Number of i's: " + countI);
            System.out.println ("Number of o's: " + countO);
            System.out.println ("Number of u's: " + countU);

        }
        //Reset counts
        countA = 0;
        countE = 0;
        countI = 0;
        countO = 0;
        countU = 0;
        blank = 0;
    }
}
