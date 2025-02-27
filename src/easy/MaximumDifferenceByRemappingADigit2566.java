package easy;

public class MaximumDifferenceByRemappingADigit2566 {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int min = num;
        int max = num;
        for (char c : s.toCharArray()) {
            if (c != '9') {
                String newStr = s.replace(c, '9');
                max = Integer.parseInt(newStr);
                break;
            }
        }
        for (char c : s.toCharArray()) {
            if (c != '0') {
                String newStr = s.replace(c, '0');
                min = Integer.parseInt(newStr);
                break;
            }
        }
        return max - min;
    }
}
