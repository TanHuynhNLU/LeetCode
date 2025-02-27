package easy;

public class FindTheKeyOfTheNumbers3270 {
    public int generateKey(int num1, int num2, int num3) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        int[] arr3 = new int[4];
        for (int i = 3; i >= 0; i--) {
            arr1[i] = num1 % 10;
            arr2[i] = num2 % 10;
            arr3[i] = num3 % 10;

            num1 = num1 / 10;
            num2 = num2 / 10;
            num3 = num3 / 10;
        }
        int res = 0;
        for (int i = 0; i < 4; i++) {
            res = res * 10 + Math.min(Math.min(arr1[i], arr2[i]), arr3[i]);
        }
        return res;
    }
}
