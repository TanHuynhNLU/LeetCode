package easy;

public class ReverseVowelOfAString345 {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        char tmp;
        while (left<right){
            if(!isVowel(s.charAt(left))){
                left++;
                continue;
            }
            if(!isVowel(s.charAt(right))){
                right--;
                continue;
            }
            tmp = chars[left];
            chars[left] =chars[right];
            chars[right]=tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
    public static boolean isVowel(char c){
        char a = Character.toLowerCase(c);
        if(a=='a'||a=='o'||a=='e'||a=='u'||a=='i') return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
