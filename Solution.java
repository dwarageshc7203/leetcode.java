import java.util.HashMap;

public class Solution {
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rn = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                rn = nums[i];
            }
            else{
                map.put(nums[i], 1 );
            }
        }
        return rn;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,3};
        int result = repeatedNTimes(nums);
        System.out.println(result);
    }
}