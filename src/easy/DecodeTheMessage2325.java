package easy;

public class DecodeTheMessage2325 {
    public static String decodeMessage(String key, String message) {
        char[] decoded = new char[26];
        int start = 97;
        for (char c : key.toCharArray()) {
            if (c!=' '&&decoded[c - 'a'] == '\u0000') {
                decoded[c - 'a'] = (char) start;
                start++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') sb.append(' ');
            else sb.append(decoded[c - 'a']);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv");
    }
}
