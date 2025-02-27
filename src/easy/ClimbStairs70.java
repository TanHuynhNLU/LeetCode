package easy;

public class ClimbStairs70 {
    public static int climbStairs(int n){
       if(n==1) return 1;
       int stairs[] = new int[n+1];
       stairs[1]=1;
       stairs[2]=2;
        for (int i = 3; i <= n; i++) {
            stairs[i] = stairs[i-2]+stairs[i-1];
        }
        return stairs[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
