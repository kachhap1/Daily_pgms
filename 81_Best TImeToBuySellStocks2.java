class Solution {
    public int maxProfit(int[] prices) 
    {
        int maxProfit =0;
        int minPrice =prices[0];
         int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            int curr = prices[i];
                if(curr<minPrice)
                {
                    minPrice = curr;
                }else{
                    profit = curr-minPrice;
                    maxProfit+= profit;
                    minPrice = curr;
                }
            
        }
        return maxProfit;
    }
}
