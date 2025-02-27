package easy;

public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        if (n==1) return 1;
        int left = 1;
        int right = n;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(isBadVersion(mid)){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
    public static boolean isBadVersion(int n){
        if(n>=4) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
}
