package easy;

public class CountTestedDevicesAfterTestOperations2960 {
    public int countTestedDevices(int[] batteryPercentages) {
        int res = 0;
        int count = 0;
        for(int b: batteryPercentages){
            if(b-count>0){
                res++;
                count++;
            }
        }
        return res;
    }
}
