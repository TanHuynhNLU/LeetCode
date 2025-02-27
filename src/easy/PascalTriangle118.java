package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row1 = Arrays.asList(1);
        List<Integer> row2 = Arrays.asList(1,1);
        if(numRows>=1)result.add(row1);
        if(numRows>=2)result.add(row2);
        for (int i = 2; i < numRows; i++) {
            result.add(generateRow(result.get(i-1)));
        }
        return result;
    }
    public static List<Integer> generateRow(List<Integer> preRow) {
        List<Integer> result = new ArrayList<>();
        int n = preRow.size();
        result.add(1);
        for (int i = 1; i < n; i++) {
            result.add(preRow.get(i - 1) + preRow.get(i));
        }
        result.add(1);
        return result;
    }

    //Best Solution
//    public static List<Integer> generateRows(int numRows)
//    {
//        List<Integer> temp=new ArrayList<>();
//        int i, ans=1;
//        temp.add(1);
//        for(i=1; i<numRows; i++)
//        {
//            ans=ans*(numRows-i);
//            ans=ans/i;
//            temp.add(ans);
//        }
//        return temp;
//    }
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> ans=new ArrayList<>();
//        int i;
//        for(i=1; i<=numRows; i++)
//        {
//            ans.add(generateRows(i));
//        }
//        return ans;
//    }

    public static void main(String[] args) {
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        prevRow.add(2);
        prevRow.add(1);
         generate(4);
    }
}
