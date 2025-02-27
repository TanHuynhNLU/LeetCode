package easy;

public class ValidMountainArray941 {
    public boolean validMountainArray(int[] arr) {
        if(arr.length==1) return false;
        boolean isDes = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) return false;
            if (!isDes) {
                if (arr[i] < arr[i - 1]&&i==1) return false;
                if (arr[i] < arr[i - 1]) isDes = true;
            } else {
                if (arr[i] > arr[i - 1]) return false;
            }
        }
        if(!isDes) return false;
        return true;
//        Best Solution
//        int length=arr.length, i=0, j=length-1;
//        while((i+1)<length && arr[i]<arr[i+1]) i++;
//        while(j>0 && arr[j-1]>arr[j]) j--;
//        return i>0 && i==j && j<length-1;
    }
}
