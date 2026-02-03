// class Solution {
class q3637{
    public boolean isTrionic(int[] nums) {
        boolean ans = true;
        int i = 0;
        while (ans && i < nums.length - 1)
        {
            if( nums[0] > nums[1]){
                ans = false;
                break;
            }
            else if( nums[i] < nums[i + 1]){
                i++;
                ans = true;
            }
            else{
                break;
            }
        }
        int j = i;
        while ( ans && j < nums.length - 1 )
        {
            if( nums[j] > nums[j + 1]){
                j++;
                ans = true;
            }
            else{
                break;
            }
        }
        int k = j;
        if( k == nums.length - 1){
            ans = false;
        }
        while (ans && k < nums.length - 1)
        {
            if( nums[k] < nums[k + 1])
            {
                k++;
                ans = true;
            }
            else{
                ans = false;
            }
        }

        return ans;
    }
}