package easy;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount2144 {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (count == 2) {
                count = 0;
                continue;
            }
            sum += cost[i];
            count++;
        }
        return sum;
    }
}
