package easy;

public class TwoFurthestHousesWithDifferentColors2078 {
    public int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0; i < colors.length - 1; i++) {
            for (int j = colors.length; j > i; j--) {
                if (colors[i] != colors[j]) {
                    max = Math.max(max, j - i);
                    break;
                }
            }
        }
        return max;
    }

//    Best Solution
//public int maxDistance(int[] colors) {
//    int maxDistance = 0;
//
//    for (int i = 0; i < colors.length; i++) {
//        if(colors[0] != colors[i]) {
//            maxDistance = Math.max(maxDistance, i);
//        }
//
//        if(colors[colors.length - 1] != colors[i]) {
//            maxDistance = Math.max(maxDistance, colors.length - i - 1);
//        }
//    }
//
//    return maxDistance;
//}
}
