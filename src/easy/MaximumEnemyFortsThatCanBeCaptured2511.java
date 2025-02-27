package easy;

public class MaximumEnemyFortsThatCanBeCaptured2511 {
    public int captureForts(int[] forts) {
        int max = 0;
        int state = 0;
        int start = 0;
        for (int i = 0; i < forts.length; i++) {
            if (state == 0 && forts[i] == 1) {
                state = 1;
                start = i;
                continue;
            }
            if (state == 0 && forts[i] == -1) {
                state = -1;
                start = i;
                continue;
            }
            if (state == 1 && forts[i] == -1) {
                state = -1;
                max = Math.max(max, i - start - 1);
                start = i;
                continue;
            }
            if (state == 1 && forts[i] == 1) {
                start = i;
                continue;
            }
            if (state == -1 && forts[i] == 1) {
                state = 1;
                max = Math.max(max, i - start - 1);
                start = i;
                continue;
            }
            if (state == -1 && forts[i] == -1) {
                start = i;
            }
        }
        return max;
    }
}
