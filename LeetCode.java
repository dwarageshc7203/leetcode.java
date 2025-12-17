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
        for ( int i = 5 ; i >0 ; i--){
            for ( int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}