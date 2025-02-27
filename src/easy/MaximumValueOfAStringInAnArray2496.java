package easy;

public class MaximumValueOfAStringInAnArray2496 {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String s : strs){
            if(isNumeric(s)) max = Math.max(max, Integer.parseInt(s));
            else max = Math.max(max, s.length());
        }
        return max;
    }

    public boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
