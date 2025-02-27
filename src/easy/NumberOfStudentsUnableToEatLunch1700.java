package easy;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch1700 {
    public int countStudents(int[] students, int[] sandwiches) {
        int k = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int student : students) {
            q.add(student);
        }
        int count = 0;
        while (k < sandwiches.length) {
            int s = q.poll();
            if (s == sandwiches[k]) {
                k++;
                count = 0;
            } else {
                q.offer(s);
                count++;
            }
            if (count == sandwiches.length - k) {
                return q.size();
            }
        }
        return 0;
    }

    //    Best solution
//    public int countStudents(int[] students, int[] sandwiches) {
//        int coun0 = 0;
//        int count1 = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == 0) {
//                coun0++;
//            } else {
//                count1++;
//            }
//        }
//        for (int i = 0; i < sandwiches.length; i++) {
//            if (coun0 == 0 && sandwiches[i] == 0) {
//                return count1;
//
//
//            } else if (count1 == 0 && sandwiches[i] == 1) {
//                return coun0;
//
//            }
//            if (sandwiches[i] == 0) {
//                coun0 = coun0 - 1;
//            } else {
//                count1 = count1 - 1;
//            }
//
//        }
//        return 0;
//
//    }
}
