package easy;

import java.util.HashMap;

public class FindCenterOfStarGraph1791 {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        return edges[1][0]==a||edges[1][0]==b?edges[1][0]:edges[1][1];
    }
}
