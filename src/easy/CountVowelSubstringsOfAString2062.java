package easy;

import java.util.HashSet;

public class CountVowelSubstringsOfAString2062 {
    public int countVowelSubstrings(String word) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if(isVowel(c)) sb.append(c);
            else {
                if(sb.length()>=5) {
                    ans+=check(sb.toString());
                }
                sb = new StringBuilder();
            }
        }
        return ans;
    }
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='o'||c=='u'||c=='i';
    }

    public int check(String s) {
        HashSet<Character> vowels = new HashSet<Character>();
        int i = 0, j = 0, ans = 0;
        while (i <= s.length() - 5 && j < s.length()) {
            vowels.add(s.charAt(j));
            if (vowels.size() == 5) {
                ans += s.length() - j;
                i++;
                j = i;
                vowels.clear();
            } else j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "aeiouu";
//        System.out.println(check(s));
    }
}
