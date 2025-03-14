package easy;

public class FindTheHighestAltitude1732 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i]+ gain[i];
            max = Math.max(max, altitudes[i + 1]);
        }
        return max;
    }
}
