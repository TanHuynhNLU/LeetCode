package easy;

public class WaterBottles1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        while (numBottles / numExchange != 0) {
            int n = numBottles / numExchange;
            sum += n;
            numBottles = n + numBottles % numExchange;
        }
        return sum;
    }
}
