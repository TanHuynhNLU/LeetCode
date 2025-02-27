package leetcode;

public class ReverseInteger7 {
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) isNegative = true;
        try {
            StringBuilder stringNum = new StringBuilder(Integer.toString(Math.abs(x)));
            int reverseNum = Integer.parseInt(stringNum.reverse().toString());
            return isNegative ? -reverseNum : reverseNum;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    public static int reverse2(int x){
        int ans = 0;
        while (x!=0){
            int dig = x % 10;
            if(ans<Integer.MIN_VALUE||ans>Integer.MAX_VALUE) return  0;
            ans = ans*10+dig;
            x/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int a = -114748389;
        System.out.println(reverse2(a));
    }
}
