package easy;

public class MinimumChangesToMakeAlternatingBinaryString1758 {
    public int minOperations(String s) {
        int count1 = 0, count2 = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(i%2==0){
                if(chars[i]=='0'){
                    count1++;
                }
               else {
                    count2++;
                }
            }else {
                if(chars[i]=='1'){
                    count1++;
                }
                else {
                    count2++;
                }
            }
        }
        return Math.min(count1,count2);

//        Best solution
//        public int minOperations(String s) {
//
//            char[] cArr = s.toCharArray();
//
//            int zeroCount = cArr[0] == '0' ? 0 : 1;
//            cArr[0] = '0';
//            zeroCount += getCount(cArr);
//
//            cArr = s.toCharArray();
//            int oneCount = cArr[0] == '1' ? 0: 1;
//            cArr[0] = '1';
//            oneCount += getCount(cArr);
//
//            return Math.min(zeroCount, oneCount);
//        }
//
//        private int getCount(char[] cArr){
//
//            int count = 0;
//
//            for(int i=1; i<cArr.length; i++){
//
//                if(cArr[i] == cArr[i-1]){
//                    count++;
//                    cArr[i] = cArr[i] == '1' ? '0' : '1';
//                }
//            }
//
//            return count;
//        }
    }
}
