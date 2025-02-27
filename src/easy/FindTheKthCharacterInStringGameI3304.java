package easy;

public class FindTheKthCharacterInStringGameI3304 {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < k; i++) {
            sb.append(transform(sb.toString()));
            if (sb.length() >= k) return sb.charAt(k - 1);
        }
        return ' ';
    }

    public String transform(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ((chars[i] - 'a' + 1) % 26 + 'a');
        }
        return new String(chars);
    }

    //    Best solution
//    public char kthCharacter(int k) {
//        int count = 0;
//        for (int i = 10; i >= 0; i--)
//            if (k > Math.pow(2, i)) {
//                k -= Math.pow(2, i);
//                count++;
//            }
//        return (char) ('a' + count);
//    }
}
