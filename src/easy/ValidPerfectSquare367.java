package easy;

public class ValidPerfectSquare367 {
    public static boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left = 2;
        int right = num/2;
        int mid;
        double square;
        while(left<=right){
            mid = left+(right-left)/2;
            square=(double)mid*mid;
            if(square==num) return true;
            if(square<num){
                left = mid +1;
            }if(square>num){
                right = mid -1;
            }
        }
        return false;
//        if(num==1) return true;
//        int sum =1;
//        int count = 1;
//        while (sum<num){
//            sum+=2*count+1;
//            if(sum==num)return true;
//            count++;
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(8));
    }
}
