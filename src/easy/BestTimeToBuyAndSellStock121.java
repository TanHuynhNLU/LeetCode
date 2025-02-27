package easy;

import java.util.TreeMap;

public class BestTimeToBuyAndSellStock121 {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
           if(max<prices[i]){
               max=prices[i];
           }if(min>prices[i]){
               min=prices[i];
               max=prices[i];
            }
           int profit = max -min;
           if(profit>maxProfit) maxProfit=profit;
        }
        return maxProfit;
    }
}
