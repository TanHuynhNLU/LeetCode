package easy;

public class FindLuckyIntegerInAnArray1394 {
    public int findLucky(int[] arr) {
        int res = -1;
        int[] counts = new int[501];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
        for (int i = 1; i < 501; i++) {
            if (i == counts[i]) res = counts[i];
        }
        return res;
    }
}
