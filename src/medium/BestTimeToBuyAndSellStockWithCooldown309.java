package medium;

public class BestTimeToBuyAndSellStockWithCooldown309 {
    // Dynamic Solution with three state: cooldown, buy, sell
//    public int maxProfit(int[] prices) {
//        int l = prices.length;
//        int[] cooldown = new int[l];
//        int[] buy = new int[l];
//        int[] sell = new int[l];
//        cooldown[0] = 0;
//        buy[0] = -prices[0];
//        sell[0] = Integer.MIN_VALUE;
//        for (int i = 1; i < l; i++) {
//            cooldown[i] = Math.max(cooldown[i - 1], sell[i - 1]);
//            buy[i] = Math.max(buy[i - 1], cooldown[i - 1] - prices[i]);
//            sell[i] = buy[i - 1] + prices[i];
//        }
//        return Math.max(cooldown[l - 1], sell[l - 1]);
//    }
}
