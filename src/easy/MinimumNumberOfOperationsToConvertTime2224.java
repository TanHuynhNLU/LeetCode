package easy;

public class MinimumNumberOfOperationsToConvertTime2224 {
    public int convertTime(String current, String correct) {
        int count = 0;
        int[] divided = {60, 15, 5, 1};
        int time = convertToInt(correct) - convertToInt(current);
        int i =0;
        while(time!=0){
            count+=time/divided[i];
            time%=divided[i];
            i++;
        }
        return count;
    }

    public int convertToInt(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3));
    }
}
