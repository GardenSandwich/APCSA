package Unit_3._3_5.rollercoaster;
import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How tall are you? ");
        int height = input.nextInt();
        System.out.println("How old are you? ");
        int age = input.nextInt();

        if (height >= 42 ) {
            if ( age >= 9) {
                System.out.println("Welcome aboard!");
            } else{
                System.out.println("Sorry, you are not eligible to ride");
            }
        } else {
            System.out.println("Sorry, you are not eligible to ride");
        }

    }
}
