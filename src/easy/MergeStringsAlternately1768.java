package easy;

public class MergeStringsAlternately1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int i = 0;
        while (i < len1 && i < len2) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
            i++;
        }
        while (i < len1) {
            sb.append(chars1[i]);
            i++;
        }
        while (i < len2) {
            sb.append(chars2[i]);
            i++;
        }
        return sb.toString();
    }
}
