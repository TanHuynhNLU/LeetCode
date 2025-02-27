package testAlgorithm;

public class QuickSort {
    private void quickSort(int[] arr, int start, int end){
        if(end <= start) return;
        int pivot = partition(arr,start,end);
        quickSort(arr,start,pivot - 1);
        quickSort(arr,pivot + 1,end);
    }

    private int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;
        for(int j = start; j < end; j++)
            if(arr[j] <= pivot) swap(arr,++i,j);
        swap(arr,++i,end);
        return i;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
//        quickSort(nums,0,n - 1);
    }
}
