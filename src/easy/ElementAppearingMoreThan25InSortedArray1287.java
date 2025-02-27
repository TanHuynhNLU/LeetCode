package easy;

public class ElementAppearingMoreThan25InSortedArray1287 {
    public int findSpecialInteger(int[] arr) {
        int prev = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==prev) count++;
            else {
                prev=arr[i];
                count=0;
            }
            if(count>=arr.length/4) return arr[i];
        }
        return 0;
    }
}
