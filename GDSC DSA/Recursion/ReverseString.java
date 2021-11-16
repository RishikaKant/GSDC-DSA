import java.util.*;

public class ReverseString {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] A = reverse(arr, 0);
        System.out.println(Arrays.toString(A));
    }

    static int[] reverse(int[] arr, int idx) {
        int n = arr.length;

        if (idx == n / 2) {
            return arr;
        }

        int temp = arr[idx];
        arr[idx] = arr[n - idx - 1];
        arr[n - idx - 1] = temp;

        int[] ans = reverse(arr, idx + 1);
        return ans;
    }

}