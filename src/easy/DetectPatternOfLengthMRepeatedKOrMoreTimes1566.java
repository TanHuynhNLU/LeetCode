package easy;

public class DetectPatternOfLengthMRepeatedKOrMoreTimes1566 {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i <= arr.length - m * k; i++) {
            boolean isDetected = true;
            for (int j = i; j < i + m; j++) {
                int count = 1;
                for (int l = j + m; l < arr.length; l += m) {
                    if (arr[j] == arr[l]) count++;
                    else break;
                }
                if (count < k) {
                    isDetected = false;
                    break;
                }
            }
            if (isDetected) return true;
        }
        return false;
    }
}
