package easy;

public class TruncateSentence1816 {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        if (k == words.length) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            sb.append(' ');
        }
        return sb.toString().trim();
    }

//    public String truncateSentence(String s, int k) {
//        StringBuilder sb = new StringBuilder();
//        int wc=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                wc++;
//                if(wc==k){
//                    return s.substring(0,i);
//                }
//            }
//        }
//        return s;
//    }
}
