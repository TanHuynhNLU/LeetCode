package easy;

public class NumberOfEvenAndOddBits2595 {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int count = 0;
        while (n != 0) {
            int i = n&1;
            if(i==1){
                if(count%2==0) even++;
                else odd++;
            }
            n>>>=1;
            count++;
        }
        return new int[]{even, odd};
    }
}
