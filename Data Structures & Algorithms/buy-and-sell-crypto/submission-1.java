class Solution {
    public int maxProfit(int[] prices) {
        int buyP = prices[0];
        int maxProfit = 0; // declare here, initialize to 0

        for (int x : prices) {
            if (x < buyP) {
                buyP = x; // found cheaper buy price
            }
            if ((x - buyP) > maxProfit) {
                maxProfit = x - buyP; // found better profit
            }
        }

        return maxProfit; // was missing
    }
}
