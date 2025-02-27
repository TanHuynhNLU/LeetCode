package easy;

public class CountGoodTriplets1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(Math.abs(arr[i]-arr[j])>a) continue;
                for (int k = j+1; k < arr.length; k++) {
                    if(Math.abs(arr[k]-arr[j])>b) continue;
                    if(Math.abs(arr[k]-arr[i])>c) continue;
                    count++;
                }

            }
        }
        return count;

//        Best solution
//        int n = arr.length;
//        int ans = 0;
//        int[] pre = new int[1001];
//        int[] post = new int[1001];  // stores suffix sum
//        pre[arr[0]] = 1;
//        for(int i = n-1; i > 1; i--) {
//            post[arr[i]]++;
//        }
//        for(int i = 1; i <= 1000; i++) {
//            post[i] = post[i-1] + post[i];
//        }
//
//        for(int j = 1; j < n-1; j++) {
//            int v = arr[j];
//            int p1 = Math.max(0, v-a);
//            int p2 = Math.min(1000, v+a);
//            int t1 = Math.max(0, v-b);
//            int t2 = Math.min(1000, v+b);
//
//            for(int s = p1; s <= p2; s++) {
//                if (pre[s] == 0) continue;
//                int m1 = Math.max(t1, s-c);
//                int m2 = Math.min(t2, s+c);
//                if (m2 >= m1) {
//                    if (m1 == 0) {
//                        ans += pre[s] * post[m2];
//                    } else {
//                        ans += pre[s] * (post[m2] - post[m1-1]);
//                    }
//                }
//            }
//            pre[v]++;
//            for(int i = arr[j+1]; i <= 1000; i++) {
//                post[i]--;
//            }
//        }
//        return ans;
    }
}
