package medium;

public class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
       int left = 0, right = height.length - 1;
       int maxArea = 0;
       while (left < right) {
           if (height[left] <= height[right]) {
               maxArea = Math.max(maxArea, height[left] * (right - left));
               left++;
           }else {
               maxArea = Math.max(maxArea, height[right] * (right - left));
               right--;
           }
       }
       return maxArea;
    }

//    public static int maxArea(int[] height) {
//        int left = 0;
//        int right = height.length - 1;
//        int max = Integer.MIN_VALUE;
//        while (left < right) {
//            int h = Math.min(height[left], height[right]);
//            max = Math.max(max, h * (right - left));
//            while (left < right && height[left] <= h) {
//                left++;
//            }
//
//            while (left < right && height[right] <= h) {
//                right--;
//            }
//        }
//        return max;
//    }
}
