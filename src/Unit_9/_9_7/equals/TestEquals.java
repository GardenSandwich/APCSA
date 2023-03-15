package Unit_9._9_7.equals;

public class TestEquals
{
    public static void main(String[] args)
    {
        System.out.println("** Object **");
        Object first = new Object();
        Object second = first;
        Object third = new Object();

        // Print out all three objects
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Print a true statement using 2 objects and ==
        System.out.println(first == second);

        // Print a false statement using 2 objects and ==
        System.out.println(first == third);

        // Print a true statement using 2 objects and .equals()
        System.out.println(first.equals(second));

        // Print a false statement using 2 objects and .equals()
        System.out.println(first.equals(third));

        System.out.println("** Ball **");


        Ball golfball = new Ball(1.5);
        Ball minigolf = golfball;
        Ball largeGolf = new Ball(1.5);

        // Print out all three objects
        System.out.println(golfball);
        System.out.println(minigolf);
        System.out.println(largeGolf);

        // Print a true statement using 2 objects and ==
        System.out.println(golfball == minigolf);

        // Print a false statement using 2 objects and ==
        System.out.println(golfball == largeGolf);

        // Print a true statement using 2 objects and .equals()
        System.out.println(golfball.equals(minigolf));

        // Print a false statement using 2 objects and .equals()
        System.out.println(golfball.equals(largeGolf));

    }
}

