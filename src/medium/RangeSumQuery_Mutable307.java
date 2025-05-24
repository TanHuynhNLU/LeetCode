package medium;

public class RangeSumQuery_Mutable307 {

    int[] bit;

    public RangeSumQuery_Mutable307(int[] nums) {
        this.bit = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            add(i, nums[i]);
        }
    }

    public void update(int index, int val) {
        int currVal = sumRange(index, index);
        add(index, val - currVal);
    }

    public void add(int index, int val) {
        index++;
        while (index < bit.length) {
            bit[index] += val;
            index += index & -index;
        }
    }

    public int getSum(int index) {
        index++;
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & -index;
        }
        return sum;
    }

    public int sumRange(int left, int right) {
        return getSum(right) - getSum(left - 1);
    }
}
