package easy;

public class CountBinarySubstring696 {
    public int countBinarySubstrings(String s) {
        int res = 0;
        int countZero = 0;
        int countOne = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if(countOne==0||countZero<countOne) countZero++;
                else {
                    countZero=1;
                }
                if(countZero<countOne) res++;
                if(countZero==countOne){
                    res++;
                    countOne=0;
                }
            } else {
                if(countZero==0||countOne<countZero) countOne++;
                else {
                    countOne=1;
                }
                if(countOne<countZero) res++;
                if(countOne==countZero){
                    res++;
                    countZero=0;
                }
            }
        }
        return res;
//        Best Solution
//        int ans=0;
//        char[] arr=s.toCharArray();
//        char prev=arr[0];
//        int prevCount=0;
//        int count=1;
//        for(int i=1;i<arr.length;i++){
//            if(arr[i]==prev){
//                count++;
//                if(prevCount>=count){
//                    ans++;
//                }
//            }
//            else{
//                ans++;
//                prevCount=count;
//                prev=arr[i];
//                count=1;
//            }
//        }
//        return ans;
    }

    public static void main(String[] args) {

    }
}
