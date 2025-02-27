package easy;

public class ShuffleString1528 {
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            char c = s.charAt(i);
            sb.setCharAt(indices[i],c);
        }
        return sb.toString();
//        Best Solution
//        char [] res=new char[indices.length];
//        for (int i = 0; i < indices.length; i++) {
//            res[indices[i]]=s.charAt(i);
//        }
//
//        return new String(res);
    }

    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        restoreString("codeleet",indices);
    }
}
