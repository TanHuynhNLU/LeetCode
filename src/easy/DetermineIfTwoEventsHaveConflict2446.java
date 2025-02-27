package easy;

public class DetermineIfTwoEventsHaveConflict2446 {
    public static boolean haveConflict(String[] event1, String[] event2) {
        int start1 = Integer.parseInt(event1[0].substring(0, 2)) * 60 + Integer.parseInt(event1[0].substring(3));
        int end1 = Integer.parseInt(event1[1].substring(0, 2)) * 60 + Integer.parseInt(event1[1].substring(3));

        int start2 = Integer.parseInt(event2[0].substring(0, 2)) * 60 + Integer.parseInt(event2[0].substring(3));
        int end2 = Integer.parseInt(event2[1].substring(0, 2)) * 60 + Integer.parseInt(event2[1].substring(3));
        if(start1 > end1 || start2 > end2) return false;
        return true;
    }

    public static void main(String[] args) {
        haveConflict(new String[]{"01:15","02:00"},new String[]{"02:00","03:00"});
    }
}
