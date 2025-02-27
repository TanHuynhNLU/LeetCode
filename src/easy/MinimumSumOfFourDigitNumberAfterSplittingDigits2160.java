package easy;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits2160 {
    public static int minimumSum(int num) {
        int[] counts = new int[10];
        while (num != 0) {
            counts[num % 10]++;
            num /= 10;
        }
        int[] res = getNums(counts);
        return res[0]+res[1];
    }

    public static int[] getNums(int[] counts) {
        int[] res = new int[2];
        int k = 0;
        for (int i = 0; i < counts.length;) {
            if (counts[i] > 0) {
                res[k] = i;
                k++;
                counts[i]--;
            }
            else i++;
            if (k == 2) break;
        }
        k=0;
        for (int i = counts.length-1; i >=0; ) {
            if (counts[i] > 0) {
                res[k] = res[k]*10+i;
                k++;
                counts[i]--;
            }
            else i--;
            if (k == 2) break;
        }
        return res;
    }

    public static void main(String[] args) {
        minimumSum(6466);
    }
}
