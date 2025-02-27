package easy;

public class MaximumPopulationYear1854 {
    public int maximumPopulation(int[][] logs) {
        int[] counts = new int[101];
        for (int[] log : logs) {
            for (int i = log[0] - 1950; i < log[1] - 1950; i++) {
                counts[i]++;
            }
        }
        int max = 0;
        int res = 2051;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                res = i;
            }
        }
        return res + 1950;
    }

//    Best solution

//    public int maximumPopulation(int[][] logs) {
//        int[] years=new int[2051];
//        for(int[] log:logs){
//            years[log[0]]++;
//            years[log[1]]--;
//        }
//        int res=0;
//        for(int i=1920;i<=2050;i++){
//            years[i]+=years[i-1];
//            if(years[i]>years[res]) res=i;
//        }
//        return res;
//    }
}
