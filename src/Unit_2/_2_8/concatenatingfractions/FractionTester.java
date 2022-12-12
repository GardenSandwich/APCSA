package Unit_2._2_8.concatenatingfractions;
import java.util.Scanner;

public class FractionTester {
    public static void main(String[] args) {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction fraction1 = new Fraction(1, 2);
        // Ask for input
        System.out.print("Enter the numerator of the first fraction: ");
        int numer1 = input.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int denom1 = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction fraction2 = new Fraction(numer1, denom1);
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        int newnumer = fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator();
        int newdenom = fraction1.getDenominator() * fraction2.getDenominator();
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(fraction1.toString() + " + " + fraction2.toString() + "equals " + newnumer + "/" + newdenom);

    }
}
