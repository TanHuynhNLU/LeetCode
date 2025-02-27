package easy;

public class FirstLetterToAppearTwice2351 {
    public char repeatedCharacter(String s) {
        int[] chars = new int[26];
        for(char c : s.toCharArray()){
            chars[c - 'a']++;
            if(chars[c - 'a'] == 2) return c;
        }
        return ' ';
    }
}
