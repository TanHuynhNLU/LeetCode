package easy;

public class KthMissingPositiveNumber1539 {
    public int findKthPositive(int[] arr, int k) {
        boolean[] flag = new boolean[1001];
        for (int i = 0; i < arr.length; i++) {
            flag[arr[i]] = true;
        }
        int count = 0;
        for (int i = 1; i < 1001; i++) {
            if (flag[i] == false && ++count == k) return i;
        }
        return 0;
//        Best solution
//        int low = 0, high = arr.length - 1;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            int missing = arr[mid] - (mid + 1);
//            if (missing < k) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return k + high + 1;
    }
}
