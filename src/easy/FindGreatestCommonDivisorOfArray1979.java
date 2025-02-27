package easy;

public class FindGreatestCommonDivisorOfArray1979 {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return GCD(max,min);
    }
    public int GCD(int a, int b){
        if(a==0) return b;
        return GCD(a % b,b);
    }

    public static void main(String[] args) {

    }
}
