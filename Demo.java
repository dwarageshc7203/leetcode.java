class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;
        int min = Integer.MAX_VALUE;
        for( int p : prices)
            if(p < min)
            {
                min = p;
            }

            else if(max < p - min)
            {
                max = p - min;
            }
        return max;
    }
}

public class Demo{
    public static void main(String[] args) {
        

        Solution obj = new Solution();

        int[] prices = {7,1,5,3,6,4};

        System.out.println(obj.maxProfit(prices));
    }
}