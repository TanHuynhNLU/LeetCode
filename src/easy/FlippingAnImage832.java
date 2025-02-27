package easy;

public class FlippingAnImage832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image.length];
        for (int i = 0; i < image.length; i++) {
            int count = 0;
            for (int j = image.length-1; j>=0; j--) {
                res[i][count++]=image[i][j]^1;
            }
        }
        return res;
    }
}
