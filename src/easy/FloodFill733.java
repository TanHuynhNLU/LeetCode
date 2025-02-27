package easy;

public class FloodFill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        int tmp = image[sr][sc];
        image[sr][sc] = color;
        if (sr - 1 >= 0 && tmp == image[sr - 1][sc]) floodFill(image, sr - 1, sc, color);
        if (sr + 1 < image.length && tmp == image[sr + 1][sc]) floodFill(image, sr + 1, sc, color);
        if (sc - 1 >= 0 && tmp == image[sr][sc - 1]) floodFill(image, sr, sc-1, color);
        if (sc + 1 < image[sr].length && tmp == image[sr][sc + 1]) floodFill(image, sr, sc+1, color);
        return image;
    }
}
