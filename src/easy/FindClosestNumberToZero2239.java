package easy;

public class FindClosestNumberToZero2239 {
    public static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int res = Integer.MIN_VALUE;
        for (int num:nums) {
            if(Math.abs(num)<=min){
                if(Math.abs(res)==Math.abs(num)) {
                    res = Math.max(res,num);
                }else res = num;
                min = Math.abs(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findClosestNumber(new int[]{-10000,-10000});
    }
}
