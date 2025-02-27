package easy;

public class FindNUniqueIntegersSumUpToZero1304 {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int num =1;
        int count =0;
        for (int i = 0; i < n/2; i++) {
            arr[count++] = num;
            arr[count++] = -num;
            num++;
        }
        return arr;
//        Best Solution
//        int[] answer = new int[n];
//        for (int i = 1; i<n; i+=2) {
//            answer[i-1]=i;
//            answer[i]=-i;
//        }
//        return answer;
    }
}
