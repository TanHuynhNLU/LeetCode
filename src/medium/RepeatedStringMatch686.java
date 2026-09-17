package medium;

public class RepeatedStringMatch686 {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int res = 1;
        sb.append(a);
        while (sb.length() < b.length()) {
            sb.append(a);
            res++;
        }
        if (sb.indexOf(b) != -1) return res;
        if (sb.append(a).indexOf(b) != -1) return res + 1;
        return -1;
    }

    //Best solution
//    public int repeatedStringMatch(String a, String b) {
//        int lengthA = a.length();
//        int lengthB = b.length();
//        boolean[] bucket = new boolean[26];
//        for (char ch : a.toCharArray()) {
//            bucket[ch - 'a'] = true;
//        }
//        for (char ch : b.toCharArray()) {
//            if (!bucket[ch - 'a']) {
//                return -1;
//            }
//        }
//        int count=lengthB/lengthA;
//        StringBuilder repStr=new StringBuilder();
//        repStr.append(a.repeat(count));
//        for(int i=1; i<=3; i++){
//            if(repStr.toString().contains(b)){
//                return count;
//            }
//            count++;
//            repStr.append(a);
//        }
//        return -1;
//    }
}
