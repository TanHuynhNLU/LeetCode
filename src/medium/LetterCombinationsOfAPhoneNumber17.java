package medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber17 {
    public List<String> letterCombinations(String digits) {
        String[] words = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        for (char digit : digits.toCharArray()) {
            List<String> combinations = new ArrayList<>();
            String letters = words[digit - '0'];
            for (char c : letters.toCharArray()) {
                if (result.size() == 0) {
                    combinations.add(String.valueOf(c));
                } else {
                    for (String s : result) {
                        StringBuilder sb = new StringBuilder(s);
                        sb.append(c);
                        combinations.add(sb.toString());
                    }
                }
            }
            result = combinations;
        }
        return result;
    }
}
