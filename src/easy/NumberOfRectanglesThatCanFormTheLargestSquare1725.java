package easy;

public class NumberOfRectanglesThatCanFormTheLargestSquare1725 {
    public static int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]);
            if (min == max) count++;
            if (min > max) {
                max = min;
                count = 1;
            }
        }
        return count;
    }

//    Best solution
//    public int countGoodRectangles(int[][] rectangles) {
//    return goodRectangles(rectangles,minSideMax(rectangles,0,0),0,0);
//}
//    public int minSideMax(int[][] rectangles,int i,int max){
//        if (i == rectangles.length) {
//            return max;
//        }
//        int sideLen = Math.min(rectangles[i][0], rectangles[i][1]);
//        max = Math.max(max, sideLen);
//        return minSideMax(rectangles, i + 1, max);
//    }
//    public int goodRectangles(int[][] rectangles,int max,int count,int i){
//        if (i == rectangles.length) {
//            return count;
//        }
//        int sideLen = Math.min(rectangles[i][0], rectangles[i][1]);
//        if (sideLen == max) {
//            count++;
//        }
//        return goodRectangles(rectangles, max, count, i + 1);
//    }
    public static void main(String[] args) {
        int[][] rectangles = new int[][]{{2,3},{3,7},{4,3},{3,7}};
        countGoodRectangles(rectangles);
    }
}
