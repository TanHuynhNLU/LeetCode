package medium;

public class BeautifulArrangementII667 {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        boolean[] visited = new boolean[n + 1];
        res[0] = 1;
        visited[1] = true;
        int i = 1;
        while (k > 0) {
            int tmp = res[i - 1] - k;
            if (tmp > 0&&!visited[tmp]) {
                res[i] = tmp;
                visited[tmp] = true;
            } else {
                res[i] = res[i - 1] + k;
                visited[res[i - 1] + k] = true;
            }
            k--;
            i++;
        }
        int j = 2;
        for (; i < n; i++) {
            while (visited[j]) {
                j++;
            }
            res[i] = j;
            j++;
        }
        return res;
    }
    // Best solution
//    public int[] constructArray(int n, int k) {
//        int[] ans = new int[n];
//        for (int i = 0, a = 1, z = k + 1; i <= k; i++)
//            ans[i] = i % 2 == 1 ? z-- : a++;
//        for (int i = k+1; i < n;)
//            ans[i] = ++i;
//        return ans;
//    }
}
