package easy;

import java.util.HashSet;

public class UniqueMorseCodeWords804 {
    String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> set = new HashSet();
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            for (char c:word.toCharArray()){
                sb.append(morse[c-'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
