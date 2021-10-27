public class Search2Dmatrix2 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++) {
                int[] arr = matrix[i];
                if ((binarysearch(arr, target)) == true) {
                    return true;
                }
            }
            return false;
        }

        static boolean binarysearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target == arr[mid]) {
                    return true;
                }
            }
            return false;
        }
    }
}