package easy;

public class ReverseOnlyLetters917 {
    public String reverseOnlyLetters(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] charS = s.toCharArray();
        while (left<right){
            if(!Character.isLetter(charS[left])){
                left++;
                continue;
            }
            if(!Character.isLetter(charS[right])){
                right--;
                continue;
            }
            char tmp = charS[left];
            charS[left] = charS[right];
            charS[right] = tmp;
            left++;
            right--;
        }
        return new String(charS);
    }
}
