package easy;

public class DecryptStringFromAlphabetToIntegerMapping1309 {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                String tmp = s.substring(i - 2, i);
                char x = (char) (Integer.parseInt(tmp) + 96);
                sb.append(x);
                i-=2;
            }else {
                char c = s.charAt(i);
                char x = (char)(Character.getNumericValue(c) + 96);
                sb.append(x);
            }
        }
        return sb.reverse().toString();
    }

//    Best Solution
//    public String freqAlphabets(String s) {
//
//    char[] arr = s.toCharArray();
//    StringBuilder ans = new StringBuilder();
//    for(int i = 0 ; i < arr.length ; i++){
//        if(i+2 < arr.length && arr[i+2]=='#'){
//            ans.append(coded(arr[i],arr[i+1]));
//            i+=2;
//        }
//        else{
//            ans.append(coded(arr[i]));
//        }
//    }
//    return new String(ans);
//
//}
//    public char coded(char c){
//        return (char)(c-48 + 96);
//    }
//
//    public char coded(char c1 , char c2){
//        return (char)((c1-48)*10 + (c2-48) + 96);
//    }
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
