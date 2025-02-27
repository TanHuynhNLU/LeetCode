package easy;

public class ReplaceAllToAvoidConsecutiveRepeatingCharacters1576 {
    public String modifyString(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]=='?'){
                for (int j = 'a'; j <= 'z'; j++) {
                   if(i>0&&j==charArray[i-1]) continue;
                   if(i<charArray.length-1&&j==charArray[i+1]) continue;
                   charArray[i]=(char) j;
                   break;
                }
            }
        }
        return new String(charArray);
    }
}
