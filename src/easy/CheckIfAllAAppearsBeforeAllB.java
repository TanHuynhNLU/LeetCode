package easy;

public class CheckIfAllAAppearsBeforeAllB {
    public boolean checkString(String s) {
        char prev = s.charAt(0);
        char[] chars = s.toCharArray();
        for (int i = 1; i < s.length(); i++) {
            if (chars[i] == 'a' && prev == 'b') return false;
            prev = chars[i];
        }
        return true;
    }
//    Best solution
//public boolean checkString(String s) {
//    for(int i=0;i<s.length()-1;i++){
//        if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
//            return false;
//
//        }
//
//    }
//    return true;
//
//}
}
