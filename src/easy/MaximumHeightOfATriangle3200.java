package easy;

public class MaximumHeightOfATriangle3200 {
    public static int maxHeightOfTriangle(int red, int blue) {
        return Math.max(calcHeight(red, blue), calcHeight(blue, red));
    }

    public static int calcHeight(int red, int blue) {
        int h = 0;
        int i = 1;
        while (red > 0 || blue > 0) {
            if (i % 2 == 1) {
                if (red >= i) {
                    red -= i;
                    h++;
                } else return h;
            } else {
                if (blue >= i) {
                    blue -= i;
                    h++;
                } else return h;
            }
            i++;
        }
        return h;
    }

    public static void main(String[] args) {
        calcHeight(4,2);
    }
}
