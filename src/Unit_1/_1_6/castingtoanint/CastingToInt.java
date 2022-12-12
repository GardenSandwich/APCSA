package Unit_1._1_6.castingtoanint;
import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Double pls:");
        double myDouble = input.nextDouble();

        System.out.println(myDouble);
        int newInt = (int)myDouble;
        System.out.println(newInt);

        myDouble += 0.5;
        System.out.println(myDouble);

        newInt = (int)myDouble;
        System.out.println(newInt);
    }
}

