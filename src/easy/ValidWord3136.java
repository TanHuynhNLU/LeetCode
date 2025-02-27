package easy;

public class ValidWord3136 {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean vowelFound = false;
        boolean consonantFound = false;
        boolean numberFound = false;
        for(char c: word.toCharArray()) {
            if(c=='@'||c=='#'||c=='$') return false;
            if(Character.isDigit(c)) continue;
            if(isVowel(Character.toLowerCase(c))) vowelFound = true;
            else consonantFound = true;
        }
        return vowelFound && consonantFound ;
    }

    public boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='o'||c=='u'||c=='i';
    }
}
