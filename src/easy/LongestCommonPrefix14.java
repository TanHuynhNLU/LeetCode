package easy;

public class LongestCommonPrefix14 {
    public static String longestCommonPrefix(String [] strs){
        if(strs.length==1) return strs[0];
        String firstWord = strs[0];
        String prefix="";
        for (int i = 1; i <= firstWord.length(); i++) {
            prefix = firstWord.substring(0,i);
            for (int j = 1; j < strs.length ; j++) {
                if(!strs[j].startsWith(prefix)) return prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;

        //Best solution
//        StringBuilder ans = new StringBuilder();
//        Arrays.sort(v);
//        String first = v[0];
//        String last = v[v.length-1];
//        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//            if (first.charAt(i) != last.charAt(i)) {
//                return ans.toString();
//            }
//            ans.append(first.charAt(i));
//        }
//        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
