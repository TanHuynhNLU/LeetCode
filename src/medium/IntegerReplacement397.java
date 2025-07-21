package medium;

public class IntegerReplacement397 {
    public int integerReplacement(int n) {
        long num = n;
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if (num == 3) num -= 1;
                else if (((num + 1) / 2) % 2 == 0)
                    num += 1;
                else num -= 1;
            }
            count++;
        }
        return count;
    }
}
