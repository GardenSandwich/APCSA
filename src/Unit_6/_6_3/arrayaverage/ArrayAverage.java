package Unit_6._6_3.arrayaverage;

public class ArrayAverage {
    private int[] values;

    public ArrayAverage(int[] theValues)
    {
        values = theValues;
    }

    public double getAverage()
    {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
