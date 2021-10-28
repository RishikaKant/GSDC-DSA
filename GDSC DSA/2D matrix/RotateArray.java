public class RotateArray {
    class Solution {
        public void rotate(int[][] nums) {

            int n = nums.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = temp;
                }
            }
            int li = 0;
            int ri = n - 1;

            while (li <= ri) {
                for (int i = 0; i < n; i++) {
                    int temp = nums[i][li];
                    nums[i][li] = nums[i][ri];
                    nums[i][ri] = temp;
                }
                li++;
                ri--;
            }
        }
    }
}