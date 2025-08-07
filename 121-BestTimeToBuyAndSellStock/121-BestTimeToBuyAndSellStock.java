// Last updated: 8/7/2025, 6:19:08 PM
import java.lang.Math;
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfitSoFar = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++) {
            min = Math.min(min, prices[i]);
            int profit = prices[i] - min;
            maxProfitSoFar = Math.max(profit, maxProfitSoFar);
        }
        return maxProfitSoFar > 0 ? maxProfitSoFar : 0;
    }
}