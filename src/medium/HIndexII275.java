package medium;

public class HIndexII275 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (citations[mid] >= n - mid) right = mid - 1;
            else left = mid + 1;
        }
        return n - left;
    }
}
