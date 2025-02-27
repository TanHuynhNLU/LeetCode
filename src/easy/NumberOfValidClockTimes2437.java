package easy;

public class NumberOfValidClockTimes2437 {
    public int countTime(String time) {
        int count = 1;
        for (int i = 0; i < time.length(); i++) {
            if (time.charAt(i) == '?' && i == 0) {
                if (time.charAt(1) == '?') {
                    count *= 24;
                    i++;
                    continue;
                } else {
                    if (Character.getNumericValue(time.charAt(1)) <= 3) count *= 3;
                    else count *= 2;
                }
            }
            if (time.charAt(i) == '?' && i == 1) {
                if (Character.getNumericValue(time.charAt(0)) == 2) count *= 4;
                else
                    count *= 10;
            }
            if (time.charAt(i) == '?' && i == 3) count *= 6;
            if (time.charAt(i) == '?' && i == 4) count *= 10;
        }
        return count;
    }
}
