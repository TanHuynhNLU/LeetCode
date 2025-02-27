package easy;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(String w : words){
            for (int i = w.length()-1; i >=0; i--) {
                sb.append(w.charAt(i));
            }
            sb.append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
//   Best solution
//    public String reverseWords(String s) {
//    char[] chars = s.toCharArray();
//    int left = 0, right = 0;
//    int l = chars.length;
//
//    while (left < l){
//        while (right < l && chars[right] != ' '){
//            right++;
//        }
//
//        reverseString(chars, left, right - 1);
//
//        left = right + 1;
//        right = left;
//    }
//    return new String(chars);
//}
//
    public static void reverseString(char[] chars, int start, int end) {
        while(start < end){
            char temp = chars[end];
            chars[end] = chars[start];
            chars[start] = temp;
            start++;
            end--;
        }
    }
}
