package easy;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone2037 {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            moves+=Math.abs(seats[i] - students[i]);
        }
        return moves;
    }
//    Best solution
//    public int minMovesToSeat(int[] seats, int[] students) {
//        int [] frequencySeats = new int[101];
//        int [] frequencyStudents = new int[101];
//        for(int i = 0; i < seats.length; i++){
//            frequencySeats[seats[i]]++;
//            frequencyStudents[students[i]]++;
//        }
//        int i = 0;
//        int j = 0;
//        int moves = 0;
//        while(i <= 100 && j <= 100){
//            if(frequencySeats[i] == 0 && frequencyStudents[j] == 0){
//                i++;
//                j++;
//            }else if(frequencySeats[i] == 0){
//                i++;
//            }else if( frequencyStudents[j] == 0){
//                j++;
//            }else {
//                moves = moves + Math.abs(j - i);
//                frequencySeats[i]--;
//                frequencyStudents[j]--;
//            }
//        }
//        return moves;
//    }
}
