class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for(int i = 0, len = prices.length; i < len; i++) {
            if(prices[i] < min) min = prices[i];
            else if(prices[i] > min) maxProfit = Math.max(maxProfit,prices[i] - min);
        }
        return maxProfit;
    }
}
