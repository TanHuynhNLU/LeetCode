package easy;

public class FindTheLosersOfTheCircularGame2682 {
    public static int[] circularGameLosers(int n, int k) {
        if(n==1) return new int[0];
        int[] counters = new int[n + 1];
        int size = n-1;
        counters[1] = 1;
        int i = 1;
        int turn = 1;
        while (true) {
            int index = (i + k * turn) % n;
            if (index == 0) index = n-1;
            if (counters[index] == 1) break;
            counters[index]++;
            turn++;
            size--;
            i = index;
        }
        int[] res = new int[size];
        i = 0;
        for (int j = 1; j < n + 1; j++) {
            if (counters[j] == 0) res[i++] = j;
            if (i == size ) break;
        }
        return res;
    }
//    public int[] circularGameLosers(int n, int k) {
//        boolean visited[] = new boolean[n];
//        int v = 0, i=0;
//        while(visited[i%n] == false){
//            v++;
//            visited[i%n] = true;
//            i += v*k;
//        }
//        int[] res = new int[n-v];
//        int j=0;
//        for(i=0; i<visited.length; i++){
//            if(visited[i] == false) res[j++]=i+1;
//        }
//        return res;
//    }
}
