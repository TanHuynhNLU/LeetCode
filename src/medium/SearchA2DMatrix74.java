package medium;

public class SearchA2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0, right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean isSearch = searchArray(matrix[mid], target);
            if (isSearch) {
                return true;
            }
            if (matrix[mid][0] > target) {
                right = mid - 1;
            }
            if (matrix[mid][0] < target) {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean searchArray(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return false;
    }

    //    Best Solution
//    public boolean searchMatrix(int[][] matrix, int target) {
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        int left = 0;
//        int right = m * n - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            int row = mid / m;
//            int col = mid % m;
//            int midValue = matrix[row][col];
//
//
//            if (midValue == target) {
//                return true;
//            } else if (midValue < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    }
}
