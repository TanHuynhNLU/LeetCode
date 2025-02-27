package easy;

import java.util.Arrays;

public class AppleRedistributionIntoBoxes3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for (int a : apple) {
            sum += a;
        }
        int boxes = 0;
        for (int i = capacity.length - 1; i >= 0; i++) {
            sum -= capacity[i];
            boxes++;
            if (sum <= 0) return boxes;
        }
        return boxes;
    }
}
