package easy;

public class CountOperationsToObtainZero2169 {
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            count++;
            int num = Math.abs(num1 - num2);
            if (num1 > num2) num1 = num;
            else num2 = num;
        }
        return count;
    }

    //    Best Solution
//    public int countOperations(int num1, int num2) {
//        int operations = 0;
//        while (num1 > 0 && num2 > 0) {
//            // Always subtract the smaller number from the larger one using integer division
//            if (num1 >= num2) {
//                operations += num1 / num2;
//                num1 %= num2; // Update num1 with the remainder
//            } else {
//                operations += num2 / num1;
//                num2 %= num1; // Update num2 with the remainder
//            }
//        }
//        return operations;
//    }
}
