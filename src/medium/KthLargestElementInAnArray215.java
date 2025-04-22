package medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        for (int num : nums) {
            queue.add(num);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.poll();
    }

    // Best solution
//    public int findKthLargest(int[] nums, int k) {
//        int[] count = new int[20001];
//
//        for (int num : nums)
//            count[num + 10000]++;
//
//        for (int i = count.length - 1; i >= 0; i--)
//            if (count[i] > 0) {
//                k -= count[i];
//                if (k <= 0) return i - 10000;
//            }
//
//        return -1;
//    }

    // Quick Select solution
//    public int findKthLargest(int[] nums, int k) {
//        List<Integer> numList = new ArrayList<>();
//        for (int i : nums) {
//            numList.add(i);
//        }
//        return quickSelect(numList, k);
//    }
//
//    public int quickSelect(List<Integer> numList, int k) {
//        int pivot = numList.get(new Random().nextInt(numList.size()));
//        List<Integer> left = new ArrayList<>();
//        List<Integer> middle = new ArrayList<>();
//        List<Integer> right = new ArrayList<>();
//        for (int i : numList) {
//            if (i < pivot)
//                left.add(i);
//            else if (i == pivot)
//                middle.add(i);
//            else
//                right.add(i);
//        }
//
//        if (k <= right.size()) {
//            return quickSelect(right, k);
//        } else if (k > (right.size() + middle.size())) {
//            return quickSelect(left, k - right.size() - middle.size());
//        }
//        return pivot;
//    }

}
