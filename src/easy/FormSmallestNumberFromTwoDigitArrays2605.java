package easy;

public class FormSmallestNumberFromTwoDigitArrays2605 {
    public static int minNumber(int[] nums1, int[] nums2) {
        int[] counts1 = new int[10];
        int[] counts2 = new int[10];
        for (int num : nums1) {
            counts1[num]++;
        }
        for (int num : nums2) {
            counts2[num]++;
        }
        for (int i = 1; i < 10; i++) {
            if (counts1[i] > 0 && counts2[i] > 0) {
                return i;
            }
        }
        int n1 = 0, n2 = 0;
        for (int i = 1; i < 10; i++) {
            if (counts1[i] > 0) {
                n1 = i;
                break;
            }
        }
        for (int i = 1; i < 10; i++) {
            if (counts2[i] > 0) {
                n2 = i;
                break;
            }
        }
        return n1 > n2 ? n2 * 10 + n1 : n1 * 10 + n2;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3};
        int[] nums2 = {5, 7};
        minNumber(nums1, nums2);
    }
}
