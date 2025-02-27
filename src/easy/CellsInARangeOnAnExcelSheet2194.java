package easy;

import java.util.ArrayList;
import java.util.List;

public class CellsInARangeOnAnExcelSheet2194 {
    public static List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        int n = Math.max(Character.getNumericValue(s.charAt(1)), Character.getNumericValue(s.charAt(4)));
        for (int i = s.charAt(0); i <= s.charAt(3); i++) {
            for (int j = s.charAt(1)-'0'; j <=n ; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append((char)i);
                sb.append(j);
                res.add(sb.toString());
            }
        }
        return res;
    }

//    Best Solution
//public List<String> cellsInRangeOptimized(String s) {
//    // Estimate the size of the ArrayList
//    int estimatedSize = (s.charAt(3) - s.charAt(0) + 1) * (s.charAt(4) - s.charAt(1) + 1);
//    List<String> cells = new ArrayList<>(estimatedSize);
//
//    for (char i = s.charAt(0); i <= s.charAt(3); i++) {
//        for (char j = s.charAt(1); j <= s.charAt(4); j++) {
//            cells.add(new StringBuilder().append(i).append(j).toString());
//        }
//    }
//    return cells;
//}
//
//    public List<String> cellsInRangeNaive(String s) {
//        List<String> cells= new ArrayList<>();
//        for(char i=s.charAt(0);i<=s.charAt(3);i++){
//            for(char j=s.charAt(1);j<=s.charAt(4);j++){
//                cells.add(i+""+j);
//            }
//        }
//        return cells;
//    }
//
//    public List<String> cellsInRange(String s) {
//        int nCols = s.charAt(3) - s.charAt(0) + 1;
//        int nRows = s.charAt(4) - s.charAt(1) + 1;
//        return new java.util.AbstractList<String>() {
//            public String get(int index) {
//                char col = (char) (s.charAt(0) + index / nRows);
//                char row = (char) (s.charAt(1) + index % nRows);
//                return new String(new char[] { col, row });
//            }
//
//            public int size() {
//                return nRows * nCols;
//            }
//        };
//    }

    public static void main(String[] args) {
        cellsInRange("K1:L2");
    }
}
