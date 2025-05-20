package medium;

public class BullsAndCows299 {
    public String getHint(String secret, String guess) {
        int[] counter = new int[10];
        int countA = 0;
        int countB = 0;
        for (char c : secret.toCharArray()) {
            counter[c - '0']++;
        }
        for (int i = 0; i < guess.length(); i++) {
            int g = guess.charAt(i);
            int s = secret.charAt(i);
            if (g == s && counter[g - '0'] > 0) {
                countA++;
                counter[g - '0']--;
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            int g = guess.charAt(i);
            int s = secret.charAt(i);
            if (g != s && counter[g - '0'] > 0) {
                countB++;
                counter[g - '0']--;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(countA);
        sb.append("A");
        sb.append(countB);
        sb.append("B");
        return sb.toString();
    }
}
