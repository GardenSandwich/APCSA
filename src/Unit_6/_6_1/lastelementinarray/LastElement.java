package Unit_6._6_1.lastelementinarray;

public class LastElement {
    public static void main(String[] args)
    {
        double[] unitCircle = new double[]{0, 1.57, 3.14, 6.28, 7.85};
        //get and print the last element of the array
        System.out.println("The final unit circle value is " + getLastElement(unitCircle));
    }

    public static double getLastElement(double[] arr)
    {

        return arr[arr.length - 1]; // Your code goes here!
    }
}
