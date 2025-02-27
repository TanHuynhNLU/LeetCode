package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        int i;
        long ans = 1;
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (i = 1; i < rowIndex; i++) {
            ans = ans * (rowIndex - i);
            ans /= i;
            result.add((int) ans);
        }
        return result;
    }
}
