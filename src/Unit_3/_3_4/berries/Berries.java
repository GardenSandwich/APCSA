package Unit_3._3_4.berries;
import java.util.Scanner;

public class Berries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the berry");
        String berry = input.nextLine();
        char initial = berry.charAt(0);
        if (initial == 'E') System.out.println("You ordered Elderberry");
        else if (initial == 'G') System.out.println("You ordered Gooseberry");
        else if (initial == 'L') System.out.println("You ordered Lingonberry");
        else System.out.println("Berry not recognized");
    }
}
