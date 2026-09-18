class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int low = Integer.MAX_VALUE;
        for(int price : prices) {
            if(price < low) {
                low = price;
            } 

            if(profit < (price - low)) {
                profit = price - low;
            }
        }
        return profit;
    }
}
