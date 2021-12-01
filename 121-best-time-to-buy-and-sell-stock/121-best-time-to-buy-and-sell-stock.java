class Solution {
    public int maxProfit(int[] prices) {
        // If only 1 element, no selling available so return 0
        if (prices.length == 1) return 0;
        
        int min = prices[0];
        int profit = 0;
        
        // Similar to problem of maximum subarray, 
        // Store the global minimum and max profit as iterate through the array
        for (int i=0; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(prices[i]-min, profit);
        }
        return profit;
    }
}