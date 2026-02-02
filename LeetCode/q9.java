// class Solution {
class q9 {
    public static boolean isPalindrome(int x) {
        int left = 0;
        String val = Integer.toString(x);
        int right = val.length() - 1;
        boolean ans = true;

        System.out.println(val.length() + " : " + val);
        
        if( val.length() == 1)
            ans =  true;
            

        while( left < right && ans){
            System.out.println(val.charAt(left) + " : " + val.charAt(right) + " :: " + left + " : " + right);
            
            if(val.charAt(left) == val.charAt(right)){
                left ++;
                right --;
                ans =  true;
                
            }
            else{
                ans = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 1000021;
        System.out.println(isPalindrome(x));

    }
}