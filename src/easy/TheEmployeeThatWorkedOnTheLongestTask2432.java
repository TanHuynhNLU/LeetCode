package easy;

public class TheEmployeeThatWorkedOnTheLongestTask2432 {
    public static int hardestWorker(int n, int[][] logs) {
        int prev = 0, max = -1, ans = 501;
        for (int[] log : logs) {
            if (log[1] - prev > max) {
                max = log[1] - prev;
                ans = log[0];
            }
            if (log[1] - prev == max && log[0] < ans) ans = log[0];
            prev = log[1];
        }
        return ans;
    }

    public static void main(String[] args) {
        hardestWorker(10, new int[][]{{0, 3}, {2, 5}, {0, 9}, {1, 1}});
    }
}
