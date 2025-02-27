package easy;

public class CellsWithOddValuesInAMatrix1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int oddCells = 0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[indices[i][0]][j]++;
                if(matrix[indices[i][0]][j]%2!=0) oddCells++;
                else oddCells--;
            }
            for (int j = 0; j < m; j++) {
                matrix[j][indices[i][1]]++;
                if(matrix[j][indices[i][1]]%2!=0) oddCells++;
                else oddCells--;
            }
        }
        return oddCells;
//        Best Solution
//        Freq of rows and columns to be incremented
//        int[] r = new int[m];
//        int[] c = new int[n];
//
//        for (int i = 0 ; i < indices.length; i++) {
//            r[indices[i][0]]++;
//            c[indices[i][1]]++;
//        }
//
//        //Count odd rows
//        int oddRows = 0;
//        for(int i =0; i < m; i++) {
//            if(r[i]%2 == 1) {
//                oddRows++;
//            }
//        }
//
//        //count odd columns
//        int oddColumns = 0;
//        for(int i =0; i < n; i++){
//            if(c[i]%2 == 1) {
//                oddColumns++;
//            }
//        }
//
//        //return Final value
//        return oddRows * n + oddColumns * m - 2*oddRows*oddColumns;
    }
}
