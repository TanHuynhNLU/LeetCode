package medium;

public class ArrayNesting565 {
    public int arrayNesting(int[] nums) {
        int max = 0;
        boolean[] visited = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, dfs(nums, visited, 0, i));
        }
        return max;
    }

    public int dfs(int[] nums, boolean[] visited, int count, int target) {
        if (visited[target]) return count;
        visited[target] = true;
        return dfs(nums, visited, count + 1, nums[target]);
    }

    //    Best solution
//    public int arrayNesting(int[] nums) {
//        int res = 0;
//        for (int i = nums.length - 1; i >= 0 && res < (i + 1); --i) {
//            int len = 0;
//            for (int j = i; nums[j] != -1; ) {
//                ++len;
//                final int next = nums[j];
//                nums[j] = -1;
//                j = next;
//            }
//            res = Math.max(res, len);
//        }
//        return res;
//    }
}
