package easy;

import java.util.HashSet;

public class PrimeNumberOfSetBitsInBinaryRepresentation762 {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <=right ; i++) {
            if(isPrimeNumber(countSetBits(i))) count++;
        }
        return count;
    }
    public boolean isPrimeNumber(int n){
        if(n==1) return false;
        if(n==2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static int countSetBits(int n){
        int count = 0;
        while (n!=0){
            count+=n&1;
            n=n>>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}
