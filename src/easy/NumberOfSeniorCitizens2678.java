package easy;

public class NumberOfSeniorCitizens2678 {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String s : details) {
            if (Integer.parseInt(s.substring(11, 13)) > 60) count++;
        }
        return count;
    }

    //    Best Solution
//    public int countSeniors(String[] details) {
//        int res = 0;
//
//        for (String s : details) {
//            int a1 = (int) s.charAt(11) - '0';
//            int a2 = (int) s.charAt(12) - '0';
//
//            if (a1 * 10 + a2 > 60)
//                res++;
//        }
//
//        return res;
//    }
}
