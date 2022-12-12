package Unit_2._2_4.hello;
import java.util.Scanner;

public class HelloTester {
    public static void main(String[] args) {
            // Create a Scanner object
            Scanner input = new Scanner(System.in);
            // Prompt the user for their name
            System.out.print("What is your name? ");
            // Read the user's name
            String name = input.nextLine();
            // Create a Hello object
            Hello hello = new Hello(name);
            // Call the english method
            hello.english();
            // Call the spanish method
            hello.spanish();
            // Call the fr*nch method
            hello.french();
    }
}
