package easy;

public class LargestTriangleArea812 {
    public double largestTriangleArea(int[][] points) {
        double max =0;
        for (int i = 0; i <points.length-2 ; i++) {
            for (int j = i+1; j < points.length-1; j++) {
                for (int k = j+1; k < points.length; k++) {
                    int[] a =points[i];
                    int[] b = points[j];
                    int[] c = points[k];
                    double area =0.5*Math.abs(a[0]*(b[1]-c[1])+b[0]*(c[1]-a[1])+c[0]*(a[1]-b[1]));
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }
//    Best solution
//double maxArea = Integer.MIN_VALUE;
//    int[] idxList = new int[3];
//    int n, k;
//
//    public double largestTriangleArea(int[][] points) {
//        if(points == null) return 0;
//        n = points.length;
//        k = 3;
//        dfs(points, 0, 0);
//        return maxArea;
//    }
//    public void dfs(int[][] points, int pre, int idx){
//        if(idx >= k){
//            maxArea = Math.max(getArea(points), maxArea);
//            return;
//        }
//        for(int i = pre + 1; i <= n; i ++){
//            idxList[idx] = i - 1;
//            dfs(points, i, idx + 1);
//        }
//    }
//    public double getArea(int[][] points){
//        return Math.abs(0.5 * (points[idxList[0]][0] * (points[idxList[1]][1] - points[idxList[2]][1]) +
//                points[idxList[1]][0] * (points[idxList[2]][1] - points[idxList[0]][1]) +
//                points[idxList[2]][0] * (points[idxList[0]][1] - points[idxList[1]][1])));
//    }
}
