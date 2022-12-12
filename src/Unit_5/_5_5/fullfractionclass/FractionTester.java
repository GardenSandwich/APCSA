package Unit_5._5_5.fullfractionclass;

public class FractionTester {
    public static void main(String[] args) {
        Fraction first = new Fraction(1, 2);
        Fraction second = new Fraction(1, 3);
        System.out.println();

        System.out.println("BEFORE:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        first.add(second);

        System.out.println("AFTER:");

        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }
}
