package easy;

public class MinimumTimeVisitingAllPoints1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i = 1; i < points.length; i++) {
            int lengthX = Math.abs(points[i][0] - points[i - 1][0]);
            int lengthY = Math.abs(points[i][1] - points[i - 1][1]);
            time += Math.max(lengthX, lengthY);
        }
        return time;
    }
}
