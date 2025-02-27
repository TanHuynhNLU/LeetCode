package easy;

public class FindTheKBeautyOfANumber2269 {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            int n = Integer.parseInt(sub);
            if (n != 0 && num % n == 0) count++;
        }
        return count;
    }
}
