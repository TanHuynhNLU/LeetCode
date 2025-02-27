package easy;

public class StudentAttendanceRecordI551 {
    public boolean checkRecord(String s) {
//        int countA = 0;
//        int countL = 0;
//        for (char c: s.toCharArray()) {
//            if(countA>=2) return false;
//            if(countL>=4) return false;
//            if(c=='A')
//                countA++;
//
//            if(c=='L') countL++;
//            else countL=0;
//        }
//        return true;
        return s.indexOf("A")!=s.lastIndexOf("A")||s.indexOf("LLL")!=-1?false:true;
    }
}
