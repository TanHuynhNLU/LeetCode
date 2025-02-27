package Test;

public class LexicographicallySmallestPalindrome2697 {
    public String makeSmallestPalindrome(String s) {
        int left,right;
        char[] chars = s.toCharArray();
        if(s.length()%2==0){
            right = s.length()/2;
            left = right-1;
        }else {
            right = s.length()/2+1;
            left = right-2;
        }
        while (left>=0 && right<s.length()){
            if(chars[left]>chars[right]){
                chars[left] = chars[right];
            }else {
                chars[right] = chars[left];
            }
            left--;
            right++;
        }
        return new String(chars);
    }
//    Best Solution
//public String makeSmallestPalindrome(String s) {
//    char[] newString = s.toCharArray();
//    int n = newString.length;
//
//    for(int i=0;i<n/2;i++){
//        int j = n-1-i;
//
//        if(newString[i] != newString[j]){
//            newString[i] = newString[j] = (char)Math.min(newString[i], newString[j]);
//        }
//    }
//    return new String(newString);
//}
}
