package easy;

public class ThreeDivisors1952 {
    public boolean isThree(int n) {
        if(n<=3) return false;
        int count = 0;
        for (int i = 2; i <n/2 ; i++) {
            if(n%i==0) count++;
            if(count==2) return false;
        }
        return count==1;
    }
}
