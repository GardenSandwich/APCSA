package Unit_5._5_1.labs.linebreakerlab;
import java.util.Scanner;

public class LineBreakerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = input.nextLine();
        System.out.print("Enter the maximum number of characters per line: ");
        int maxCharsPerLine = input.nextInt();
        System.out.println(LineBreaker.breakLine(line, maxCharsPerLine));

    }
}
