package easy;

public class HappyNumber202 {
    public static boolean isHappy(int n) {
        if (n == 1 || n == 7) return true;
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1 || sum == 7) return true;
            n = sum;
        }
        return false;

//        Best solution

//        while(n>0){
//            int sum = 0;
//            while(n>0){
//                sum = sum + (n%10)*(n%10);
//                n/=10;
//            }
//            if(sum==1) return true;
//            if(sum<=6) return false;
//            n = sum;
//        }
//
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
