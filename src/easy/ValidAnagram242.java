package easy;

public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] chars = new int[256];
        for (char c: s.toCharArray()){
            chars[c]++;
        }

        for (char c: t.toCharArray()){
            if(chars[c]==0) return false;
            chars[c]--;
        }
        return true;
    }
}
