package Unit_1._1_6.movieratings;
import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask for rating and round to nearest whole number
        System.out.println("Enter your rating: ");
        double rating = input.nextDouble();
        System.out.println("Rating Rounded: " + (int)(rating+ 0.5));
    }
}
