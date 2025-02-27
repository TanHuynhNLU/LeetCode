package easy;

public class DetermineTheWinnerOfABowlingGame2660 {
    public int isWinner(int[] player1, int[] player2) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < player1.length; i++) {
            if (i >= 1 && player1[i - 1] == 10) {
                s1 += player1[i] * 2;
                continue;
            }
            if (i >= 2 && player1[i - 2] == 10) {
                s1 += player1[i] * 2;
                continue;
            }
            s1 += player1[i];
        }
        for (int i = 0; i < player2.length; i++) {
            if (i >= 1 && player2[i - 1] == 10) {
                s2 += player2[i] * 2;
                continue;
            }
            if (i >= 2 && player2[i - 2] == 10) {
                s2 += player2[i] * 2;
                continue;
            }
            s2 += player2[i];
        }
        if (s1 == s2) return 0;
        if (s1 > s2) return 1;
        if (s1 < s2) return 2;
        return 0;
    }
}
