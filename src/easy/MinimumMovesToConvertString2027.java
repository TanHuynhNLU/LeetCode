package easy;

public class MinimumMovesToConvertString2027 {
    public int minimumMoves(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] == 'X') {
                count++;
                i+=2;
            }
        }
        return count;
    }
}
