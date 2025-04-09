package medium;

public class BitwiseANDOfNumbersRange201 {
    public int rangeBitwiseAnd(int left, int right) {
        for (int i = 0; i < 32; i++) {
            int num1 = left >>> i;
            int num2 = right >>> i;
            if (num1 == 0 && num2 == 0) break;
            if (num1 == num2) return num1 << i;
        }
        return 0;
    }
}
