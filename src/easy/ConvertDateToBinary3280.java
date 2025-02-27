package easy;

public class ConvertDateToBinary3280 {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(9, 11));

        StringBuilder result = new StringBuilder();
        result.append(decToBinary(year));
        result.append("-");
        result.append(decToBinary(month));
        result.append("-");
        result.append(decToBinary(day));
        return result.toString();
    }

    public String decToBinary(int num) {
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int n = num & 1;
            result.append(n);
            num >>>= 1;
        }
        return result.reverse().toString();
    }
//    Best Solution
//public String convertDateToBinary(String date) {
//    StringBuilder result = new StringBuilder();
//    String year = date.substring(0, 4);
//    String month = date.substring(5, 7);
//    String day = date.substring(8, 10);
//    result.append(Integer.toBinaryString(Integer.parseInt(year)));
//    result.append("-");
//    result.append(Integer.toBinaryString(Integer.parseInt(month)));
//    result.append("-");
//    result.append(Integer.toBinaryString(Integer.parseInt(day)));
//    return result.toString();
//}
}
