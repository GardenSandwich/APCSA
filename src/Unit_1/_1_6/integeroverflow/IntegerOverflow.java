package Unit_1._1_6.integeroverflow;

public class IntegerOverflow {
    public static void main(String[] args) {
        int bigInt = Integer.MAX_VALUE;
        int smallInt = Integer.MIN_VALUE;
        System.out.println(smallInt);
        System.out.println(bigInt);
        System.out.println(smallInt - 1);
        System.out.println(bigInt + 1);
        //values will roll over to the other end of the spectrum ie. -2147483648 to 2147483647 and vice versa
    }
}
