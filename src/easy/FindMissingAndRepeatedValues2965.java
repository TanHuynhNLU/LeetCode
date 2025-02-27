package easy;

public class FindMissingAndRepeatedValues2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] counts = new int[grid.length*grid.length+1];
        for(int[] row : grid){
            for(int col : row){
                counts[col]++;
            }
        }
        int[] res = new int[2];
        for(int i = 1; i < counts.length; i++){
            if(counts[i]==2) res[0] = i;
            if(counts[i]==0) res[1] = i;
            if(res[0]!=0&&res[1]!=0) return res;
        }
        return res;
    }
}
