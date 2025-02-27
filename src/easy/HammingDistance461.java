package easy;

public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        int num = x^y;
        int count = 0;
        while (num>0){
            if((num&1)==1)
                count++;
            num>>=1;
        }
        return count;
    }
}
