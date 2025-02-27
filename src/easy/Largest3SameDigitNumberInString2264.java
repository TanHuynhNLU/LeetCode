package easy;

public class Largest3SameDigitNumberInString2264 {
    public String largestGoodInteger(String num) {
        String[] matching = {"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        for (String m : matching) {
            if (num.contains(m)) return m;
        }
        return "";
    }
}
