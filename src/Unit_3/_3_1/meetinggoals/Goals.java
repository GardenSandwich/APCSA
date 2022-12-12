package Unit_3._3_1.meetinggoals;
import java.util.Scanner;

public class Goals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your goal:");
        int goal = input.nextInt();
        System.out.println("Enter your actual amount:");
        int actual = input.nextInt();

        System.out.println("Went over goal? " + (actual > goal));
        System.out.println("Did not meet goal? " + (actual < goal));
        System.out.println("Met goal exactly?" + (actual == goal));
    }
}
