package Unit_6.Labs.arrayclasswork;

public class ShiftRight {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 4, 2, 3, 5, 6, 2, 4, 0};

        //take up last value
        int lastValue = nums[nums.length-1];

        //move
        for (int i = nums.length - 2; i >= 0; i--) {
            nums[i+1] = nums[i];
        }

        //replace first value
        nums[0] = lastValue;

        //make the output look like an array
        System.out.print("[ ");

        for (int num: nums) {
           System.out.print(num + " ");
        }

        System.out.println("]");
    }
}
