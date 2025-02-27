package easy;

public class ShortestDistanceToACharacter821 {
    public int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        int prev = -1;
        int next = s.indexOf(c);
        for (int i = 0; i < s.length(); i++) {
            if(i==next){
                res[i]=0;
                prev=next;
                next = s.indexOf(c,next+1);
                continue;
            }
            if(prev==-1){
                res[i] = next-i;
                continue;
            }
            if(next==-1){
                res[i] = i-prev;
                continue;
            }
            res[i]= Math.min(next-i,i-prev);
        }
        return res;
//        Best solution
//        public int[] shortestToChar(String s, char c) {
//            int[] result = new int[s.length()];
//            char[] chars = s.toCharArray();
//            for(int i = 0; i < chars.length; i++){
//
//                if(chars[i] == c){
//                    DFS(result, chars, c, i + 1, i);
//                    DFS(result, chars, c, i - 1, i);
//                }
//            }
//
//            return result;
//        }
//        private void DFS(int[] result, char[] chars, char c, int i, int pos) {
//            if(i < 0 || i >= result.length) return;
//            if(chars[i] == c) return;
//            int abs = Math.abs(pos - i);
//            if(result[i] != 0 && result[i] <= abs) return;
//
//            result[i] = abs;
//            DFS(result, chars, c, i + 1, pos);
//            DFS(result, chars, c, i - 1, pos);
//        }
    }

    public static void main(String[] args) {
        String s ="aa";
        System.out.println(s.indexOf("a",3));
    }
}
