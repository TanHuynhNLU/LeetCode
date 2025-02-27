package easy;

public class NRepeatedElementSize2NArray961 {
    public int repeatedNTimes(int[] nums) {
        int[] countNums = new int[10001];
        for (int i = 0; i < nums.length; i++) {
            countNums[nums[i]]++;
            if (countNums[nums[i]] == 2) return nums[i];
        }
        return -1;
    }

    //    Best solution
//    final Set<Integer> set = new HashSet<>();
//        for(
//    int x :nums)
//
//    {
//        if (set.contains(x)) return x;
//        set.add(x);
//    }
//        return-1;
}
