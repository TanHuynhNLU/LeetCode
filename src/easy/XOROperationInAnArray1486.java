package easy;

public class XOROperationInAnArray1486 {
    public int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= start + i * 2;
        }
        return res;
    }
}
