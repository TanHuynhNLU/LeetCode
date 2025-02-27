package easy;

public class FinalPricesWithASpecialDiscountInAShop1475 {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            int min =0;
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]<=prices[i]){
                    min = prices[j];
                    break;
                }
            }
            prices[i]-=min;
        }
        return prices;
    }
}
