package easy;

public class SmallestDivisibleDigitProductI3345 {
    public int smallestNumber(int n, int t) {
        while(productOfDigits(n)%t!=0){
            n++;
        }
        return n;
    }
    public int productOfDigits(int n) {
        int res = 1;
        while(n!=0){
            res*= n%10;
            n/=10;
        }
        return res;
    }
}
