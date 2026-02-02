import java.util.Arrays;

public class q3010 {
// class Solution {
    public static int minimumCost(int[] nums) {
        int sum = nums[0];
        int a = 121;
        System.out.println((()a));
            Arrays.sort(nums, 1, nums.length);
            sum += nums[1] + nums[2];
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(minimumCost(nums));
    }
}
