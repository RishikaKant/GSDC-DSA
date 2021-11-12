public class FindRotation {
    class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            for (int i = 0; i < 4; i++) {
                if (compare(mat, target) == true) {
                    return true;
                }
                rotate(mat);
            }
            return false;
        }

        public void rotate(int[][] mat) {

            int n = mat.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            int li = 0;
            int ri = n - 1;

            while (li <= ri) {
                for (int i = 0; i < n; i++) {
                    int temp = mat[i][li];
                    mat[i][li] = mat[i][ri];
                    mat[i][ri] = temp;
                }
                li++;
                ri--;
            }
        }

        boolean compare(int[][] arr, int[][] target) {
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] != target[i][j]) {
                        return false;
                    }
                }
            return true;
        }
    }

}
