package easy;

public class ReversePrefixOfWord2000 {
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        char[] chars = word.toCharArray();
        int i = 0;
        for (; i < chars.length; i++) {
            sb.append(chars[i]);
            if (chars[i] == ch) {
                sb.reverse();
                i++;
                break;
            }
        }
        for (; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        reversePrefix("abcdefd", 'd');
    }
}
