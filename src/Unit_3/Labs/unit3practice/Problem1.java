package Unit_3.Labs.unit3practice;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int year =  input.nextInt();

        if((year%4 == 0) && (year%100) != 0){
            System.out.println("Leap Year");
        } else if (((year%100) == 0) && (year%400) == 0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
