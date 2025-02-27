package easy;

public class BuyTwoChocolates2706 {
    public int buyChoco(int[] prices, int money) {
        int min1 = 101;
        int min2 = 101;
        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }
        return money-min1-min2>=0?money-min1-min2:money;
    }
}
