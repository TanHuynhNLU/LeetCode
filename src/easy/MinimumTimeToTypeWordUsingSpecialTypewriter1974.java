package easy;

public class MinimumTimeToTypeWordUsingSpecialTypewriter1974 {
    public int minTimeToType(String word) {
        int sum = 0;
        char prev = 'a';
        for (char c : word.toCharArray()) {
            sum++;
            sum += distance(c,prev);
            prev = c;
        }
        return sum;
    }

    public int distance(char ch1, char ch2) {
        if (ch1 > ch2) return distance(ch2, ch1);
        return Math.min(ch2 - ch1, 'z' - ch2 + ch1 - 'a' + 1);
    }

    public static void main(String[] args) {
    }
}
