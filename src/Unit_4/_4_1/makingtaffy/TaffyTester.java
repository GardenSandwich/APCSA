package Unit_4._4_1.makingtaffy;
import java.util.Scanner;

public class TaffyTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        System.out.println("Starting Taffy Timer...");
        while(true){
            System.out.print("Enter the temperature:");
            temp = input.nextInt();
            if(temp < 270){
                System.out.println("\nThe mixture isn't ready yet.");
            } else {
                System.out.println("Your taffy is ready for the next step!");
                break;
            }
        }
    }
}
