package easy;

public class ImageSmoother661 {
    public int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                res[i][j] = average(img,i,j);
            }
        }
        return res;
    }
    public static int average(int[][]img,int i, int j){
        int sum = 0;
        int count = 0;
        for (int row = i-1>=0?i-1:0;row<=i+1&&row<img.length;row++){
            for (int col = j-1>=0?j-1:0;col<=j+1&&col<img[i].length;col++){
                sum+=img[row][col];
                count++;
            }
        }
        return (int)Math.floor((double)sum/count);
    }

    public static void main(String[] args) {
        int[][] img = {{100,200,100},{200,50,200},{100,200,100}};
        System.out.println(average(img,1,1));
    }
}
