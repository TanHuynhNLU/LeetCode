package medium;

public class RectangleArea223 {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        int cx1 = Math.max(ax1, bx1);
        int cy1 = Math.max(ay1, by1);
        int cx2 = Math.min(ax2, bx2);
        int cy2 = Math.min(ay2, by2);

        int overlap = (cx2 - cx1) * (cy2 - cy1);

        if (cx2 > cx1 && cy2 > cy1) {
            return area1 + area2 - overlap;
        } else return area1 + area2;
    }

    // Best solution
//    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
//        int a = (ax2 - ax1) * (ay2 - ay1);
//        int b = (bx2 - bx1) * (by2 - by1);
//        int width = Math.min(ax2, bx2) - Math.max(ax1, bx1);
//        int height = Math.min(ay2, by2) - Math.max(ay1, by1);
//        return a + b - Math.max(height, 0) * Math.max(width, 0);
//
//    }
}
