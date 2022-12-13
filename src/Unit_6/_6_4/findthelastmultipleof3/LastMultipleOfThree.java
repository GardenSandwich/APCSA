package Unit_6._6_4.findthelastmultipleof3;

public class LastMultipleOfThree {
    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The last multiple of 3 is " + findMultipleOfThree(numbers1));

    }

    public static int findMultipleOfThree(int[] arr)
    {
        int multiple = -1;

        for (int num : arr) {
            if (num % 3 == 0 ) multiple = num;
        }
        return multiple;
    }
}
