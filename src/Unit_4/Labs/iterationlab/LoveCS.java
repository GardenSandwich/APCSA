package Unit_4.Labs.iterationlab;
import java.util.Scanner;

public class LoveCS {
    public static void main(String[] args) {
        //make new scanner object
        Scanner input = new Scanner(System.in);
//        final int LIMIT = 10;
        int count = 1;
        //total sum for final line
        int total = 0;

        //ask for repetitions
        System.out.println("How many times do you love computer science?");
        int reps = input.nextInt();

        while (count <= reps){
            //Print repetition number
            System.out.println( count + " I love Computer Science!!");
            //add the repetition number to the total
            total += count;
            count++;
        }
        //print number of times printed
        System.out.println("Printed this message " + reps + " times. The sum of numbers from 1 to " + reps + " is " + total+ " .");
    }
}
