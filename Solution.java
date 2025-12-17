class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int minPtr= 0;
        int max=0;
        for( int i = 0; i< prices.length - 1; i++){
            if(prices[i] < min && prices[i+1] > prices[i]){
                min = prices[i];
                minPtr = i;
            }
        }
        for( int i = minPtr; i< prices.length; i++){
            if(prices[i] > min && prices[i] > max){
                max = prices[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        int profit = max - min;
        return profit;
    }
    public static void main(String[] args){
        Solution obj= new Solution();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(obj.maxProfit(prices));
    }
}