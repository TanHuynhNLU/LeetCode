package easy;

public class LongerContiguousSegmentsOfOnesThanZeros1869 {
    public static boolean checkZeroOnes(String s) {
        int countOnes = 0;
        int countZeros = 0;
        int maxOnes = 0;
        int maxZeros = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                if (countZeros == 0) {
                    maxOnes = Math.max(maxOnes, countOnes);
                    countOnes = 0;
                }
                countZeros++;
            } else {
                if (countOnes == 0) {
                    maxZeros = Math.max(maxZeros, countZeros);
                    countZeros =0;
                }
                countOnes++;
            }
        }
        maxOnes = Math.max(maxOnes, countOnes);
        maxZeros = Math.max(maxZeros, countZeros);
        return maxOnes > maxZeros;
    }

    public static void main(String[] args) {
        checkZeroOnes("011000111");
    }
}
