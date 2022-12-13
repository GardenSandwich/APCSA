package Unit_6.Labs.arrayclasswork;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = { 5, 1, 4, 2, 3, 5, 6, 2, 4}; //5, 4, 2 are duplicates

        //iterate through each value
        for (int i = 0; i < nums.length; i++) {
            //iterate through every other value to compare for the same value
            for (int j = 0; j < nums.length; j++) {
                //skip the current value the outer loop is comparing to
                if(j == i) continue;

                if(nums[j] == nums[i]) {
                    System.out.print(nums[i] + ", ");
                    //Make sure the value cannot be found twice as a duplicate
                    nums[i] = Integer.MIN_VALUE;
                }
            }
        }

        System.out.println("are duplicates");
    }
}
