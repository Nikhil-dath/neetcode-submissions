class Solution {
    public int maxProfit(int[] prices) { 

        int max_profit = 0;
        int max_price = prices[prices.length-1];

        for(int i = prices.length-2; i >= 0 ; i--){

            int profit = max_price - prices[i];

            max_profit = Math.max(profit, max_profit);

            max_price = Math.max(prices[i],max_price);

        }

        return max_profit;

    }

}


