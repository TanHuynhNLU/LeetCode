package easy;

public class TimeNeededToBuyTickets2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    count++;
                }
                if (tickets[k] == 0) break;
            }
        }
        return count;
    }

    //    Best Solution
//    public int timeRequiredToBuy(int[] tickets, int k) {
//        int sec = 0;
//        for (int i = 0; i < tickets.length; i++) {
//            if (i <= k) {
//                sec += Math.min(tickets[i], tickets[k]);
//            } else {
//                sec += Math.min(tickets[i], tickets[k] - 1);
//            }
//        }
//        return sec;
//    }
}
