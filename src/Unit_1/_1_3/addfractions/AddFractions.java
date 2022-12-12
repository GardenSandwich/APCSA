package Unit_1._1_3.addfractions;

public class AddFractions {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int denom1 = 3;
        int denom2 = 4;

        System.out.println("The numerator of the first fraction is " + num1);
        System.out.println("The denominator of the first fraction is " + denom1);
        System.out.println("The numerator of the second fraction is " + num2);
        System.out.println("The denominator of the second fraction is " + denom2);
        System.out.println("The sum of " + num1 + "/" + denom1 + " and " + num2 + "/" + denom2 + " is " + (num1*denom2+ num2*denom1) + "/" + (denom1*denom2));
    }
}
