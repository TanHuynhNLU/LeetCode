package easy;

public class IncreasingDecreasingString1370 {
    public static String sortString(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            for (char i = 'a'; i <= 'z'; i++) {
                if (counts[i - 'a'] > 0) {
                    counts[i - 'a']--;
                    sb.append(i);
                    count++;
                }
            }
            if (count == 0) break;
            count = 0;
            for (char i = 'z'; i >= 'a'; i--) {
                if (counts[i - 'a'] > 0) {
                    counts[i - 'a']--;
                    sb.append(i);
                    count++;
                }
            }
            if (count == 0) break;
            count = 0;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        sortString("jcdlgiszuuzsigldcj");
    }
}
