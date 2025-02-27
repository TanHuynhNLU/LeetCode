package easy;

public class DeleteColumnsToMakeShorted944 {
    public int minDeletionSize(String[] strs) {
        int remove=0;
        int n = strs[0].length();
        int[] prevRow  = new int[n];
        boolean[] flag  = new boolean[n];
        for (String s:strs){
            char[] chars = s.toCharArray();
            for (int i = 0; i < n; i++) {
                if(!flag[i]){
                    if(prevRow[i]>chars[i]){
                        remove++;
                        flag[i]=true;
                    }else {
                        prevRow[i] = chars[i];
                    }
                }
            }
        }
        return remove;
    }
//    Best Solution
//public int minDeletionSize(String[] A) {
//    int deleted = 0;
//    if (A == null || A.length == 0) return deleted;
//    int rowSize = A[0].length();
//
//    for (int col = 0; col < rowSize; col++){
//        if (!isSorted(A, col)) deleted++;
//    }
//
//    return deleted;
//}
//
//    boolean isSorted(String[] A, int col){
//        int N = A.length;
//        char prev = (char)0;
//        for (int i = 0; i < N; i++){
//            char c = A[i].charAt(col);
//            //If out of order
//            if (c < prev) return false;
//            //update prev
//            prev = c;
//        }
//
//        return true; //In order the whole time
//    }
}
