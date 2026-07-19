class Solution {
    public int maxProfit(int[] prices) {

        // Stores the total profit earned
        int profit = 0;

        // Start from the second day since we'll compare with the previous day
        for (int i = 1; i < prices.length; i++) {

            // If today's price is higher than yesterday's,
            // we can make a profit by buying yesterday and selling today.
            if (prices[i] > prices[i - 1]) {

                // Add only the positive profit
                profit += prices[i] - prices[i - 1];
            }
        }

        // Return the maximum profit
        return profit;
    }
}