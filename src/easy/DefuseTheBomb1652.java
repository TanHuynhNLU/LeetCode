package easy;

import java.util.Arrays;

public class DefuseTheBomb1652 {
    public static int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length * 2];
        for (int i = 0; i < code.length; i++) {
            arr[i] = code[i];
            arr[i + code.length] = code[i];
        }
        if(k == 0)  Arrays.fill(code,0);
        if(k > 0)  replaceNext(code,arr,k);
        if(k < 0)  replacePrev(code,arr,k);
        return code;
    }
    public static void replaceNext(int[] code, int[] arr, int k){
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = i+1; j <= i+k; j++) {
                sum += arr[j];
            }
            code[i] = sum;
        }
    }
    public static void replacePrev(int[] code, int[] arr, int k){
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = i-1+ code.length; j >= i+k+ code.length; j--) {
                sum += arr[j];
            }
            code[i] = sum;
        }
    }

    public static void main(String[] args) {
        int[] code = new int[]{10,5,7,7,3,2,10,3,6,9,1,6};
        decrypt(code,-4);
    }
}
