class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap();
        int a = 0;
        int b = 0;

        for( int i = 0; i< nums.length; i++){
            int complement =target - nums[i];
            if(hash.containsKey(complement)){
                a = hash.get(complement);
                b = i;
            }
            else{
                hash.put( nums[i] , i );
            }
        }
        return new int[] {a,b};
    }
}