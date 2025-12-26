package medium;

import java.util.*;

public class NumberOfProvinces547 {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                res++;
            }
        }
        return res;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int pos) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(pos);
        visited[pos] = true;
        while (!stack.isEmpty()) {
            int index = stack.pop();
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i] && isConnected[index][i] == 1) {
                    stack.push(i);
                }
            }
            visited[index] = true;
        }
    }

    // Best Solution
//    private void solveDFS(int n, int[][] isConnected, int idx, boolean[] vis) {
//        vis[idx] = true;
//        for (int i = 0; i < n; i++) {
//            if (isConnected[idx][i] == 1 && !vis[i]) {
//                solveDFS(n, isConnected, i, vis);
//            }
//        }
//    }
//
//    public int findCircleNum(int[][] isConnected) {
//        int n = isConnected.length;
//        boolean[] vis = new boolean[n + 1];
//        int findConnection = 0;
//        for (int i = 0; i < n; i++) {
//            if (!vis[i]) {
//                solveDFS(n, isConnected, i, vis);
//                findConnection++;
//            }
//        }
//        return findConnection;
//    }
}
