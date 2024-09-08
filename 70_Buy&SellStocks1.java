class Solution {
    public int maxProfit(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int profit =0;
        for(int i =0 ;i<prices.length;i++){
            minBuyPrice = Math.min(minBuyPrice,prices[i]);
                if(minBuyPrice<prices[i])
                {
                    profit=prices[i]-minBuyPrice;
                }
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
