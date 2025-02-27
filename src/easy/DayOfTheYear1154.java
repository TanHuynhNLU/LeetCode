package easy;

import java.time.LocalDate;

public class DayOfTheYear1154 {
    public int dayOfYear(String date) {
        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] splitDate = date.split("-");
        int dayOfYear = Integer.parseInt(splitDate[2]);
        int month = Integer.parseInt(splitDate[1]);
        int year = Integer.parseInt(splitDate[0]);
        for (int i = 0; i < month-1; i++) {
            dayOfYear+=dayOfMonth[i];
        }
        if(month>2&&isLeapYear(year)) dayOfYear++;
        return dayOfYear;
    }

    public boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
    }
}
