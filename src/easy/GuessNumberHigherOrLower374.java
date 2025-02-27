package easy;

public class GuessNumberHigherOrLower374 {
    public static int guessNumber(int n) {
        int left =1;
        int right = n;
        int mid;
        int val;
        while(left<=right){
            mid = left+(right-left)/2;
            val=guess(mid);
            if(val==0) return mid;
            if(val==-1) right=mid-1;
            if(val==1) left=mid+1;
        }
        return 0;
    }
    public static int guess(int n){
        if(n==2) return 0;
        if(n>2) return -1;
        if(n<2) return 1;
        return -3;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
