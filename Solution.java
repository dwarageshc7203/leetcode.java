/* class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer= new ArrayList<>();

        for(int i=0; i< nums.length-2; i++){
            int right=nums.length-1;
            int left= i+1;

            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }

            while(left< right){
                if( nums[left]+ nums[i]+ nums[right]==0){
                    answer.add(Arrays.asList(nums[left], nums[i], nums[right]));

                    while( left< right && nums[left]==nums[left+1]){
                        left++;
                    }

                    while( left< right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }

                else if(nums[left]+ nums[i]+ nums[right]<0){
                    left++;
                }

                else{
                    right--;
                }  
        }
        }
        return answer;
    }
} */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            int right = nums.length - 1;
            int left = i;

            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while ( left < right){
                if(nums[left] + nums[left+1] + nums[right] == 0 ){
                    output.add(Arrays.asList(nums[left] , nums[left+1] , nums[right]) );
                    
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                
                else if(nums[left] + nums[left + 1] + nums[right] > 0){
                    right--;
                }                
                
                else{
                    left++;
                }
            }
        }
        return output;
    }

    public static void main(String[] args){
        Solution obj = new Solution();

        int[] nums = {-1,0,1,2,-1,-4};

        obj.threeSum(nums);
    }
}