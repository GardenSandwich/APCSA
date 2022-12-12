package Unit_2._2_7.quotemachine;
import java.util.Scanner;

public class QuoteMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quote: ");
        String quote = input.nextLine();
        System.out.print("Enter the name of the author: ");
        String author = input.nextLine();

        System.out.println("\"" + quote + "\"\n - " + author);

    }
}
