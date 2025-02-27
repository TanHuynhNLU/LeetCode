package easy;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree2455 {
    public int averageValue(int[] nums) {
        int sum = 0;
        int n = 0;
        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                n++;
            }
        }
        return n == 0 ? 0 : (int) Math.floor(sum / n);
    }
}
