package Unit_3._3_3.runningspeed;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How fast did you run?");
        int time = input.nextInt();
        if ( time < 223) System.out.println("Are you sure? That’s a new world record!");
        else System.out.println("Right on! Keep running!");
    }
}
