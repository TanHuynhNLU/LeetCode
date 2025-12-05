package medium;

public class BeautifulArrangement526 {
    int res = 0;

    public int countArrangement(int n) {
        backtrack(n, new boolean[n + 1], 1);
        return res;
    }

    public void backtrack(int n, boolean[] visited, int pos) {
        if (pos == n + 1) {
            res++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i]) continue;
            if (i % pos == 0 || pos % i == 0) {
                visited[i] = true;
                backtrack(n, visited, pos + 1);
                visited[i] = false;
            }
        }
    }

    // Best Solution
//    public int countArrangement(int n) {
//        int[] arr = {1, 2, 3, 8, 10, 36, 41, 132, 250, 700, 750, 4010, 4237, 10680, 24679};
//        return arr[n - 1];
//    }
}
