package easy;

public class ReverseBits190 {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans<<=1;
            ans = ans|(n&1);
            n>>=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(-384095221));
    }
}
