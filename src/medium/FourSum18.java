package medium;

import java.util.*;

public class FourSum18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int sum = nums[i] + nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum2 = sum + nums[left] + nums[right];
                    if (sum2 == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    }
                    if (sum2 < target) {
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                    } else {
                        right--;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    //    Popular Solution
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
//        int n = nums.length;
//        Arrays.sort(nums);
//        for (int i = 0; i < n; i++) {
//            if (i != 0 && nums[i] == nums[i - 1]) continue;
//            for (int j = i + 1; j < n; j++) {
//                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
//                int k = j + 1;
//                int l = n - 1;
//                while (k < l) {
//                    long sum = (long) nums[i];
//                    sum += nums[j];
//                    sum += nums[k];
//                    sum += nums[l];
//                    if (sum > target) {
//                        l--;
//                    } else if (sum < target) k++;
//                    else {
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        temp.add(nums[l]);
//                        ans.add(temp);
//                        k++;
//                        l--;
//                        while (k < l && nums[k] == nums[k - 1]) k++;
//                        while (k < l && nums[l] == nums[l + 1]) l--;
//                    }
//                }
//            }
//        }
//        return ans;
//    }

    //    Best Solution
//    private List<List<Integer>> result;
//
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        return new AbstractList<List<Integer>>() {
//            public List<Integer> get(int index) {
//                init();
//                return result.get(index);
//            }
//
//            public int size() {
//                init();
//                return result.size();
//            }
//
//            private void init() {
//                List<List<Integer>> res = new ArrayList<>();
//                Set<List<Integer>> resSet = new HashSet<>();
//                int n = nums.length;
//                Arrays.sort(nums);
//                for (int i = 0; i < n - 3; i++) {
//                    for (int j = i + 1; j < n - 2; j++) {
//                        long newTarget = (long) target - (long) nums[i] - (long) nums[j];
//                        int low = j + 1, high = n - 1;
//                        while (low < high) {
//
//                            if (nums[low] + nums[high] == newTarget) {
//                                resSet.add(Arrays.asList(nums[low], nums[high], nums[i], nums[j]));
//                                while (low < high && nums[low] == nums[low + 1]) low++;
//                                while (low < high && nums[high] == nums[low - 1]) high--;
//                                low++;
//                                high--;
//                            } else if (nums[low] + nums[high] < newTarget) {
//                                low++;
//                            } else {
//                                high--;
//                            }
//                        }
//                    }
//                }
//                res.addAll(resSet);
//                result = res;
//            }
//        };
//    }

    public static void main(String[] args) {
        fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
    }
}
