package easy;

import java.util.ArrayList;
import java.util.List;

public class FindIndicesOfStableMountains3285 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) result.add(i);
        }
        return result;
    }
}
