package easy;

public class CalculateAmountPaidInTaxes {
    public static double calculateTax(int[][] brackets, int income) {
        double tax = 0.0;
        double prev = 0.0;
        for (int i = 0; i < brackets.length; i++) {
            if (brackets[i][0] <= income) {
                tax += (brackets[i][0]-prev) * brackets[i][1]/100;
            } else {
                tax += (income - prev) * brackets[i][1]/100;
                break;
            }
            prev = brackets[i][0];
        }
        return tax;
    }

    public static void main(String[] args) {
        int[][] brackets = new int[][]{{1,0},{4,25},{5,50}};
        calculateTax(brackets,2);
    }
}
