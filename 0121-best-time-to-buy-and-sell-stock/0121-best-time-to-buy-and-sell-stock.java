
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int day = 1;day<prices.length;day++){
            int currPrice = prices[day];
            if(currPrice < minPrice){
                minPrice = currPrice;
            }
            int profit = currPrice - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
        
    }
}

