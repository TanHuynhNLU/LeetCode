package medium;

import java.util.*;

public class FindKPairsWithSmallestSums373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<Pair> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.sum, o2.sum));
        Set<Pair> visited = new HashSet<>();

        queue.add(new Pair(nums1[0] + nums2[0], 0, 0));
        visited.add(new Pair(nums1[0] + nums2[0], 0, 0));
        int count = 0;
        while (count < k && !queue.isEmpty()) {
            Pair firstE = queue.poll();
            int i = firstE.i;
            int j = firstE.j;
            res.add(List.of(nums1[i], nums2[j]));

            if (i + 1 < m && !visited.contains(new Pair(nums1[i + 1] + nums2[j], i + 1, j))) {
                queue.add(new Pair(nums1[i + 1] + nums2[j], i + 1, j));
                visited.add(new Pair(nums1[i + 1] + nums2[j], i + 1, j));
            }
            if (j + 1 < n && !visited.contains(new Pair(nums1[i] + nums2[j + 1], i, j + 1))) {
                queue.add(new Pair(nums1[i] + nums2[j + 1], i, j + 1));
                visited.add(new Pair(nums1[i] + nums2[j + 1], i, j + 1));
            }
            count++;
        }
        return res;
    }

    private class Pair {
        int sum;
        int i;
        int j;

        public Pair(int sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return sum == pair.sum && i == pair.i && j == pair.j;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sum, i, j);
        }
    }

    // Runtime: 2ms
//    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        List<List<Integer>> ans = new ArrayList<>(k);
//        int[] indexes = new int[nums1.length];
//
//        while (k-- > 0) {
//            int minSum = Integer.MAX_VALUE;
//            int nums1Id = -1;
//            int nums2Id = -1;
//
//            for (int i = 0; i < nums1.length; i++) {
//                if (indexes[i] == nums2.length) continue;
//
//                int sum = nums1[i] + nums2[indexes[i]];
//
//                if (sum < minSum) {
//                    minSum = sum;
//                    nums1Id = i;
//                    nums2Id = indexes[i];
//                }
//
//                if (indexes[i] == 0) break;
//            }
//
//            if (nums1Id < 0) break;
//
//            ans.add(Arrays.asList(nums1[nums1Id], nums2[nums2Id]));
//
//            indexes[nums1Id]++;
//        }
//
//        return ans;
//    }
}
