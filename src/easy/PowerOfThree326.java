package easy;

public class PowerOfThree326 {
    public static boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n%3!=0||n<3) {
            return false;
        }
       while (n%3==0){
           n/=3;
       }
       if(n==1) return true;
        return false;

//        Best Solution
//        return n > 0 && 1162261467 % n == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(-9));
    }
}
