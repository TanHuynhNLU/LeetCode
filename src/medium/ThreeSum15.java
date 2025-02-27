package medium;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (set.contains(nums[i])) continue;
            List<List<Integer>> twoSums = twoSum(nums, 0 - nums[i], i + 1);
            if (twoSums.size() > 0) {
                for (List<Integer> list : twoSums) {
                    list.add(nums[i]);
                    res.add(list);
                }
            }
            set.add(nums[i]);
        }
        return res;
    }

    public static List<List<Integer>> twoSum(int[] nums, int target, int start) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = start; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (!set.contains(nums[i])) {
                    List<Integer> list = new ArrayList<>();
                    list.add(map.get(nums[i]));
                    list.add(nums[i]);
                    res.add(list);
                    set.add(nums[i]);
                }
            } else map.put(target - nums[i], nums[i]);
        }
        return res;
    }

    //    Best solution
//    private List<List<Integer>> res;
//
//    public List<List<Integer>> threeSum(int[] nums) {
//        return new AbstractList<List<Integer>>() {
//            @Override
//            public int size() {
//                init();
//                return res.size();
//            }
//
//            @Override
//            public List<Integer> get(int index) {
//                init();
//                return res.get(index);
//            }
//
//            private void init() {
//                if (res != null) {
//                    return;
//                }
//                Arrays.sort(nums);
//                long partialSum;
//                Set<List<Integer>> output = new HashSet<>();
//                for (int i = 0; i < nums.length - 2; i++) {
//                    if (i > 0 && nums[i - 1] == nums[i]) continue;
//                    partialSum = nums[i];
//                    int l = i + 1;
//                    int r = nums.length - 1;
//                    while (l < r) {
//                        long partial = partialSum + nums[l] + nums[r];
//                        if (partial == 0) {
//                            output.add(Arrays.asList(nums[i], nums[l], nums[r]));
//                        }
//                        if (partial > 0) {
//                            r--;
//                            while (nums[r + 1] == nums[r] && l < r) r--;
//                        } else {
//                            l++;
//                            while (nums[l - 1] == nums[l] && l < r) l++;
//                        }
//                    }
//                }
//                res = new ArrayList<>(output);
//            }
//
//        };
//    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        threeSum(nums);
    }
}
