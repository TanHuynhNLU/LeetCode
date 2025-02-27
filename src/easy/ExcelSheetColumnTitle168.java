package easy;

public class ExcelSheetColumnTitle168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber != 0) {
            int col = (columnNumber-1) % 26;
           result.append((char)('A'+col));
           columnNumber= (columnNumber-1)/26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
