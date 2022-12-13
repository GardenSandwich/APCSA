package Unit_6._6_3.largestvalue;

public class LargestValue {
    public static void main(String[] arg)
    {
        {
            int[] values = {32, 56, 79, 2, 150, 37};

            int highestValue = findMax(values);
            System.out.println("The highest score is " + highestValue);
        }
    }
    public static int findMax(int[] numbers)
    {
        int maxSoFar = numbers[0];

        // for each loop to rewrite as for loop
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;
    }
}
