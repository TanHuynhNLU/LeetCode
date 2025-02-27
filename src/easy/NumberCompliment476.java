package easy;

public class NumberCompliment476 {
    public static int findComplement(int num) {
        int count = 0;
        int result = 0;
        while (num>0){
            int n = num&1;
            if(n==0) {
                n=1;
                n <<= count;
                result |= n;
            }
            count++;
            num>>>=1;
        }
        return result;
//        Best Solution
//        int numBits = 0;
//        int temp = num;
//        while (num > 0) {
//            num = num >> 1;
//            numBits++;
//        }
//        return temp ^ (int) (Math.pow(2, numBits) - 1);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
