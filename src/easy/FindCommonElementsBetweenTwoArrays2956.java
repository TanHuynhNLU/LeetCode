package easy;

public class FindCommonElementsBetweenTwoArrays2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] counts1 = new boolean[101];
        boolean[] counts2 = new boolean[101];
        int ans1 = 0;
        int ans2 = 0;
        for (int n : nums1) {
            counts1[n] = true;
        }
        for (int n : nums2) {
            counts2[n] = true;
            if (counts1[n]) ans2++;
        }
        for (int n : nums1) {
            if (counts2[n]) ans1++;
        }
        return new int[]{ans1, ans2};
    }
}
