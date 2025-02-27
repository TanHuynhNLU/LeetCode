package easy;

public class SumOfDigitsOfStringAfterConvert1945 {
    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(c-'a'+1);
        }
        for (int i = 0; i < k; i++) {
            int sum = sumOfDigits(sb.toString());
            sb = new StringBuilder();
            sb.append(sum);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int sumOfDigits(String s) {
        int sum = 0;
        for(char c: s.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    public static void main(String[] args) {
        getLucky("iiii",1);
    }
}
