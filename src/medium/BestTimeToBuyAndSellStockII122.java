package medium;

public class BestTimeToBuyAndSellStockII122 {
//    public int maxProfit(int[] prices) {
//        if (prices.length == 1) return 0;
//        int maxProfit = 0;
//        int min = prices[0];
//        int max = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] > prices[i - 1]) {
//                max = prices[i];
//            } else {
//                maxProfit += max - min;
//                min = prices[i];
//                max = prices[i];
//            }
//        }
//        return maxProfit + max - min;
//    }

    //    Best Solution
    public static int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        int minele = prices[0];
        int dp[] = new int[prices.length];
        dp[0] = minele;
        int maxi = prices[0];
        int ele = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (maxi < prices[i]) {
                maxi = prices[i];
                dp[i] = prices[i];
            } else {
                maxi = prices[i];
                dp[i - 1] = ele;
                dp[i] = prices[i];
                ele = prices[i];
            }
        }

        if (dp[dp.length - 1] == prices[dp.length - 1]) {
            dp[dp.length - 1] = ele;
        }

        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum += prices[i] - dp[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        maxProfit(prices);
    }
}
