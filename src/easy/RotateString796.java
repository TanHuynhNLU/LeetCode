package easy;

public class RotateString796 {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String tmp = goal+goal;
        return tmp.indexOf(s)!=-1;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("bbbacddceeb","ceebbbbacdd"));
    }
}
