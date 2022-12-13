package Unit_6.Labs.arrayclasswork;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 4, 2, 3, 15, 6, 2, 4};
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum is " + max);
    }
}
