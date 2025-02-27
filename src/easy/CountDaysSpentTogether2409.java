package easy;

public class CountDaysSpentTogether2409 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] daysSpent = new int[366];
        int count = 0;
        int startDay = numOfDay(arriveAlice);
        int endDay = numOfDay(leaveAlice);
        for (int i = startDay; i <= endDay; i++) {
            daysSpent[i]++;
        }
        startDay = numOfDay(arriveBob);
        endDay = numOfDay(leaveBob);
        for (int i = startDay; i <= endDay; i++) {
            daysSpent[i]++;
        }
        for (int i = 0; i <= 365; i++) {
            if (daysSpent[i] == 2) count++;
        }
        return count;
    }

    public int numOfDay(String date) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = 0;
        int m = Integer.parseInt(date.substring(0, 2));
        int d = Integer.parseInt(date.substring(3));
        for (int i = 0; i < m - 1; i++) {
            res += months[i];
        }
        return res + d;
    }

    //    Best Solution
//    int countDays(String date) {
//        int[] mdays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        int month = Integer.parseInt(date.substring(0, 2));
//        int days = Integer.parseInt(date.substring(3));
//
//        int daysCount = 0;
//        for (int m = 1; m < month; m++)
//            daysCount += mdays[m];
//
//        return daysCount + days;
//    }
//
//    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
//        int aliceArrive = countDays(arriveAlice);
//        int bobArrive = countDays(arriveBob);
//
//        int aliceLeave = countDays(leaveAlice);
//        int bobLeave = countDays(leaveBob);
//
//        if (aliceArrive > bobLeave || bobArrive > aliceLeave) return 0;
//        return Math.min(aliceLeave, bobLeave) - Math.max(aliceArrive, bobArrive) + 1;
//    }
}
