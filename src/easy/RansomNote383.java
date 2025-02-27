package easy;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[123];
        for (char c : magazine.toCharArray()){
            chars[c]++;
        }
        for (char c : ransomNote.toCharArray()){
            if(chars[c]>0){
                chars[c]--;
            }else return false;
        }
        return true;
//        Best solution
//        int[] indexToStartFromForChar = new int[26];
//        int index;
//        for (char ranChar : ransomNote.toCharArray()) {
//            index = magazine.indexOf(ranChar, indexToStartFromForChar[ranChar - 'a']);
//            if (index == -1) {
//                return false;
//            }
//            indexToStartFromForChar[ranChar - 'a'] = index + 1;
//        }
//        return true;
    }
}
