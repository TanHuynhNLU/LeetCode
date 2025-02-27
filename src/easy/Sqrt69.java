package easy;

public class Sqrt69 {
    public static int mySqrt(int x){
        if(x==1) return  1;
        int result=0;
        for (int i = 2; i <= x/2; i++) {
            if((long)i*i<=x){
                result=i;
            }
            else {
                break;
            }
        }
        return result;
        //best solution
//        if (x === 0) {
//            return 0;
//        }
//
//        let left = 1;
//        let right = x;
//
//        while (left <= right) {
//            let mid = Math.floor((left + right) / 2);
//            let sqr = mid * mid;
//
//            if (sqr === x) {
//                return mid;
//            } else if (sqr < x) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return right; // Return the floor value of the square root
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
    }
}
