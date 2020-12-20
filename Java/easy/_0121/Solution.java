package easy._0121;

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min) min = prices[i];
            ans = Math.max(ans, prices[i] - min);
        }
        return ans;
    }
}