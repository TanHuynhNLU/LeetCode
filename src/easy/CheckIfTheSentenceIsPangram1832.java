package easy;

public class CheckIfTheSentenceIsPangram1832 {
    public static boolean checkIfPangram(String sentence) {
        int[] counts = new int[26];
        char[] chars = sentence.toCharArray();
        for (char c : chars) {
            counts[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] == 0) return false;
        }
        return true;
    }

//    public boolean checkIfPangram(String sentence) {
//        if(sentence.length()<26)
//            return false;
//        boolean res=true;
//        for( char ch='a';ch<='z';ch++)
//        {
//            if(!sentence.contains(String.valueOf(ch)))
//            {
//                res=false;
//            }
//        }
//        if(res)
//            return true;
//        else
//            return false;
//    }

    public static void main(String[] args) {
        checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
    }
}
