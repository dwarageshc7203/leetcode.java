class LeetCode{
    public int maxProfit(int[] prices) {
        int profit = 0;

        for( int i = 1; i< prices.length  ; i++){
            if( prices[i - 1] < prices[i]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        LeetCode obj= new LeetCode();
        int[] prices = {1,2,3,4,5};
        System.out.println(obj.maxProfit(prices));
    }
}