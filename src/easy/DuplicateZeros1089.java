package easy;

public class DuplicateZeros1089 {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] clone = arr.clone();
        int indexClone = 0;
        for (int i = 0; i < n; i++) {
            if (clone[indexClone] == 0) {
                arr[i] = 0;
                if (i + 1 < n)
                    arr[i + 1] = 0;
                i++;
            } else {
                arr[i] = clone[indexClone];
            }
            indexClone++;
        }
    }
}
