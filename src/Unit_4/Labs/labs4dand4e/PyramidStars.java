package Unit_4.Labs.labs4dand4e;
import java.util.Scanner;

//Alex Zhang, P3

public class PyramidStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number of lines:");
        int lines = input.nextInt();

        //first pyramid
        System.out.println("PYRAMID 1\n");
        for (int i = 1; i <= lines; i++) {
            //print leading amount of spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("  ");
            }
            //print decreasing sequence of numbers
            for (int k = i; k > 1; k--) {
                System.out.print(k + " ");
            }
            //print increasing starting from one
            for (int l = 1; l <= i; l++) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        System.out.println();

        //second pyramid
        System.out.println("PYRAMID 2\n");
        //print appropriate amount of rows
        for (int i = 1; i <= lines; i++) {
            //print leading amount of spaces
            for (int j = 1; j <= lines - i; j++) {
                System.out.print("   ");
            }
            //print increasing amounts (*2 each value)
            for (int k = 1; k < Math.pow(2, i); k *= 2) {
                System.out.print(k + "  ");
            }
            //print decreasing dividing by 2 each time
            for (int l = (int) Math.pow(2,(i-2)); l >= 1; l /= 2) {
                System.out.print(l + "  ");
            }
            System.out.println();
        }

        //STARS
        System.out.println("\nSTARS\n");

        //first pyramid, justified left
        for( int i = 1; i <= 10; i++){
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //second pyramid, justified right, growing towards bottom
        for (int i = 0; i <= 10; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //third pyramid, justified right, shrinking to bottom
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 10; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //fourth pyramid (stars), growing and then shrinking
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 4; i >= 0; i--) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 1+(i*2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
