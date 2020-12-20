package medium._0714.by_Greedy;

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int tmp = prices[0];
        int res = 0;
        for(int i = 1; i < prices.length; i++){
            if(tmp > prices[i]) {
                tmp = prices[i];
            }else if(prices[i] > tmp + fee){
                res += (prices[i] - fee - tmp);
                tmp = prices[i] - fee;
            }
        }
        return res;
    }
}