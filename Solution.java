import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hash= new HashSet();
        int left=0;
        int right=0;
        int max=0;

        while( right < s.length()){
            if( !hash.contains(s.charAt(right))){
                hash.add(s.charAt(right));
                right++;
                max=Math.max(max, hash.size());
            }
            else{
                hash.remove(s.charAt(left));
                left++;    
                max=Math.max(max, hash.size());            
            }
        }
        return max;
    }
    public static void main(String [] args){
        Solution obj= new Solution();
        String s="aabcabcdef";
        int result=obj.lengthOfLongestSubstring(s);
        System.out.println(result);
}
}
