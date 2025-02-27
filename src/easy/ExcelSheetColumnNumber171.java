package easy;

public class ExcelSheetColumnNumber171 {
    public static int titleToNumber(String columnTitle) {
        int count = 0;
        int sum = 0;
        for (int i = columnTitle.length() - 1; i >=0 ; i--) {
            char c = columnTitle.charAt(i);
            sum+= (c-64)*Math.pow(26,count);
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));
    }
}
