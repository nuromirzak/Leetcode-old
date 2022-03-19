class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int p : prices) {
            if (min > p) {
                min = p;
            } else if (p - min > profit) {
                profit = p - min;
            }
        }
        return profit;
    }
}