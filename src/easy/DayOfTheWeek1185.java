package easy;

public class DayOfTheWeek1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        int[] monthKey = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        int sum = 0;
        sum += (year % 100 + (year % 100) / 4)%7;
        sum += day + monthKey[month - 1];
        if (isLeapYear(year) && (month == 1 || month == 2)) {
            sum--;
        }
        if(year>=2100) sum+=5;
        else if(year>=2000) sum+=0;
        else if(year>=1900) sum+=1;
        return days[sum % 7];

//        Simple Solution
//        LocalDate date = LocalDate.of(year, month, day);
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//
//        switch (dayOfWeek) {
//            case MONDAY:
//                return "Monday";
//            case TUESDAY:
//                return "Tuesday";
//            case WEDNESDAY:
//                return "Wednesday";
//            case THURSDAY:
//                return "Thursday";
//            case FRIDAY:
//                return "Friday";
//            case SATURDAY:
//                return "Saturday";
//            case SUNDAY:
//                return "Sunday";
//            default:
//                throw new IllegalStateException("Unexpected value: " + dayOfWeek);
//        }
    }

    public boolean isLeapYear(int year) {
        return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}
