package easy;

public class ReplaceElementsWithGreatestElementOnRightSide1299 {
    public int[] replaceElements(int[] arr) {
        int[] maxNums = new int[arr.length];
        int max =-1;
        for (int i = arr.length-1; i >= 0; i--) {
            maxNums[i] = max;
            max = Math.max(max,arr[i]);
        }
        return maxNums;
    }
}
