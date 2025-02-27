package easy;

public class PowerOfFour342 {
    public static boolean isPowerOfFour(int n) {
        //715827882 = (2^1) + (2^3) + (2^5) +...+(2^29)
        return (n>0)&&((n & (n-1))==0)&&((n & 715827882) == 0);
    }

    public static int aaa(int n) {
        if (n == 1) return 2;
        return (int) (Math.pow(2, n) + aaa(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(aaa(29));
    }
}
