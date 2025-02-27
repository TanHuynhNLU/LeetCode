package easy;

public class SumOfAllSubsetXORTotals1863 {
    static int total = 0;

    public static int subsetXORSum(int[] nums) {
        solve(nums, new boolean[nums.length], 0, 0);
        return total;
    }

    public static void solve(int[] nums, boolean[] visited, int k, int prevXor) {
        if (k == nums.length) return;
        else {
            for (int i = 0; i < nums.length; i++) {
                if (visited[i]) continue;
                total += prevXor ^ nums[i];
                visited[i] = true;
                solve(nums, visited.clone(), k + 1, prevXor ^ nums[i]);
            }
        }
    }

//    int[] nums;
//    private int dfs(int index, int res) {
//        if(index == nums.length) return res;
//
//        return dfs(index+1, res ^ nums[index]) + dfs(index+1, res);
//    }
//    public int subsetXORSum(int[] nums) {
//        this.nums = nums;
//        return dfs(0, 0);
//    }

    public static void main(String[] args) {
        int[] nums = {5,1,6};
        System.out.println(subsetXORSum(nums));
    }
}
