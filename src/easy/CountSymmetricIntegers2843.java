package easy;

public class CountSymmetricIntegers2843 {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if(isSymmetric(String.valueOf(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean isSymmetric(String s) {
        int sum1 = 0, sum2 = 0;
        if(s.length() % 2 != 0) return false;
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            sum1+=Character.getNumericValue(s.charAt(i));
            sum2+=Character.getNumericValue(s.charAt(i+n/2));
        }
        return sum1 == sum2;
    }
}
