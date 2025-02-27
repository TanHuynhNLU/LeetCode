package easy;

public class FindTheNumberOfWinningPlayers3238 {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] counters = new int[n][11];
        int res = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < pick.length; i++) {
            counters[pick[i][0]][pick[i][1]]++;
            if (!visited[pick[i][0]] && counters[pick[i][0]][pick[i][1]] > pick[i][0]) {
                res++;
                visited[pick[i][0]] = true;
            }
        }
        return res;
    }
}
