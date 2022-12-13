package Unit_3.Labs.unit3practice;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");
        double score = input.nextDouble();
        if(score <= 69) System.out.println("Fail (F)");
        else if (score >= 70 && score <= 79) System.out.println("C");
        else if (score >= 80 && score <= 89) System.out.println("B");
        else System.out.println("A");
    }
}
