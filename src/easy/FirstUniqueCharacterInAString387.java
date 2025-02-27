package easy;

public class FirstUniqueCharacterInAString387 {
    public int firstUniqChar(String s) {
        boolean[] chars = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!chars[c-'a']&&s.indexOf(c,i+1)==-1) return i;
            else chars[c-'a']=true;
        }
        return -1;
//        int[] chars = new int[26];
//        for (char c: s.toCharArray()){
//            chars[c-'a']++;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(chars[c-'a']==1) return i;
//        }
//        return -1;
//        Best Solution
//        int min = Integer.MAX_VALUE;
//        for(int i= 'a';i<= 'z';i++){
//            int idx = s.indexOf(i);
//            if(idx != -1 && s.lastIndexOf(i) == idx){
//                min = Math.min(min,idx);
//            }
//        }
//        return min !=Integer.MAX_VALUE ? min : -1 ;
    }
}
