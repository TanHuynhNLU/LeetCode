package easy;

public class KItemsWithTheMaximumSum2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes + numZeros) {
            return Math.min(numOnes, k);
        } else return numOnes - (k - numOnes - numZeros);
    }
}
