package easy;

import java.util.ArrayList;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if(!isAnagram(words[i], words[i-1])) result.add(words[i]);
        }
        return result;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != 0) return false;
        }
        return true;
    }
}
