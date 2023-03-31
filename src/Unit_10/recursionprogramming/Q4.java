package Unit_10.recursionprogramming;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("2 to the power of 3 = " + Exponent.calculateExponent(2, 3));
        System.out.println("3 to the power of 3 = " + Exponent.calculateExponent(3, 3));
        System.out.println("2 to the power of 5 = " + Exponent.calculateExponent(2, 5));
        System.out.println("5 to the power of 2 = " + Exponent.calculateExponent(5, 2));
        System.out.println("9 to the power of 2 = " + Exponent.calculateExponent(9, 2));
    }
}

class Exponent{
    public static int calculateExponent(int base, int exponent) {
        if (exponent == 0) return 1;
        else return base * calculateExponent(base, exponent - 1);
    }
}
