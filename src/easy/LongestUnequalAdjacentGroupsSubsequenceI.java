package easy;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        if (words.length == 1) return List.of(words[0]);
        List<String> check0 = checkSubsequence(words, groups, 0);
        List<String> check1 = checkSubsequence(words, groups, 1);
        return check0.size() > check1.size() ? check0 : check1;
    }

    public static List<String> checkSubsequence(String[] words, int[] groups, int flag) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length && groups[i] != flag) i++;
        while (i < words.length) {
            result.add(words[i]);
            while (i < groups.length && groups[i] == flag) i++;
            if (flag == 0) flag = 1;
            else flag = 0;
        }
        return result;
    }

//    public List<String> getLongestSubsequence(String[] words, int[] groups) {
//        ArrayList<String> ans = new ArrayList<>();
//        int last = -1;
//        for (int i = 0; i < groups.length; i++) {
//            if (groups[i] != last) {
//                ans.add(words[i]);
//                last = groups[i];
//            }
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        String[] words = {"lr", "h"};
        int[] groups = {0, 0};
        getLongestSubsequence(words, groups);
    }
}
