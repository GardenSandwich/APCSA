package Unit_3.Labs.unit3practice;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        //variables for roots
        double root1;
        double root2;
        double imaginaryRoot;

        //ask for a b and c
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble();
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();

        //calculate discriminant (b^2 - 4ac)
        double discriminant =  (Math.pow(b,2) - (4 * a * c));

        //if there are two real roots (discriminant >0)
        if (discriminant >0){
            //calculate roots
            root1 = (((-1*b) + Math.sqrt(discriminant))/(2*a));
            root2 = (((-1*b) - Math.sqrt(discriminant))/(2*a));
                System.out.println("The roots are " + root1 + " and " + root2);

        }
        //if there is one root (discriminant = 0)
        else if (discriminant == 0) {
            System.out.println("The only root is : " + (-b/(2*a)));
        }
        //if there are imaginary roots (discriminant < 0)
        else if (discriminant < 0){
            //find POSITIVE root of discriminant
            imaginaryRoot = Math.sqrt( -1* discriminant);
            //print properly formatted complex roots
            System.out.println("The roots are: " + (-b/(2*a)) + " \u00B1 " + (imaginaryRoot/(2*a)) + "i") ;
        }
    }

}
