class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;
        
        for(int num : prices) {
            if(num < buyPrice)    buyPrice = num;
            else if((num-buyPrice) > maxProfit)   maxProfit = num-buyPrice;
        }
        return maxProfit;
    }
}