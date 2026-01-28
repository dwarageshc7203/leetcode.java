import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

class q169 {
// class Solution {
    public static int majorityElement(int[] nums) {
        HashMap <Integer, Integer> hash = new HashMap<>();

        Arrays.sort(nums);

        int ans = 0;
        int left = 0;
        int right = left + 1;
        int temp;

        int maxCount = 0;
        int count = 1;

        if(nums.length == 1)
            ans = nums[0];
        
        while ( left <= right && right < nums.length)
        {
            System.out.println("Left: " + left + " : Right: " + right);
            if(nums[left] == nums[right])
            {
                count ++;
                right ++;
                hash.put( nums[left], count);
            }
            else{
                left = right;
                count = 1;
                right++;
                hash.put( nums[left], count);
            }
            if( count >= maxCount)
            {
                    maxCount = count;
            } 
            System.out.println("Left: " + left + " : Right: " + right);
            System.out.println("Count: " + count + " : maxCount: " + maxCount);
            System.out.println(hash);
            
        }

        for( Entry <Integer, Integer> entry : hash.entrySet())
            if(entry.getValue().equals(maxCount))
                ans = entry.getKey();
        return ans;
    }

    public static void main(String[] args)
    {
        int[] nums = { 2, 2, 2, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
