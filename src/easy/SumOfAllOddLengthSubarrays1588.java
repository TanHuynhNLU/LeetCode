package easy;

public class SumOfAllOddLengthSubarrays1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i += 2) {
            sum += sumNElementSliding(arr, i);
        }
        return sum;
    }

    public static int sumNElementSliding(int[] arr, int n) {
        int sum = 0;
        int left = 0;
        int right = arr.length - 1;
        int count = 1;
        int minCount = Math.min(arr.length - n + 1, n);
        while (left < right) {
            sum += (arr[left] + arr[right]) * count;
            left++;
            right--;
            if (count < minCount) count++;
        }
        if (left == right) sum += arr[left] * count;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumNElementSliding(arr, 3));
    }
}
