package easy;

public class MaximumAreaOfLongestDiagonalRectangle3000 {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiag = 0.0;
        int area = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double diag = Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]);
            if (diag > maxDiag) {
                maxDiag = diag;
                area = dimensions[i][0] * dimensions[i][1];
            } else if (diag == maxDiag) {
                area = Math.max(area, dimensions[i][0] * dimensions[i][1]);
            }
        }
        return area;
    }
}
