package easy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.SimpleFormatter;

public class NumberOfDaysBetweenTwoDates1360 {
    public static int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date3 = sdf.parse(date1);
            Date date4 = sdf.parse(date2);
            long diff = Math.abs(date4.getTime() - date3.getTime());
            return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException e) {
            return 0;
        }
    }
//    Best Solution
//    public int daysBetweenDates(String date1, String date2) {
//    return Math.abs(days(date1)-days(date2));
//}
//    int days(String d1){
//        int y= Integer.parseInt(d1.substring(0,4));
//        int m= Integer.parseInt(d1.substring(5,7));
//        int d= Integer.parseInt(d1.substring(8,10));
//        int[] prefix = new int[]{0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        for (int i = 2; i <= 13; i++) prefix[i] += prefix[i - 1];
//        int ans = (y - 1971) * 365 + prefix[m] + d;
//        for (int i = 1972; i < y; i+=4)
//            if (isLeap(i))
//                ans++;
//
//        if (isLeap(y) && m > 2) ans++;
//        return ans;
//    }
//    private static boolean isLeap(int y){
//        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
//    }

    public static void main(String[] args) throws ParseException {
        System.out.println(daysBetweenDates("1971-06-29", "2010-09-23"));
    }
}
