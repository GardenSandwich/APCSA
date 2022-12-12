package Unit_4.Labs.iterationlab;
import java.util.Scanner;

public class BackwardIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        //run until user quits
        while (true) {
            //ask for number
            System.out.print("Type in a number: ");
            num = input.nextInt();
            //if valid, print reverse, else start over
            if (num > 0 && num >= 1000) {
                reverse(num);
            } else continue;
            //ask if user would like to run again
            System.out.println("Run Again? (true/false)");
            if (input.nextBoolean() == false) break;
        }
    }

    public static void reverse(int num){
        while(num>0){
            System.out.println(num%10);
            num = num/10;
        }
    }
}
